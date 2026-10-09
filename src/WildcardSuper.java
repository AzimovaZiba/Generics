import java.util.List;

public class WildcardSuper {

    public static void addNumbers(List<? super Integer> list, int n) {
        for (int i = 1; i <= n; i++) {
            list.add(i);

        }
    }
}


