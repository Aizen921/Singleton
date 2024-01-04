public class User {

    private String nome;
    private int eta;

    private static User user;
    private User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public static User getUser() {
        if(user == null){
            user = new User();
        }
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

    public void stampaDettagli() {
        System.out.println("User: " + "Nome: " + nome + ", Età: " + eta);
    }
}