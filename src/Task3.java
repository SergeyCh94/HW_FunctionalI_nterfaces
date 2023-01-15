public class Task3 {

    public interface Function<T, R> {
        R apply(T t);
    }

    public static void main(String[] args) {
        double t = 1.9;

        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double t) {
                return t.longValue();
            }
        };
        System.out.println(function.apply(t));

        Function<Double, Long> function2 = t1 -> t1.longValue();
        System.out.println(function.apply(t));

    }
}
