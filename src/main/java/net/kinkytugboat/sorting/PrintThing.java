package net.kinkytugboat.sorting;

import java.util.ArrayList;

public enum PrintThing {
    INSTANCE;
    ArrayList<String> values;
    public void add(String text){
        values.add(text);
    }
    public String print(){
        return String.join("\n", values);
    }


}
