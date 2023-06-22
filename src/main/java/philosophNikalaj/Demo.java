package philosophNikalaj;

public class Demo {
    public static void main(String[] args) {


        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();

        Philosophers p1 = new Philosophers(fork1, fork2);
        Philosophers p2 = new Philosophers(fork2, fork3);
        Philosophers p3 = new Philosophers(fork3, fork1);


    }

}
