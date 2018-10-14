package application;

import java.util.*;
import rubrica.*;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        /**
         * Imposto tutti i parametri necessari per l'esecuzione del programma.
         */
        int scelta = 0, id = 0;
        String nome = null, cognome, numero, email;
        contatto c = new contatto();
        Scanner s = new Scanner(System.in);

        System.out.println("Benvenuto nella rubrica!" + "\n");
        /**
         * Menu della rubrica.
         */
        while (scelta != 8) {
            System.out.println("Fai una scelta:" + "\n" + "1) AGGIUNGI CONTATTO" + "\n" + "2) MODIFICA CONTATTO" + "\n"
                    + "3) ELIMINA CONTATTO" + "\n" + "4) VISUALIZZA CONTATTI SALVATI" + "\n" + "5) RICERCA CONTATTO"
                    + "\n" + "6) SALVA CONTATTI SU FILE" + "\n" + "7) CARICA CONTATTI DA FILE" + "\n"
                    + "8) ESCI DAL PROGRAMMA" + "\n" + "Scelta:");

            scelta = s.nextInt(); // Scanner per la scelta della funzione desiderata.
            s.nextLine();

            switch (scelta) {
            case 1:
                int scelta3 = 0;
                /**
                 * Scelta che consente di scegliere se procedere o meno con l'aggiunta del
                 * contatto
                 */
                System.out.println("------------ INSERIMENTO CONTATTO ------------" + "\n");
                System.out.println("Stai per aggiungere un nuovo contatto. Continuare?" + "\n" + "(1) Si!" + "\n"
                        + "(2) No, annulla..." + "\n");
                scelta3 = s.nextInt();
                s.nextLine();
                switch (scelta3) {
                /**
                 * Inizia l'aggiunta del contatto inserendo nome, cognome, numero di telefono e
                 * email.
                 */
                case 1:
                    System.out.println("Inserisci nome: ");
                    nome = s.nextLine();
                    System.out.println("Inserisci cognome: ");
                    cognome = s.nextLine();
                    System.out.println("Inserisci numero: ");
                    numero = s.nextLine();
                    System.out.println("Inserisci email: ");
                    email = s.nextLine();
                    id++;

                    c = new contatto(nome, cognome, numero, email, id);

                    System.out.println("Operazione completata. L'ID assegnato al contatto " + c.getNome() + " "
                            + c.getCognome() + " " + "e' " + c.getId() + "\n"
                            + "----------------------------------------------" + "\n");
                    break;
                case 2:
                    /**
                     * Non esegue nessuna operazione e torna al menu principale.
                     */
                    System.out.println(
                            "Operazione annullata!" + "\n" + "----------------------------------------------" + "\n");
                    break;

                default:
                    /**
                     * Se la scelta non è valida, torna direttamente al menu principale restituendo
                     * un errore.
                     */
                    System.out.println("Scelta non valida. Operazione annullata!" + "\n"
                            + "----------------------------------------------" + "\n");
                    break;
                }
                break;
            case 2:
                int scelta2 = 0;
                /**
                 * Se non esiste nessun contatto (in altre parole, se la stringa "nome" è uguale
                 * a null, restituisce un errore e torna al menu principale.)
                 */
                if (c.getNome() == null) {
                    System.out.println("Non esiste nessun contatto!" + "\n"
                            + "----------------------------------------------" + "\n");
                    break;
                } else {
                    /**
                     * Se esiste un contatto, procede alla modifica, permettendo di scegliere quale
                     * parametro modificare.
                     */
                    System.out.println("------------ MODIFICA CONTATTO ------------" + "\n");
                    System.out.println("Cosa vuoi modificare?" + "\n" + "1) Nome" + "\n" + "2) Cognome" + "\n"
                            + "3) Numero di telefono" + "\n" + "4) Email" + "\n" + "5) Annulla" + "\n" + "Scelta:");

                    scelta2 = s.nextInt();
                    s.nextLine();
                    switch (scelta2) {
                    /**
                     * Ogni caso modifica un preciso parametro, visualizzando prima quello inserito
                     * in precedenza.
                     */
                    case 1:
                        System.out.println(
                                "Attualmente il nome e': " + c.getNome() + "." + "\n" + "Scrivi il nuovo nome: ");
                        c.setNome(s.nextLine());
                        System.out.println("Fatto. Ora il nome e' " + c.getNome() + "." + "\n"
                                + "----------------------------------------------" + "\n");
                        break;
                    case 2:
                        System.out.println(
                                "Attualmente il nome e': " + c.getCognome() + "." + "\n" + "Scrivi il nuovo cognome: ");
                        c.setCognome(s.nextLine());
                        System.out.println("Fatto. Ora il nome e' " + c.getCognome() + "." + "\n"
                                + "----------------------------------------------" + "\n");
                        break;
                    case 3:
                        System.out.println(
                                "Attualmente il numero e': " + c.getNumero() + "." + "\n" + "Scrivi il nuovo numero: ");
                        c.setNumero(s.nextLine());
                        System.out.println("Fatto. Ora il numero e': " + c.getNumero() + "." + "\n"
                                + "----------------------------------------------" + "\n");

                    case 4:
                        System.out.println(
                                "Attualmente l'email e': " + c.getEmail() + "." + "\n" + "Scrivi la nuova email: ");
                        c.setEmail(s.nextLine());
                        System.out.println("Fatto. Ora l'email e': " + c.getEmail() + "." + "\n"
                                + "----------------------------------------------" + "\n");

                    case 5:
                        System.out.println("Operazione annullata!" + "\n"
                                + "----------------------------------------------" + "\n");
                        break;

                    default:
                        /**
                         * Se l'input inserito non corrisponde a nessuna delle scelte disponibili,
                         * restituisce un errore e torna al menu principale.
                         */
                        System.out.println("Scelta non valida. Operazione annullata!" + "\n"
                                + "----------------------------------------------" + "\n");
                        break;
                    }
                }
                break;
            case 3:
                c.setNome(null);
                c.setCognome(null);
                c.setEmail(null);
                c.setNumero(null);
                id--;

                System.out.println(
                        "Contatto eliminato!" + "\n" + "----------------------------------------------" + "\n");
                break;
            case 4:
                /**
                 * Se non c'è nessun contatto salvato, restituisce un errore e torna al menu
                 * principale.
                 */
                if (c.getNome() == null) {
                    System.out.println("Non esiste alcun contatto salvato!" + "\n"
                            + "----------------------------------------------" + "\n");
                    break;
                }
                /**
                 * Visualizza a schermo tutti i contatti salvati nel programma.
                 */
                System.out.println("------------ CONTATTI SALVATI ------------");
                System.out.println("ID: " + c.getId() + "\n" + "Nome: " + c.getNome() + "\n" + "Cognome: "
                        + c.getCognome() + "\n" + "Numero di telefono: " + c.getNumero() + "\n" + "Indirizzo email: "
                        + c.getEmail() + "\n" + "----------------------------------------------" + "\n");
                break;
            case 5:
                String ricerca;
                System.out.println("Scrivi il nome del contatto da cercare: ");
                ricerca = s.nextLine();

                if (nome.equals(ricerca)) {
                    System.out.println("Il contatto e' presente in rubrica.");
                    System.out.println(
                            "ID: " + c.getId() + "\n" + "Nome: " + c.getNome() + "\n" + "Cognome: " + c.getCognome()
                                    + "\n" + "Numero di telefono: " + c.getNumero() + "\n" + "Indirizzo email: "
                                    + c.getEmail() + "\n" + "----------------------------------------------" + "\n");
                    break;
                } else {
                    System.out.println("Il contatto non esiste.");
                }
                break;

            case 6:

                break;

            case 7:

                break;
            case 8:
                Runtime.getRuntime().exit(scelta);

            default:
                System.out.println("Comando non valido." + "\n");
                break;
            }
        }
        s.close();
    }
}
