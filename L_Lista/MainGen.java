package L_Lista;

public class MainGen {
    public static void main(String[] args){
        NodoGen<String> n = new NodoGen<>("ForZA MAGICA ROMA");
        System.out.println( n );

        NodoGen<Float> nf = new NodoGen<>( (float)3.5 );
        System.out.println( nf);
    }
}
