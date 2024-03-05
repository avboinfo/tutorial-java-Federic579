package S_Stack;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();
        File f = new File("S_Stack/ciao.txt");
        
        try {
            Scanner fileInput = new Scanner(f);
            String temp = "";

            while (fileInput.hasNextLine()) {
                temp = fileInput.nextLine();
                s.push(temp);
            }

            fileInput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String tempPop = "";
        int size = s.size();
        for (int i = 0; i < size; i++) {
            String buffer = "";
            tempPop = s.pop();
            for (int j = tempPop.length(); j > 0; j--) {
                buffer += tempPop.charAt(j-1);
            }
            System.out.println(buffer);
            try {
                File file = new File("nuovo.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(buffer);
            bw.flush();
            bw.close();
    }
    catch(IOException e) {
        e.printStackTrace();
    }
        }
    }
}