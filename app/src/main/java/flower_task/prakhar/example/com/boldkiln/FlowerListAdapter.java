package flower_task.prakhar.example.com.boldkiln;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

/**
 * Created by Prakhar Gupta on 12/11/2016.
 */

public class FlowerListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;
    private List<Flower.DataBean> flowerList;

    public FlowerListAdapter(Context context, List<Flower.DataBean> flowerList) {
        this.context = context;
        this.flowerList = flowerList;
    }

    @Override
    public int getCount() {
        return flowerList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        view = inflater.inflate(R.layout.flower_item, null);
        TextView flowerName = (TextView) view.findViewById(R.id.flower_name);
        ImageView flowerImage = (ImageView) view.findViewById(R.id.flowerImage);
        Flower.DataBean flower = flowerList.get(i);
        if(flower != null) {
            flowerName.setText(flower.getName());
            Glide.with(context).load(flower.getUrl())
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(flowerImage);
        }
        return view;
    }
}
