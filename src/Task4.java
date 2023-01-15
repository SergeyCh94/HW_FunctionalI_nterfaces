public class Task4 {

    public interface Supplier<T> {
        T get();
    }
    public static void main(String[] args) {
        int t = (int) (Math.random() * 100);
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return t;
            }
        };
        System.out.println(supplier.get());

        Supplier<Integer> supplier2 = () -> t;
        System.out.println(supplier.get());
    }
}
