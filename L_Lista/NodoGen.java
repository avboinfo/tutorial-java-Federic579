package L_Lista;

public class NodoGen<T> {
    private T valore;
    private NodoGen<T> successivo;

    public NodoGen(T valore) {
        this.valore = valore;
        successivo = null;
    }

    public void setValore(T nvalore) {
        valore = nvalore;
    }

    public T getValore() {
        return valore;
    }

    public String toString() {
        return "Il suo valore è: " + valore;
    }

    public NodoGen<T> getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(NodoGen<T> successivo) {
        this.successivo = successivo;
    }
    
}
