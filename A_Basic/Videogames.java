public class Videogames{
    String nome, marca;
    float costo;
    int anno;

    public Videogames(String nome, String marca, float costo, int anno) {
        this.nome = nome;
        this.marca = marca;
        this.costo = costo;
        this.anno = anno;
    }

    public String toString() {
        return "| Nome: " + nome + " | Marca: " + marca + " | Costo: " + costo + " euro | Anno: " + anno;
    }
}

