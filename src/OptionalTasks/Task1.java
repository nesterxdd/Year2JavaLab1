package OptionalTasks;

import java.util.Scanner;
import util.LinkedListStack;
import util.Stack;


public class Task1 {
        public static void main(String[] args){

            System.out.println(checkString(read()));

    }


    public static String read(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = reader.nextLine();
        if(line.length() < 1000 && !line.isEmpty()){
            return line;
        }
        throw new UnsupportedOperationException("string of characters of length N (0 < N <= 1000)");

    }
    
    public static boolean checkString(String line){
            Stack<Character> stack = new LinkedListStack<>(); //[][()(}

            for(int i = 0; i < line.length(); i++){
                if(stack.isEmpty()){
                    stack.push(line.charAt(i));
                } else if ((stack.peek() == '{' && line.charAt(i) == '}')
                        || (stack.peek() == '(' && line.charAt(i) == ')')
                        || (stack.peek() == '[' && line.charAt(i) == ']')) {
                    stack.pop();
                } else {
                    stack.push(line.charAt(i));
                }
            }
            return stack.isEmpty();
    }
}
