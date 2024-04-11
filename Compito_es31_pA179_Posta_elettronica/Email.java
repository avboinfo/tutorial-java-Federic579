package Compito_es31_pA179_Posta_elettronica;


public class Email {
    String mittente;
    String oggetto;
    String data;
    String ora;
    String testo;

    public Email(String mittente, String oggetto, String data, String ora, String testo) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.data = data;
        this.ora = ora;
        this.testo = testo;
    }

    public void setMittente(String mittente){
        this.mittente = mittente;
    }

    public void setOggetto(String oggetto){
        this.oggetto = oggetto;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setOra(String ora){
        this.ora = ora;
    }

    public void setTesto(String testo){
        this.testo = testo;
    }

    public String getMittente() {
        return mittente;
    }

    public String getOggetto() {
        return oggetto;
    }

    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public String getTesto() {
        return testo;
    }

    public String toString() {
        return "Ricevuto da: " + mittente + "\nOggetto: " + oggetto + "\nData: " + data + "\nAlle: " + ora + "\nTesto: " + testo + "\n";
    }
}
