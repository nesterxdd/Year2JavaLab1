package util;
import util.LinkedList;


public class LinkedListQueue<E extends Comparable<E>> implements Queue<E>{
    private final LinkedList<E> linkedList;

    public LinkedListQueue(){
        linkedList = new LinkedList<>();
    }

    @Override
    public void enqueue(E item){
            linkedList.add(item);
    }

    @Override
    public E dequeue(){
        if(!linkedList.isEmpty()) {
            return linkedList.remove(0);
        }
        return null;
    }

    @Override
    public E peek(){
        if(!linkedList.isEmpty()){
            return linkedList.get(0);
        }
        return null;
    }

    @Override
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }


}
