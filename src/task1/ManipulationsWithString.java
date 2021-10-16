package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class ManipulationsWithString {
    public int sumNumbersFromString(String string) {

        int sum = 0;

        try {
            String str = string.replaceAll("\\D+", "");

            ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
            ArrayList<Integer> number = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                number.add(Integer.parseInt(list.get(i)));
                sum += number.get(i);
            }
        } catch (NumberFormatException ex) {
            sum = 0;
        }
        return sum;
    }
}
