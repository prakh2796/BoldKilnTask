package flower_task.prakhar.example.com.boldkiln;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 * Created by Prakhar Gupta on 12/11/2016.
 */

public class FlowerListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;
    private List<Flower.DataBean> flowerList;
    private ArrayList<Flower.DataBean> arraylist;

    public FlowerListAdapter(Context context, List<Flower.DataBean> flowerList) {
        this.context = context;
//        this.flowerList = flowerList;
        this.flowerList = new ArrayList<Flower.DataBean>();
        this.flowerList.addAll(flowerList);
        this.arraylist = new ArrayList<Flower.DataBean>();
        this.arraylist.addAll(flowerList);
    }

    @Override
    public int getCount() {
        return flowerList.size();
    }

    @Override
    public Object getItem(int i) {
        return flowerList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        view = inflater.inflate(R.layout.flower_item, null);
        holder = new ViewHolder();
        holder.flowerName = (TextView) view.findViewById(R.id.flower_name);
        holder.flowerImage = (ImageView) view.findViewById(R.id.flowerImage);
        holder.share = (ImageView) view.findViewById(R.id.share);
        holder.bookmark = (ImageView) view.findViewById(R.id.bookmark);
        view.setTag(holder);
        final Flower.DataBean flower = flowerList.get(i);
        if(flower != null) {
            holder.flowerName.setText(flower.getName());
            Glide.with(context).load(flower.getUrl())
                    .crossFade()
                    .thumbnail(0.5f)
                    .bitmapTransform(new CircleTransform(context))
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.flowerImage);
        }

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shareBody = "Flower Name- " + flowerList.get(i).getName() + "\n\nImage Link- " + flowerList.get(i).getUrl();
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                Intent new_intent = Intent.createChooser(shareIntent, "Share via");
                new_intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(new_intent);
            }
        });
        return view;
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        flowerList.clear();
        if (charText.length() == 0) {
            flowerList.addAll(arraylist);
        } else {
            for (Flower.DataBean fp : arraylist) {
                if(fp != null) {
                    Log.d("500", fp.getName());
                    if (fp.getName().toLowerCase(Locale.getDefault())
                            .contains(charText)) {
                        flowerList.add(fp);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    public void sortAscending(Flower.DataBean[] dataBean) {
        for (int i = 0; i < Arrays.asList(dataBean).size(); i++) {
            if (dataBean[i] != null) {
                Collections.sort(Arrays.asList(dataBean), new Comparator<Flower.DataBean>() {
                    @Override
                    public int compare(Flower.DataBean s1, Flower.DataBean s2) {
                        if (s1 != null && s2 != null) {
                            return s1.getName().compareToIgnoreCase(s2.getName());
                        }
                        return 0;
                    }
                });
            }
        }
        for (int i = 0; i < Arrays.asList(dataBean).size(); i++) {
            if (dataBean[i] != null) {
                System.out.println(dataBean[i].getName());
            }

        }
        flowerList.clear();
        flowerList.addAll(Arrays.asList(dataBean));
        this.notifyDataSetChanged();
    }

    public void sortDescending(Flower.DataBean[] dataBean) {
        for(int i=0; i < Arrays.asList(dataBean).size(); i++) {
            if (dataBean[i] != null) {
                Collections.sort(Arrays.asList(dataBean), new Comparator<Flower.DataBean>() {
                    @Override
                    public int compare(Flower.DataBean s1, Flower.DataBean s2) {
                        if(s1 != null && s2 != null) {
                            return s1.getName().compareToIgnoreCase(s2.getName());
                        }
                        return 0;
                    }
                });
            }
        }
        Collections.reverse(Arrays.asList(dataBean));
        for(int i=0; i < Arrays.asList(dataBean).size(); i++){
            if (dataBean[i] != null) {
                System.out.println(dataBean[i].getName());
            }
        }
        flowerList.clear();
        flowerList.addAll(Arrays.asList(dataBean));
        this.notifyDataSetChanged();
    }

    static class ViewHolder
    {
        TextView flowerName;
        ImageView flowerImage,share,bookmark;
    }

}
