/*
** classe stack
*/

package S_Stack;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Stack<T> {
    
    ArrayList<T> list;

    public Stack() {
        list = new ArrayList<T>();
    }
    
    public void push( T newElement ) {
        list.add(newElement); 
    }

    public T pop() {
        int size = list.size();
        if (size==0) return null;
        T x = list.get(size-1);
        list.remove(size-1);
        return x;
    }
    
    public String toString() {
        String s = "Contenuto della pila:\n";
        for (int i=0; i<list.size(); i++) {
            s += list.get(i) + "\n";
        }
        return s;
    }    
    
}

public class Reverse {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stack.push(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            while (!stack.isEmpty()) {
                String sentence = stack.pop();
                writer.write(sentence);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
