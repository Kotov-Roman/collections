package list.linkedList;

import java.util.LinkedList;
import javax.xml.soap.Node;

public class MyLinkedList<E> implements FunnyLinkedList<E> {


  private MyNode first;
  private MyNode last;
  private int size;


  public MyLinkedList() {
    MyNode head = new MyNode();
    head.name = "head";
    MyNode tail = new MyNode();
    tail.name = "tail";
    first = head;
    last = tail;
    first.setNext(last);
    last.setPrevious(first);
  }

  @Override
  public void addFirst(E element) {

    MyNode second = first;

    MyNode<E> newFirstNode = new MyNode<>(null, second, element);
    first = newFirstNode;

    second.setPrevious(first);
  }

  @Override
  public void addLast(E element) {
    MyNode penultimate = last;

    MyNode<E> newLastNode = new MyNode<>(penultimate, null, element);
    last = newLastNode;

    penultimate.setNext(newLastNode);
  }

  @Override
  public void add(int index, E element) {

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
    return null;
  }
}
