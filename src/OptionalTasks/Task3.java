package OptionalTasks;
import util.Queue;
import util.LinkedListQueue;
import com.ktu.Document;

public class Task3 {
    public static void main(String[] args){
        Queue<Document> documents = new LinkedListQueue<>();
        getData(documents);
        Queue<Document> result = print(documents);

    }

    public static void getData(Queue<Document> documents ){
        documents.enqueue(new Document(3, "title1"));
        documents.enqueue(new Document(1, "title2"));
        documents.enqueue(new Document(2, "title3"));
        documents.enqueue(new Document(1, "title4"));


        //documents.enqueue(new Document(1, "title1"));
        //documents.enqueue(new Document(1, "title2"));
        //documents.enqueue(new Document(1, "title3"));
    }

    public static Queue<Document> print(Queue<Document> documents){
            Queue<Document> result = new LinkedListQueue<>();
            while(!documents.isEmpty()){
                Document element = documents.dequeue();
                if(!element.isCompleted()){
                    element.addPage();
                    documents.enqueue(element);
                    System.out.printf(element.toString());
                }else{
                    result.enqueue(element);
                }

            }
            return result;
    }


}
