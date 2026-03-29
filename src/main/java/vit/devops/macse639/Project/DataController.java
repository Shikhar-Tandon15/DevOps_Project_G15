package vit.devops.macse639.Project;

import java.util.HashMap;
import java.util.Map;

public class DataController extends DialogBox {
    private Map<String, String> dataStore;

    public DataController(String title, String message) {
        super(title, message);
        this.dataStore = new HashMap<>();
    }

    public void save(String key, String value) {
        dataStore.put(key, value);
        System.out.println("Saved: " + key + " = " + value);
    }

    public String load(String key) {
        return dataStore.getOrDefault(key, null);
    }

    public boolean containsKey(String key) {
        return dataStore.containsKey(key);
    }
}