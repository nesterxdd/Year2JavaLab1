package OptionalTasks;
import util.Queue;
import util.LinkedListQueue;
import util.ArrayQueue;


public class Task2 {
    public static void main(String[] args){
            Queue<Integer> queue = new ArrayQueue<>();
            getQueue(queue);
            int k = 4;
            Queue<Double> result = getResult(queue, k);

    }

    public static void getQueue(Queue<Integer> queue){
       int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}; // WRITE YOUR TEST DATA HERE
        for (int number : numbers) {
            queue.enqueue(number);
        }
    }

    public static Queue<Double> getResult(Queue<Integer> queue, int k){
            Queue<Double> result = new ArrayQueue<>();
            Queue<Integer> deletedElements = new ArrayQueue<>();
            double sum = 0;
            for(int i = 0; i < k; i++){
                int element = queue.dequeue();
                sum += element;
                deletedElements.enqueue(element);
            }

            for(int i = 0; i < k; i++){
                result.enqueue(sum / k);

            }

            while(!queue.isEmpty()){
                sum -= deletedElements.dequeue();
                int element = queue.dequeue();
                sum += element;
                deletedElements.enqueue(element);
                result.enqueue(sum/k);

            }

            return result;
    }


}
