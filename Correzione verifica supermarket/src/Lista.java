public class Lista<T> {
    Nodo<T> root;

    public Lista() {
        this.root = null;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void addHead(T v){
        Nodo<T> n = new Nodo<T>(v);
        if (isEmpty()) {
            root = n;
        } else{
            n.setSuccessivo(root);
            root = n;
        }
    }

    public void addTail(T v){
        Nodo<T> n = new Nodo<T>(v);
        if(root == null){
            root = n;
        } else {
            Nodo<T> tmp = root;
            while(tmp.getSuccessivo()!=null){
                tmp = tmp.getSuccessivo();
            }
            tmp.setSuccessivo(n);
        }
    }

    public T getItemInPosition(int pos){
        Nodo<T> counter = root;
        if (counter == null) {
            return null;
        }
        if (pos == 0) {
            return counter.getValore();
        }
        for (int i = 0; i < pos; i++) {
            counter = counter.getSuccessivo();
        }
        if (counter == null) {
            return null;
        }
        return counter.getValore();
    }

    public boolean removeHead(){
        if (isEmpty()) {
            return false;
        }
        if (root.getSuccessivo()==null) {
            root = null;
            return true;
        } else{
            Nodo<T> temp = root.getSuccessivo();
            root.setSuccessivo(temp.getSuccessivo());
            root = temp;
            return true;
        }
    }

    public boolean removePos(int pos){
        Nodo<T> counter = root;
        Nodo<T> temp = null;
        if (pos == 0) {
            counter = root.getSuccessivo();
            root = counter;
            return true;
        } 
        if (isEmpty()) {
            return false;
        }
        
        for (int i = 0; i < pos; i++) {
            counter = counter.getSuccessivo();
            temp = counter.getSuccessivo();
        }
        if (temp == null) {
            counter = null;
            return true;
        }
        counter.setSuccessivo(temp.getSuccessivo());
        return true;
    }

    @Override
    public String toString() {
        String s = "";
        Nodo<T> tmp = root;
        while (tmp!=null) {
            s += tmp + "\n";
            tmp = tmp.getSuccessivo();
        }
        return s;
    }
}