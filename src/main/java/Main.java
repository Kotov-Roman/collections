import list.dynamicArray.DynamicList;
import list.dynamicArray.MyList;

import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {

    MyList<Integer> myList = new DynamicList<>();
    for (int i = 0; i < 9  ; i++) {
      myList.add(i);
    }
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }
    System.out.println(myList.size()+ " is created size");

    myList.add(5, 777);

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }
    System.out.println(myList.size()+ " then 1 elelemnt added");

    System.out.println("remove");
    myList.remove(5);
//
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    System.out.println(myList.size()+ " then 1 element removed");
  }

}
