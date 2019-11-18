package list.dynamicArray;

public class DynamicList<E> implements MyList<E> {

  private Object[] array;
  private int size;

  private final static float INCREASE_CONST = 1.5f;

  public DynamicList() {
    array = new Object[10];
  }

  public DynamicList(int size) {
    array = new Object[size];
  }

  public int size() {
    return size;
  }

  public void add(E element) {
    array[size] = element;
    ensureCapacity();
    size++;
  }

  public void add(int index, E element) {

    Object[] result = new Object[array.length + 1];// add place for an element

    System.arraycopy(array, 0, result, 0, index - 1); //first part of arr
    System.arraycopy(array, index - 1, result, index, array.length - index); //first part of arr

    result[index - 1] = element;// assign element value
    size++;
    array = result;
  }

  public void remove(int index) {

    Object[] result = new Object[array.length - 1];// remove place for an element

    System.arraycopy(array, 0, result, 0, index - 1); //first part of arr
    System.arraycopy(array, index, result, index - 1, array.length - index - 1); //first part of arr

    size--;
    array = result;
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {

    return (E) array[index];
  }

  private void ensureCapacity() {

    int capacity = array.length;
    if (capacity - 1 <= size) {
      expandArray();
    }
  }

  private void expandArray() {
    Object[] expandedArray = new Object[(int) (size * INCREASE_CONST)];

    System.arraycopy(array, 0, expandedArray, 0, array.length);

    array = expandedArray;
  }

}
