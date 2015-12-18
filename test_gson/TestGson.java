package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvqiang on 15/12/18.
 */
public class TestGson {
    public static void main(String[] argv){
        List<ABaseItem> lists = new ArrayList<ABaseItem>();
        SRPItem item = new SRPItem();
        item.setInvoke(0);
        item.setType(0);
        item.setSrpId("abcdef123124");
        item.setKeyword("haha");
        lists.add(item);

        CircleItem item1 = new CircleItem();
        item1.setInvoke(0);
        item1.setType(1);
        item1.setBlogId(100);
        item1.setInterestId(1000);
        lists.add(item1);

        Gson son = new Gson();
        String json = son.toJson(lists);
        System.out.println(json);

        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(ABaseItem.class,new ABaseItemSerializer());
        son = builder.create();
        List<ABaseItem> ls = son.fromJson(json,new TypeToken<List<ABaseItem>>(){}.getType());
        System.out.println("wanbi");
    }
}
