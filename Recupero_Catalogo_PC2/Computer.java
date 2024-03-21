package Recupero_Catalogo_PC2;

public class Computer {
    int codice;
    String marca, modello;
    int CPU_velocita, RAM_size, Disco_size, monitor_size;
    int annoAcquisto;

    public Computer(int codice, String marca, String modello, int CPU_velocita, int RAM_size, int Disco_size, int monitor_size, int annoAcquisto) {
        this.codice = codice;
        this.marca = marca;
        this.modello = modello;
        this.CPU_velocita = CPU_velocita;
        this.RAM_size = RAM_size;
        this.Disco_size = Disco_size;
        this.monitor_size = monitor_size;
        this.annoAcquisto = annoAcquisto;
    }

    public String toString() {
        return "| Codice: " + codice + " | Marca: " + marca + " | Modello: " + modello + " | Velocità processore: " + CPU_velocita + " | Dimensioni RAM: " + RAM_size + " | Dimensioni disco: " + Disco_size + " | Dimensioni monitor: " + monitor_size + " | Anno di acquisto: " + annoAcquisto;
    }
}

public void aggiungiComputer(String marca, String modello, int CPU_velocita, int RAM_size) {
    Computer computer = new Computer(marca, modello, CPU_velocita, RAM_size);
    computer.add(computer);
}




