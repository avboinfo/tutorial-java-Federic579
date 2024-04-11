package Compito_es31_pA179_Posta_elettronica;

import java.util.*;

public class Mailbox {
    List<Email> emails;

    public Mailbox() {
        emails = new ArrayList<>();
    }

    public void addEmail(Email email) {
        emails.add(0, email); // La nuova email viene inserita all'inizio della lista
    }

    public void deleteEmail(int p) {
        if (p >= 0 && p < emails.size()) {
            emails.remove(p);
        } else {
            System.out.println("Posizione non valida");
        }
    }

    public List<Email> searchEmail(String oggetto) {
        List<Email> result = new ArrayList<>();
        for (Email email : emails) {
            if (email.getOggetto().contains(oggetto)) {
                result.add(email);
            }
        }
        return result;


    }

    public List<Email> getEmails() {
        return emails;
    }


    
    
}
