package list.linkedList;

public class MyNode<E> {

  MyNode previous;
  MyNode next;
  E value;
  String name;

  public MyNode() {
  }

  public MyNode(MyNode previous, MyNode next, E value) {
    this.previous = previous;
    this.next = next;
    this.value = value;
  }

  public MyNode getPrevious() {
    return previous;
  }

  public void setPrevious(MyNode previous) {
    this.previous = previous;
  }

  public MyNode getNext() {
    return next;
  }

  public void setNext(MyNode next) {
    this.next = next;
  }

  public E getValue() {
    return value;
  }

  public void setValue(E value) {
    this.value = value;
  }

  @Override
  public String toString() {
    if (value != null) {
      return value.toString();
    }
    if (name != null) {
      return name;
    }
    else {
      return "undefined";
    }
  }
}
