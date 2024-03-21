package Recupero_Macchina_Autonoleggio;

public class Main {
    public static void main(String[] args) {
        Veicolo veicolo1 = new Veicolo("AB123CD", "Fiat", "500", 1200, 2019, 4);
        
        System.out.println("Veicolo1 Marca: " + veicolo1.getMarca());
        System.out.println("Veicolo1 Anno di Acquisto: " + veicolo1.getAnnoAcquisto());
    }
}
