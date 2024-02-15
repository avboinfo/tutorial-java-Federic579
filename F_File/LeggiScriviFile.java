package F_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LeggiScriviFile {
    public void scriviFile(String filename) {
        File f = new File(filename);
        try {
            PrintWriter pw = new PrintWriter(f);
            for(int i = 0; i < 10; i++){
                pw.printf("%f %f\n", Math.random()*10, Math.random()*10);
            }
            pw.close();

        } catch (FileNotFoundException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
    public static void main( String[] args ) {
        System.out.println("\nProgram started\n");
        LeggiScriviFile lsf = new LeggiScriviFile();
        lsf.scriviFile("F_File/LeggiScriviFile.txt");
        
    }
}