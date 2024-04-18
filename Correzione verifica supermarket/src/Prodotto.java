public class Prodotto {
    String codice;
    String descrizione;
    double costo;

    public Prodotto(String codice, String descrizione, double costo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.costo = costo;
    }
    
    public String getCodice() {
        return codice;
    }
    
    public String getDescrizione() {
        return descrizione;
    }
    
    public double getCosto() {
        return costo;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Prodotto [codice=" + codice + ", descrizione=" + descrizione + ", costo=" + costo + "]";
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}


