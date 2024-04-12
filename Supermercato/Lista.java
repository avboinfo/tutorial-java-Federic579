package Supermercato;

public class Lista {
        Nodo testa;
    
        public Lista() {
            this.testa = null;
        }
    
        public Nodo getTesta() {
            return testa;
        }
    
        public void aggiungiInTesta(Nodo nuovoNodo) {
            if (testa == null) {
                testa = nuovoNodo;
            } else {
                nuovoNodo.setSuccessivo(testa);
                testa = nuovoNodo;
            }
        }
    
        public void eliminaInTesta() {
            if (testa != null) {
                testa = testa.getSuccessivo();
            }
        }
    
        public void eliminaNodo(String codice) {
            Nodo tmp = testa;
            Nodo prev = null;
            while (tmp != null) {
                if (tmp.getProd().getCodice().equals(codice)) {
                    if (prev == null) {
                        testa = tmp.getSuccessivo();
                    } else {
                        prev.setSuccessivo(tmp.getSuccessivo());
                    }
                    break;
                }
                prev = tmp;
                tmp = tmp.getSuccessivo();
            }
        }
    
        public void stampaLista() {
            Nodo tmp = testa;
            System.out.println("Lista della spesa:");
            while (tmp != null) {
                System.out.println(tmp.getProd().getDescrizione() + " - " + tmp.getProd().getCosto());
                tmp = tmp.getSuccessivo();
        }
    }
}
