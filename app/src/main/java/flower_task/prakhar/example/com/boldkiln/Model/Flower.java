package flower_task.prakhar.example.com.boldkiln.Model;

import java.util.List;

/**
 * Created by Prakhar Gupta on 12/11/2016.
 */

public class Flower {


    /**
     * result : 1
     * data : [{"id":1,"name":"Aconitum","url":"https://upload.wikimedia.org/wikipedia/commons/7/7e/Aconitum_degenii.jpg"},{"id":2,"name":"African lily","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2014/09/1040668-90x90.jpg?ssl=1"},{"id":3,"name":"Alpine thistle","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2014/09/1040668-90x90.jpg?ssl=1"},{"id":4,"name":"Amaryllis","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20071203-2ADQ3127.jpg"},{"id":5,"name":"Amazon lily","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070520-2ADQ0283.jpg"},{"id":6,"name":"Arum Lily","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070520-2ADQ0283.jpg"},{"id":7,"name":"Baby\u2019s breath","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040642-3.jpg"},{"id":8,"name":"Barberton","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040696.jpg"},{"id":9,"name":"Bell Flower/Canterbury Bells","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070612-2ADQ8027-3.jpg"},{"id":10,"name":"Bells of Ireland","url":"http://www.all-my-favourite-flower-names.com/images/128xNx800px-Amaryllis_hippeastrum_-_Candy_floss.jpg.pagespeed.ic.6UhpYa7xqv.jpg"},{"id":11,"name":"Bird of paradise","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040642-3.jpg"},{"id":12,"name":"Bleeding Heart","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/IMG_51222006.jpg"},{"id":13,"name":"Bloom","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1050246.jpg?w=1020"},{"id":14,"name":"Blue throatwort","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1050524-2.jpg?w=1020"},{"id":15,"name":"Broom","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1050524-2.jpg?w=1020"},{"id":16,"name":"Calla lily","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070817-2ADQ0830.jpg"},{"id":17,"name":"Canterbury Bells/Bell Flower","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070612-2ADQ8027-3.jpg"},{"id":18,"name":"Carnation","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040639-3.jpg"},{"id":19,"name":"Chincerinchee","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040516-3.jpg"},{"id":20,"name":"Christmas rose","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040516-3.jpg"},{"id":21,"name":"Cockscomb","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040882.jpg"},{"id":22,"name":"Coneflower","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/IMG_16122006.jpg"},{"id":23,"name":"Cornflower","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/IMG_42752006-2.jpg"},{"id":24,"name":"Daffodil","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20090309-_MG_4656.jpg"},{"id":25,"name":"Evening primrose","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20090309-_MG_4656.jpg"},{"id":26,"name":"Feverfew","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20090309-_MG_4656.jpg"},{"id":27,"name":"Flame tip","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040862.jpg"},{"id":28,"name":"Flamingo flower/painter\u2019s palette","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040629-3.jpg"},{"id":28,"name":"Flamingo flower/painter\u2019s palette","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040629-3.jpg"},null,{"id":30,"name":"Forget-me-not","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/MG_39572006-2.jpg"},{"id":31,"name":"Foxglove","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070615-2ADQ8045-2.jpg"},{"id":32,"name":"Gay feather","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040837-2.jpg"},{"id":33,"name":"Globe thistle","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070819-2ADQ0862-2.jpg"},{"id":34,"name":"Golden rod","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040831-2.jpg"},{"id":35,"name":"Grape hyacinth","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040683.jpg"},{"id":36,"name":"Guernsey lily","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040683.jpg"},{"id":37,"name":"Hyacinth","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20090410-_MG_4997.jpg"},{"id":38,"name":"Iris","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/iris-2.jpg"},{"id":39,"name":"Jersey lily","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/iris-2.jpg"},{"id":40,"name":"Jersey lily","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/iris-2.jpg"},{"id":41,"name":"Lady\u2019s mantle","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040660-2.jpg"},{"id":42,"name":"Larkspur","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070615-2ADQ8049.jpg"},{"id":43,"name":"Lavender","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040856.jpg?w=1020g"},{"id":44,"name":"Lilac","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/img_40492006.jpg"},{"id":45,"name":"Lily","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070713-2ADQ9099.jpg"},{"id":46,"name":"Lisianthus","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040627-3.jpg"},{"id":47,"name":"Lobster claw","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040627-3.jpg"},{"id":48,"name":"Love in a mist","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/IMG_05152006.jpg"},{"id":49,"name":"Lupin","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040813-2.jpg"},{"id":50,"name":"Marigold","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040813-2.jpg"},{"id":51,"name":"Michaelmas Daisy","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040641-3.jpg"},{"id":52,"name":"Mimosa","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040641-3.jpg"},{"id":53,"name":"Mimosa","url":"http://i0.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040641-3.jpg"},{"id":54,"name":"Moth orchid","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/IMG_12672006.jpg"},{"id":55,"name":"Mums","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040625-3.jpg"},{"id":56,"name":"Peony","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040810-2.jpg"},{"id":57,"name":"Rose","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040655.jpg"},{"id":58,"name":"Rose","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040655.jpg"},{"id":59,"name":"Scabious","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040832.jpg"},{"id":60,"name":"Snapdragon","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/1040869-2.jpg?w=1020"},{"id":61,"name":"Tulip","url":"http://i2.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070414-IMG_6097.jpg"},{"id":62,"name":"Waxflower","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070412-IMG_5755-2.jpg?w=1020"},{"id":62,"name":"Yarrow","url":"http://i1.wp.com/cottagegardenflowershop.co.uk/wp-content/uploads/2013/04/20070412-IMG_5755-2.jpg"}]
     */

    private int result;
    /**
     * id : 1
     * name : Aconitum
     * url : https://upload.wikimedia.org/wikipedia/commons/7/7e/Aconitum_degenii.jpg
     */

    private List<DataBean> data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String name;
        private String url;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
