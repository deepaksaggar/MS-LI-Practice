import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GoodString {
    public static void main(String arg[]) {
        System.out.println("Good string : " + makeGood("leEeetcode"));
        System.out.println("Good string : " + makeGood("abBAcC"));
        System.out.println("Good string : " + makeGood("kkdsFuqUfSDKK"));
    }

    public static String makeGood(String s) {

        List<Character> l = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            l.add(c);
        }

        int j = 0;
        while (j < l.size() - 1) {
        //for (int j = 0; j < l.size() - 1; j++) {
            if (((int) (l.get(j)) - (int) l.get(j + 1) == 32) || ((int) l.get(j) - (int) (l.get(j + 1)) == -32)) {
                l.remove(j);
                l.remove(j);
                j = 0;
                continue;
            }
            j++;
        }
        return l.stream().map(Object::toString)
                .collect(Collectors.joining(""));
    }

}
