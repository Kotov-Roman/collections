package list.dynamicArray;

public interface MyList<E> {

  int size();

  void add(E element);

  void add(int index, E element);

  void remove(int index);

  E get(int index);
}
