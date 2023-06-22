package myLessons.philosopherTask;

public class Demo {
    public static void main(String[] args) {

        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        Fork fork4 = new Fork();
        Fork fork5 = new Fork();

        new Philosophers("Socrates", fork1, fork2);
        new Philosophers("Konfuci", fork2, fork3);
        new Philosophers("Laozi", fork3, fork1);
//        new Philosophers("Plato", fork4, fork5);
//        new Philosophers("Aristotle", fork5, fork1);


    }

}
