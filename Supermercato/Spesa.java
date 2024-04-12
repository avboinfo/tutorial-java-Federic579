package Supermercato;

import java.io.*;

public class Spesa {
    Nodo head;
    double costoTot;
    
    public void addProdotto(Prodotti prodotto) {
        Nodo nodoSuccessivo = new Nodo(prodotto);
        nodoSuccessivo.next = head;
        head = nodoSuccessivo;
        costoTot += prodotto.getCosto();
    }
    
    public void delLastProd() {
        if (head != null) {
            costoTot -= head.prodotto.getCosto();
                head = head.next;
        }
    }
    
    public void eliminaProdotto(String codice) {
        Nodo tmp = head;
        Nodo prevProd = null;
    
        while (tmp != null && !tmp.prodotto.getCodice().equals(codice)) {
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

    
    class Nodo {
        public Object codice;
        Prodotti prodotto;
        Nodo next;
        
        public Nodo(Prodotti prodotto) {
            this.prodotto = prodotto;
            this.next = null;
        }
    }
}

