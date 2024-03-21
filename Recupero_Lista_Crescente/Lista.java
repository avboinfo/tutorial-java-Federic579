package Recupero_Lista_Crescente;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Integer> elements;

    public Lista(List<Integer> lista1, List<Integer> lista2) {
        elements = new ArrayList<>();
        
        int index1 = 0;
        int index2 = 0;
        
        while (index1 < lista1.size() && index2 < lista2.size()) {
            if (lista1.get(index1) < lista2.get(index2)) {
                elements.add(lista1.get(index1));
                index1++;
            } else {
                elements.add(lista2.get(index2));
                index2++;
            }
        }
        
        while (index1 < lista1.size()) {
            elements.add(lista1.get(index1));
            index1++;
        }
        
        while (index2 < lista2.size()) {
            elements.add(lista2.get(index2));
            index2++;
        }
    }
}