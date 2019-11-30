package list.linkedList;

public class MyLinkedList<E> implements FunnyLinkedList<E> {


    private MyNode<E> headNode;
    private MyNode<E> tailNode;
    private int size;

    public MyLinkedList() {
        MyNode<E> head = new MyNode<E>();
        head.name = "head";
        MyNode<E> tail = new MyNode<E>();
        tail.name = "tail";
        headNode = head;
        tailNode = tail;
        headNode.setNext(tailNode);
        tailNode.setPrevious(headNode);
    }

    @Override
    public void addFirst(E element) {

        if (size == 0) {
            MyNode<E> firstNode = new MyNode<>(headNode, tailNode, element);
            headNode.next = firstNode;
            tailNode.previous = firstNode;
        } else {
            MyNode<E> second = headNode.next;
            MyNode<E> firstNode = new MyNode<>(headNode, second, element);
            headNode.next = firstNode;
            second.previous = firstNode;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        if (size == 0) {
            MyNode<E> lastNode = new MyNode<>(headNode, tailNode, element);
            headNode.next = lastNode;
            tailNode.previous = lastNode;
        } else {
            MyNode<E> penultimate = tailNode.previous;
            MyNode<E> lastNode = new MyNode<>(penultimate, tailNode, element);
            tailNode.previous = lastNode;
            penultimate.next = lastNode;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
      MyNode<E> nodeAfterInserted = getMyNode(index);
      MyNode<E> previous = nodeAfterInserted.previous;
      MyNode<E> insertedNode = new MyNode<>(previous, nodeAfterInserted, element);
      previous.next = insertedNode;
      nodeAfterInserted.previous = insertedNode;
      size++;
    }

    @Override
    public void removeFirst(int index) {

    }

    @Override
    public void removeLast(int index) {

    }

    @Override
    public void remove(E element) {

    }

    @Override
    public E get(int index) {
      MyNode<E> node = getMyNode(index);
      return node.value;
    }

  private MyNode<E> getMyNode(int index) {
    if (index > size) {
        throw new RuntimeException("index out of size:" + " size = " + size + " index = " + index);
    }
    MyNode<E> current = headNode;
    for (int i = 0; i <= index; i++) {
        current = current.next;
    }
    return current;
  }

  @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            Object temp = get(i);
            result.append(temp.toString()+", ");
        }
        return result.toString();
    }

    public int size() {
        return size;
    }
}
