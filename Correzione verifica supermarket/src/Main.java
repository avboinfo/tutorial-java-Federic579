/*
 * Federico Tung 4C IN 12/04/2024
 * 
 * Verifica Supermercato
 */

 import java.util.*;
 
 public class Main{
     public static void main(String[] args) {

         Spesa lista = new Spesa();
         Scanner keyInput = new Scanner(System.in);
     
         Spesa spesa = new Spesa();
 
         int scelta = 0;
             do {
                 System.out.println("1. Aggiungi un codice all'elenco di prodotti");
                 System.out.println("2. Eliminazione dell'ultimo prodotto inserito nell'elenco");
                 System.out.println("3. Eliminazione di un prodotto dall'elenco, dato il suo codice");
                 System.out.println("4. Calcolo del costo totale dei prodotti presenti nell'elenco");
                 System.out.println("5. Stampa dell'elenco a video e salvataggio in un file spesa.txt");
 
                 scelta = keyInput.nextInt();
                 keyInput.nextLine();
 
                 switch (scelta) {
                     case 1:
                         System.out.println("Metti codice prodotto: ");
                         String codice = keyInput.nextLine();
                         System.out.println("Metti descrizione prodotto: ");
                         String descrizione = keyInput.nextLine();
                         System.out.println("Metti prezzo prodotto: ");
                         double prezzo = keyInput.nextDouble();
                         keyInput.nextLine();
                         lista.addProdotto(new Prodotto(codice, descrizione, prezzo));
                         System.out.println("Prodotto aggiunto con successo");
                         break;
                      case 2:
                         spesa.delLastProd();
                         System.out.println("Ultimo prodotto eliminato");
                         break;
/*                     case 3:
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
                         System.out.println("Scelta non valida. Riprovare.");*/
                 }
 
             } while (scelta != 0);
             keyInput.close();
         }
     }
 