/*  
Federico Tung 4C IN
 */

package Compito_es31_pA179_Posta_elettronica;

import java.util.*;

 public class Main {
    public static void main(String[] args) {
        
        List<Email> emails = new ArrayList<>();
        Mailbox mailbox = new Mailbox();
        
        Email email1 = new Email("agrillini@gmail.com", "Oggetto Andrea", "10/04/2024", "8:15", "Testo email 1");
        Email email2 = new Email("riccardo.vecchiolla@gmail.com", "Oggetto RIccardo", "11/04/2024", "9:30", "Testo email 2");
        
        mailbox.addEmail(email1);
        mailbox.addEmail(email2);

        System.out.println();
        
        System.out.println("Email nella mailbox:");
        for (Email email : mailbox.getEmails()) {
            System.out.println("- " + email.getOggetto());
        }
        
        List<Email> emailConTesto = mailbox.searchEmail("Oggetto: ");
        System.out.println("Email con testo nel soggetto:");
        for (Email email : emailConTesto) {
            System.out.println("- " + email.getOggetto());
        }
        
        mailbox.deleteEmail(1);
        
        System.out.println("Email nella mailbox dopo eliminazione:");
        for (Email email : mailbox.getEmails()) {
            System.out.println("- " + email.getOggetto());
        }   
    }
}