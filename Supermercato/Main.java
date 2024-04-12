/*
 * Federico Tung 4C IN 12/04/2024
 * 
 * Verifica Supermercato
 */

package Supermercato;

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Prodotti prodotti = Prodotti.caricaProd();
    
        Spesa spesa = new Spesa();

        int scelta = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("1. Aggiungi un codice all'elenco di prodotti");
                System.out.println("2. Eliminazione dell'ultimo prodotto inserito nell'elenco");
                System.out.println("3. Eliminazione di un prodotto dall'elenco, dato il suo codice");
                System.out.println("4. Calcolo del costo totale dei prodotti presenti nell'elenco");
                System.out.println("5. Stampa dell'elenco a video e salvataggio in un file spesa.txt");

                scelta = Integer.parseInt(br.readLine());

                switch (scelta) {
                    case 1:
                        System.out.println("Metti codice prodotto: ");
                        String codice = br.readLine();
                        System.out.println("Metti descrizione prodotto: ");
                        String descrizione = br.readLine();
                        System.out.println("Metti prezzo prodotto: ");
                        double prezzo = Double.parseDouble(br.readLine());
                        spesa.addProdotto(prodotto);
                        System.out.println("Prodotto aggiunto con successo");
                        break;
                    case 2:
                        spesa.delLastProd();
                        System.out.println("Ultimo prodotto eliminato");
                        break;
                    case 3:
                        spesa.eliminaProdotto("001");
                        System.out.println("001 eliminato");
                        break;
                    case 4:
                        double costoTot = spesa.calcolaCostoTot();
                        System.out.println("Costo totale: " + costoTot);
                        break;
                    case 5:
                        spesa.stampaSpesa();
                        System.out.println("Spesa stampata in lista.txt");
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprovare.");
                }

            } while (scelta != 0);
        } catch (IOException e) {
            System.out.println("Errore di input/output. Riprovare.");
        }
    }
}
