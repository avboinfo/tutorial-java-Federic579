
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
        String s = "Il contenuto della pila:\n";
        for (int i=0; i<list.size(); i++) {
            s += list.get(i) + "\n";
        }
        return s;
    }    
    
}
