import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Raccolta {
    ArrayList<Videogames> lista;
    

    public Raccolta(String file){
        File f = new File(file);
        lista = new ArrayList<Videogames>();

        try {
            Scanner fileInput = new Scanner(f);
            while (fileInput.hasNextLine()) {
                String[] field = fileInput.nextLine().split(";");
                lista.add(new Videogames(field[0], field[1], Float.parseFloat(field[2]), Integer.parseInt(field[3])));
            
            }
            fileInput.close();

        }catch (Exception e) {
            System.out.println("Errore nella lettura del file");
        }
    }

    public String toString() {
        String s = "Elementi della lista: \n";
        for(int i = 0; i < lista.size(); i++){
            s += lista.get(i) + "\n";
        }
        return s;
    }
}