package basicToday._09_07_23;

public class OneQueue<T> {
    private T elem;


    public OneQueue<T> add(T el) {
        this.elem = el;
        return this;
    }

    public T get() {
        return elem;
    }

    public static void main(String[] args) {
        OneQueue<Integer> queue = new OneQueue<>();

        System.out.println(queue.add(2).add(4).get());
    }
}
