public class Task2 {

    public interface Consumer<T> {
        String accept(T t);
    }
    public static void main(String[] args) {

        String t = "Sergey";
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public String accept(String t) {
                return "Hello, " + t;
            }
        };
        System.out.println(consumer.accept(t));

        Consumer<String> consumer2 = String -> "Hello, " + t;
        System.out.println(consumer2.accept(t));
    }
}
