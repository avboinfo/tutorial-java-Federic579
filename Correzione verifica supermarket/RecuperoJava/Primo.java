public class Primo {
    public static void main(String args[]){
        String str = "abc";
        //String pippo = "def";
        String pippo = str.replace('a', 'b');

        //str.replace('a', 'b'); //Questo sbagliato
        //System.out.println(str.replace('a', 'b')); //Questo giusto



        System.out.println(pippo);
        System.out.println(str);
        //System.out.println(str + pippo);
        //System.out.println("" + (4 + 6));
    }
}
