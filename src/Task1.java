public class Task1 {

    public interface Predicate<T> {
        boolean test(T t);
    }
    public static void main(String[] args) {

        int t = -5;
        Predicate<Integer> isPositiveNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(isPositiveNumber.test(t));

        Predicate<Integer> isPositiveNumber2 = integer -> t > 0;

        System.out.println(isPositiveNumber2.test(t));
    }
}
