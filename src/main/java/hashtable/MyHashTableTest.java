package hashtable;

public class MyHashTableTest {

    public static void main(String[] args) {
        MyHashTable<String, Integer> objectMyOwnHashTable = new MyOwnHashTable<>(10);
        objectMyOwnHashTable.put("lol", 1);
        objectMyOwnHashTable.put("lol", 3);
        Integer integer = objectMyOwnHashTable.get("lol");
        System.out.println(integer);

        ConstantHashcode first = new ConstantHashcode("first");
        ConstantHashcode second = new ConstantHashcode("second");

        MyHashTable<ConstantHashcode, Integer> mapWithConstantHashcode = new MyOwnHashTable<>(10);

        mapWithConstantHashcode.put(first, 1);
        mapWithConstantHashcode.put(second, 2);

        System.out.println(mapWithConstantHashcode.get(first));
        System.out.println(mapWithConstantHashcode.get(second));

//        objectMyOwnHashTable.put(first,);
//        objectMyOwnHashTable.put(second);
    }
}
