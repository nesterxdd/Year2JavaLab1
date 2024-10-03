package util;


import java.util.ArrayList;

public class ArrayStack <E extends Comparable<E>>
implements Stack<E>{

    private ArrayList<E> arrayList;

    public ArrayStack(){
        arrayList = new ArrayList<E>();
    }


    @Override
    public E pop() {
        if(!arrayList.isEmpty()){
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    @Override
    public void push(E item) {
        arrayList.add(item);
    }

    @Override
    public E peek() {
        if(!arrayList.isEmpty()){
            return arrayList.get(arrayList.size()-1);
        }
        return null;

    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }


}
