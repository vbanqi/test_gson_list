package test;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 *
 * Created by lvqiang on 15/12/18.
 */
public class ABaseItemSerializer implements JsonDeserializer<ABaseItem> {
    @Override
    public ABaseItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        ABaseItem item = null;
        if (jsonElement.isJsonObject()){
            JsonObject obj = jsonElement.getAsJsonObject();
            if (obj.has("type")){
                int t = obj.get("type").getAsInt();
                Gson son = new Gson();
                if (t == 0){
                     item = son.fromJson(jsonElement,SRPItem.class);
                }else if (t == 1){
                    item = son.fromJson(jsonElement,CircleItem.class);
                }
            }
        }
        return item;
    }

}
