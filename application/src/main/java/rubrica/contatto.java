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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
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
