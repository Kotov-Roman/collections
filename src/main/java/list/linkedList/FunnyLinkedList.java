package list.linkedList;

public interface FunnyLinkedList<E> {

  void addFirst(E element);

  void addLast(E element);

  void add(int index, E element);

  void removeFirst(int index);

  void removeLast(int index);

  void remove(E element);

  E get(int index);

}
