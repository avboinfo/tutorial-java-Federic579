package Recupero_Catalogo_PC ;

import java.util.ArrayList;

public class Computer {
    private int codice;
    private String marca;
    private String modello;
    private double velocitaProcessore;
    private int dimensioniRam;
    private int dimensioniDisco;
    private int dimensioniMonitor;
    private int annoAcquisto;

    public Computer(String marca, String modello, double velocitaProcessore, int dimensioniRam, int dimensioniDisco, int dimensioniMonitor, int annoAcquisto) {
        this.codice = GeneraCodiceAutomatico();
        this.marca = marca;
        this.modello = modello;
        this.velocitaProcessore = velocitaProcessore;
        this.dimensioniRam = dimensioniRam;
        this.dimensioniDisco = dimensioniDisco;
        this.dimensioniMonitor = dimensioniMonitor;
        this.annoAcquisto = annoAcquisto;
    }


    public int getCodice() {
        return codice;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public double getVelocitaProcessore() {
        return velocitaProcessore;
    }

    public int getDimensioniRam() {
        return dimensioniRam;
    }

    public int getDimensioniDisco() {
        return dimensioniDisco;
    }

    public int getDimensioniMonitor() {
        return dimensioniMonitor;
    }

    public int getAnnoAcquisto() {
        return annoAcquisto;
    }

    public String toString() {
        return "Codice: " + codice + ", Marca: " + marca + ", Modello: " + modello + ", Velocità processore: " + velocitaProcessore + ", Dimensioni RAM: " + dimensioniRam + ", Dimensioni disco: " + dimensioniDisco + ", Dimensioni monitor: " + dimensioniMonitor + ", Anno acquisto: " + annoAcquisto;
    }
}

    public void aggiungiComputer(String marca, String modello, double velocitaProcessore, int dimensioniRam, int dimensioniDisco, int dimensioniMonitor, int annoAcquisto) {
        Computer computer = new Computer(marca, modello, velocitaProcessore, dimensioniRam, dimensioniDisco, dimensioniMonitor, annoAcquisto);
        computer.add(computer);
    }

    public void eliminaComputer(int codice) {
        for (Computer computer : computers) {
            if (computer.getCodice() == codice) {
                computers.remove(computer);
                break;
            }
        }
    }

    public Computer ricercaPerCodice(int codice) {
        for (Computer computer : computers) {
            if (computer.getCodice() == codice) {
                return computer;
            }
        }
        return null;
    }

    public ArrayList<Computer> ricercaMiglioriComputer(double velocitaProcessore, int dimensioniRam, int dimensioniDisco) {
        ArrayList<Computer> miglioriComputer = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getVelocitaProcessore() > velocitaProcessore && computer.getDimensioniRam() > dimensioniRam && computer.getDimensioniDisco() > dimensioniDisco) {
                miglioriComputer.add(computer);
            }
        }
        return miglioriComputer;
    }
}