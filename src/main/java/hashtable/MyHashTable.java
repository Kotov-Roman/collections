package hashtable;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public interface MyHashTable <E> {

    HashMap

    void add (String key, E value);

    void remove (String key);

    E get(String key);

    int size();
}
