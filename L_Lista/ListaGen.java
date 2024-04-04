package L_Lista;

public class ListaGen<P> {
    
    NodoGen<P> root;

    public ListaGen(NodoGen<P> root) {
        this.root = root;
    }

    public void addTail(P v) {
        addTail(new NodoGen<P>(v));
    }

    public void addTail( NodoGen<P> n ) {

        if(root == null) {
            root = n;
        } else {

            NodoGen<P> temp = root;
            while (temp.getSuccessivo()!=null) {
                temp = temp.getSuccessivo();
            }
            temp.setSuccessivo( n );
        }
    }   

    public String toString() {
        String s = "\n****************************************************\n";
        NodoGen<P> temp = root;
        while ( temp!=null ){
            s += temp.getValore() + "\n";
            temp = temp.getSuccessivo();
        }
        s += "************************************* LIST END \n";
        return s;   
    }
}
