package task2;

import java.util.ArrayList;
import java.util.List;

public class ManipulationsWithNumbers {
    public ArrayList decompositionIntoPrimeFactors(Integer number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i < 10; i++) {
            if (number % i == 0) {
                numbers.add(i);
                number = number / i;
                i = 1;
            }
        }
        return (ArrayList) numbers;
    }
}






