package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Datetime: 2017/5/1619:50
 * <p>
 * http://www.vogella.com/tutorials/JavaLibrary-Gson/article.html
 */
@Data
public class Descriptions {

    private String title;

    private List<String> details;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public static void main(String[] args) {
        Descriptions d = new Descriptions();
        d.setTitle("新款商品");
        List<String> detail = new ArrayList<String>();
        detail.add("性价比高");
        detail.add("性价比高");
        detail.add("性价比高");
        detail.add("性价比高");
        detail.add("性价比高");
        d.setDetails(detail);

        Gson gson = new Gson();
        Type type = new TypeToken<Descriptions>() {
        }.getType();

        String json = gson.toJson(d, type);
        System.out.println(json);

        //{"title":"新款商品","details":["性价比高","性价比高","性价比高","性价比高","性价比高"]}
        Descriptions fromJson = gson.fromJson(json, type);

        System.out.println(fromJson);

        System.out.println("================");
        buyerNotes();


        System.out.println("=========list test=======");
        listTest();
    }

    public static void buyerNotes() {
        Descriptions d = new Descriptions();
        d.setTitle("注意事项");
        List<String> detail = new ArrayList<String>();
        detail.add("一切以店里实际情况为主");
        d.setDetails(detail);
        Gson gson = new Gson();
        Type type = new TypeToken<Descriptions>() {
        }.getType();

        String json = gson.toJson(d, type);
        System.out.println(json);


    }

    public static void listTest() {
        List<Descriptions> list = new ArrayList<Descriptions>();
        Descriptions d = new Descriptions();
        d.setTitle("注意事项");
        List<String> detail = new ArrayList<String>();
        detail.add("一切以店里实际情况为主");
        d.setDetails(detail);

        list.add(d);

        d = new Descriptions();
        d.setTitle("新款商品");
        detail = new ArrayList<String>();
        detail.add("性价比高");
        detail.add("性价比高");
        detail.add("性价比高");
        detail.add("性价比高");
        detail.add("性价比高");
        d.setDetails(detail);

        list.add(d);

        Gson gson = new Gson();
        Type type = new TypeToken<List<Descriptions>>() {}.getType();
        String json = gson.toJson(list, type);
        System.out.println(json);
        List<Descriptions> fromJson = gson.fromJson(json, type);

        for (Descriptions task : fromJson) {
            System.out.println(task);
        }

    }
}
