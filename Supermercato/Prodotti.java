package Supermercato;

import java.util.*;
import java.io.*;

public class Prodotti {
    String codice;
    String descrizione;
    double costo;

    public Prodotti(String codice, String descrizione, double costo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.costo = costo;
    }
    
    public String getCodice() {
        return codice;
    }
    
    public String getDescrizione() {
        return descrizione;
    }
    
    public double getCosto() {
        return costo;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }




    public static Prodotti[] caricaProd() {
        File f = new File("Prodotti.csv");
        try {
            Scanner scan = new Scanner(f);
            while (f.hasNextLine()) {
                String[] field = f.nextLine().split(";");
                Prodotti[] prodotto = new Prodotti[scan.nextInt()];
                for (int i = 0; i < prodotto.length; i++) {
                    prodotto[i] = new Prodotti(scan.next(), scan.next(), scan.nextDouble());
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
        System.out.println("Errore");
        }
    }
}


