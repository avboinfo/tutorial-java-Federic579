
import java.io.*;
import java.util.Scanner;

public class Spesa {
    Lista<Prodotto> carrello;
    Lista<Prodotto> anagrafica;

    public Spesa(){
        carrello = new Lista<>();
        anagrafica = new Lista<>();
        caricaProd();
        System.out.println(anagrafica);
    }

    public void caricaProd() {
        File f = new File("data/Prodotti.csv");
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                String[] field = scan.nextLine().split(";");
                anagrafica.addHead(new Prodotto(field[0], field[1], Double.parseDouble(field[2])));
            }
            scan.close();
        } catch (FileNotFoundException e) {
        System.out.println("Errore");
        }
    }

    @Override
    public String toString() {
        return "Carrello:\n" + carrello;
    }

    public void addProdotto(Prodotto prodotto) {
        carrello.addHead(prodotto);
    }
 
    public void delLastProd() {
        carrello.removeHead();
    }
/*    
    public void eliminaProdotto(String codice) {
        Nodo tmp = head;
        Nodo prevProd = null;
    
        while (tmp != null && !tmp.getCodice().(codice)) {
            prevProd = tmp;
            tmp = tmp.next;
        }
    
        if (tmp != null) {
            costoTot -= tmp.prodotto.getCosto();
            if (prevProd != null) {
                prevProd.next = tmp.next;
            } else {
                head = tmp.next;
            }
        }
    }
    
    public double calcolaCostoTot() {
        double costoTot = 0;
        Nodo tmp = head;

        while (tmp != null) {
            String costo = prodotto.get(tmp.codice).split(";");
            costoTot += Double.parseDouble(costo);
            tmp = tmp.next;
        }
        return costoTot;
    }
    
    public void stampaSpesa() {
        try {
            File file = new File("Lista.txt");
            FileWriter writer = new FileWriter(file);
    
            Nodo tmp = head;
    
            while (tmp != null) {
                System.out.println(tmp.prodotto.getDescrizione() + " " + tmp.prodotto.getCosto() + " €");
                writer.write(tmp.prodotto.getDescrizione() + " " + tmp.prodotto.getCosto() + " €" + "\n");
                tmp = tmp.next;
            }
    
            System.out.println("Costo totale: €" + costoTot);
            writer.write("Costo totale: €" + costoTot);
    
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
   /*  class Nodo {
        public Object codice;
        Prodotti prodotto;
        Nodo next;
        
        public Nodo(Prodotti prodotto) {
            this.prodotto = prodotto;
            this.next = null;
        }
 
    }*/
    
}

