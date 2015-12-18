package test;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvqiang on 15/12/18.
 */
public abstract class ABaseItem {
    private int type;
    private int invoke;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getInvoke() {
        return invoke;
    }

    public void setInvoke(int invoke) {
        this.invoke = invoke;
    }



}
