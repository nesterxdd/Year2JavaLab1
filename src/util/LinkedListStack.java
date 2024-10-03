package util;
import util.LinkedList;


public class LinkedListStack<E extends Comparable<E>>
implements Stack<E>{

    private LinkedList<E> linkedList;

    public LinkedListStack(){
        linkedList = new LinkedList<>();
    }

    @Override
    public E pop() {
        if(isEmpty()){
            return null;
        }
        return linkedList.remove(linkedList.size() - 1);
    }

    @Override
    public void push(E item) {
        linkedList.add(item);
    }

    @Override
    public E peek() {
        if(!linkedList.isEmpty()){
            return linkedList.getLast();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }


}
