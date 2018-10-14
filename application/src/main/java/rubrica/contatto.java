package rubrica;

public class contatto {
    private String nome, cognome, numero, email;
    int id = 0;

    public contatto() {

    }

    public contatto(String nome, String cognome, String numero, String email, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
        this.email = email;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
