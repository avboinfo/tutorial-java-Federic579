package Recupero_Catalogo_PC2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        // Menu
        int scelta = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("1. Aggiungi computer");
                System.out.println("2. Elimina computer");
                System.out.println("3. Ricerca per codice");
                System.out.println("4. Ricerca per caratteristiche");
                System.out.println("5. Salva catalogo su file");
                System.out.println("6. Ripristina catalogo da file");
                System.out.println("0. Esci");

                scelta = Integer.parseInt(br.readLine());

                switch (scelta) {
                    case 1:
                        System.out.println("Inserire il codice del computer da aggiungere:");
                        String codice = br.readLine();
                        System.out.println("Inserire la marca del computer:");
                        String marca = br.readLine();
                        System.out.println("Inserire il modello del computer:");
                        String modello = br.readLine();
                        System.out.println("Inserire il prezzo del computer:");
                        double prezzo = Double.parseDouble(br.readLine());
                        System.out.println("Inserire le caratteristiche del computer:");
                        String caratteristiche = br.readLine();
                        catalogo.aggiungiComputer(new Computer(codice, marca, modello, prezzo, caratteristiche));
                        System.out.println("Computer aggiunto con successo.");
                        break;
                    case 2:
                        System.out.println("Inserire il codice del computer da eliminare:");
                        String codiceDaEliminare = br.readLine();
                        catalogo.eliminaComputer(codiceDaEliminare);
                        System.out.println("Computer eliminato con successo.");
                        break;
                    case 3:
                        System.out.println("Inserire il codice del computer da cercare:");
                        String codiceDaCercare = br.readLine();
                        Computer computerCercato = catalogo.ricercaPerCodice(codiceDaCercare);
                        if (computerCercato != null) {
                            System.out.println(computerCercato);
                        } else {
                            System.out.println("Computer non trovato.");
                        }
                        break;
                    case 4:
                        System.out.println("Inserire le caratteristiche desiderate:");
                        String caratteristicheDaCercare = br.readLine();
                        List<Computer> computerConCaratteristicheMigliori = catalogo.ricercaPerCaratteristiche(caratteristicheDaCercare);
                        if (computerConCaratteristicheMigliori.isEmpty()) {
                            System.out.println("Nessun computer trovato con caratteristiche migliori.");
                        } else {
                            System.out.println("Computer con caratteristiche migliori:");
                            for (Computer computer : computerConCaratteristicheMigliori) {
                                System.out.println(computer);
                            }
                        }
                        break;
                    case 5:
                        catalogo.salvaSuFile("catalogo.txt");
                        System.out.println("Catalogo salvato su file.");
                        break;
                    case 6:
                        catalogo.ripristinaDaFile("catalogo.txt");
                        System.out.println("Catalogo ripristinato da file.");
                        break;
                    case 0:
                        System.out.println("Uscita...");
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprovare.");
                }
            } while (scelta != 0);
        } catch (IOException e) {
            System.out.println("Errore di input/output. Riprovare.");
        }
    }
    
}