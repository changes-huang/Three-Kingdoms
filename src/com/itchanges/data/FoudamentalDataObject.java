package com.itchanges.data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changes-huang
 * @time   2022.05.31
 * @usage  this is the fundamental data object for the service data, it defines the basic method, property for the other service data objects
 * */
public class FoudamentalDataObject {
    protected Map<String, Object> map = new HashMap<>();

    protected void set(String string, Object object) {
        map.put(string, object);
    }

    protected Object get(String string) {
        return map.get(string);
    }
}
