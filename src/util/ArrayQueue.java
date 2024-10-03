package util;
import java.util.ArrayList;

public class ArrayQueue<E extends Comparable<E>> implements Queue<E>{

    ArrayList<E> arrayList;
    private int first;


    public ArrayQueue(){
        arrayList = new ArrayList<>();
        first = 0;
    }
    @Override
    public void enqueue(E item){
        arrayList.add(item);
    }

    @Override
    public E dequeue(){
        if(!isEmpty()){
            return arrayList.get(first++);
        }
        return null;
    }

    @Override
    public E peek(){

        if(!isEmpty()) {
            return arrayList.get(first);
        }
        return null;
    }

    @Override
    public boolean isEmpty(){
        return first >= arrayList.size();
    }




}
