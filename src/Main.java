public class Main {

    public static void main(String[] args){

        User user1 = User.getUser();
        user1.stampaDettagli();

        User user2 = User.getUser();
        user2.setNome("Marco");
        user2.setEta(21);
        user2.stampaDettagli();
    }
}