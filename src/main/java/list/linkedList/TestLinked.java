package list.linkedList;

public class TestLinked {

    public static void main(String[] args) {
        FunnyLinkedList<Integer> list = new MyLinkedList<>();
        FunnyLinkedList<Integer> list2 = new MyLinkedList<>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.add(2, 777);
        System.out.println(list.size());
        System.out.println(list);

        list2.add(0, 3);
        list2.add(0, 4);
        list2.add(0, 5);
        list2.add(0, 6);
        list2.addLast(666);
        list2.addFirst(111);
        System.out.println(list2);
    }
}
