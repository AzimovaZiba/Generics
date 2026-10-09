import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        Box<String> box = new Box("Salam");

        System.out.println(box.getT());
        System.out.println(box.isEmpty());

        box.setT(null);

        System.out.println(box.isEmpty());


        Pair<String, Integer> pair = new Pair<>("Yaş", 18);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        System.out.println(pair);


        Integer[] numbers = {10, 20, 30, 40};

        swap(numbers, 0, 2);

        for (int number : numbers) {
            System.out.println(number);
        }

        List<Integer> num = Arrays.asList(20, 22, 33, 43);
        System.out.println(Sum.sum(num));


        List<Integer> numbers1 = new ArrayList<>();

        WildcardSuper.addNumbers(numbers1, 15);

        System.out.println(numbers1);
    }

}
