package L_Lista;

public class Main {
    
    public static void main (String[] args) {
        System.out.println("Partiti!");
        
        Lista l = new Lista();
        System.out.println( l );

        for (int i=0; i<10; i++) {
            l.addTail( new Nodo( i, null ));
        }

        l.addHead(new Nodo(2024, null));

        System.out.println( l );
    

        l.addSorted(new Nodo(300, null));
        l.addSorted(new Nodo(250, null));
        l.addSorted(new Nodo(350, null));
        l.addSorted(new Nodo(320, null));
        l.addSorted(new Nodo(100, null));
        l.addSorted(new Nodo(290, null));
        l.addSorted(new Nodo(450, null));

        System.out.println(l);

        l.addAfter(3, new Nodo(1492, null));
        System.out.println(l);
    }

}