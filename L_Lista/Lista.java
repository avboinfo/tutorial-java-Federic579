package L_Lista;

import java.util.Iterator;

public class Lista {

    class Iteratore{
        private Nodo nodo;

        private Iteratore(Nodo nodo){
            this.nodo = nodo;
        }

        public boolean hasNext(){
            return nodo != null;
        }

        public Nodo next(){
            if(nodo == null){
                return null;
            }

            Nodo result = new Nodo(nodo.getValore(), nodo.getSuccessivo());
            return result;
        }
    }


    public Iteratore getIterator(){
        Iteratore i = new Iteratore(radice);
        return i;
    }


    Nodo radice;
    
    public Lista() {
        radice = null;
    }


    public boolean isEmpty() {
        return radice==null;
    }


    public void addTail( Nodo n ) {
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo p = radice;
            while (p.getSuccessivo()!=null) p = p.getSuccessivo();
            p.setSuccessivo( n );
        }
    }


    public void addHead( Nodo n){
        if(isEmpty()){
            radice = n;
        } else{
            n.setSuccessivo(radice);
            radice = n;
        }
    }


    public void addSorted( Nodo n){
        if ( isEmpty()){
            radice = n;
            n.setSuccessivo(null);
            return;
        }

        int vN = n.getValore();
        if (vN < radice.getValore()) {
            n.setSuccessivo(radice);
            radice = n;
            return;
        }
        
        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();

        while (p2 != null && vN > p2.getValore()) {
            p1 = p2;
            p2 = p1.getSuccessivo();
        }
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
    }


    boolean addAfter(Nodo n, int pos){
        if (isEmpty()) {
        return false;
        } else{
            Nodo iniziale = radice;
            int count = 0;

            while(iniziale != null){
                if(count == pos){
                    Nodo nextNode = iniziale.getSuccessivo();
                    iniziale.setSuccessivo(n);
                    n.setSuccessivo(nextNode);
                    return true;
                }

                iniziale = iniziale.getSuccessivo();
                count++;
            }

            return false;
        }

        /*addAfter del prof:
        public boolean addAfter(int pos, Nodo n){
            Iteratore iter = this.getIterator();
            int i;
            Nodo npos;
            for(i = 0; i < pos; i++){
                if (iter.hasNext()) {
                    npos = iter.next();
                } else{
                    return false;
                }
            }
            n.setSuccessivo(npos.getSuccessivo());
            npos.setSuccessivo(n);
            return true;

            
        }
        */
    }

    boolean remove_Pos(int pos){

    }

    boolean removeValue(int value){
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (i == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false; // il valore da rimuovere non è presente nell'array
        }
        
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        
        array[array.length - 1] = 0; // rimuovi l'ultimo elemento

        return true;
    }
    

    public String toString() {
        String s = "Elementi della lista: ";
        Nodo p = radice;
        while (p!=null) {
            s += p + " ";
            p = p.getSuccessivo();
        }
        s += "End!\n";
        return s;
    }
}