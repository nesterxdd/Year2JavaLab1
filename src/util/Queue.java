package util;

public interface Queue<E>{
    void enqueue(E item);
    E dequeue();
    E peek();
    boolean isEmpty();


}
