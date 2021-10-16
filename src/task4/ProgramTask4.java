package task4;
import static util.TextReader.readText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTask4 {
    private static Object Exception;

    public void startTask4() throws Exception {

        String string = readText();

        List<String> listOfStringNumbers = Arrays.asList(string.split(""));
        List<Integer> listOfNumbers = new ArrayList<>();
        try{ for(String s: listOfStringNumbers) {
            Integer num = Integer.parseInt(s);
            listOfNumbers.add(num);
        }

            System.out.println("Enter Y if you want to see your number with * or enter N if you want to see your " +
                    "number with numbers. For exit from the program press \"e\"");
            String letter = readText().toLowerCase();

            while (!letter.equals("y") && !letter.equals("n")) {
                System.out.println("Error! Enter Y or N!");
                letter = readText().toLowerCase();
            }
            ManipulationsWitsNumbers m = new ManipulationsWitsNumbers();
            m.numbers(listOfNumbers, letter);
        } catch (NumberFormatException e) {
            System.out.println("Error! You entered not integer, try again!");
            startTask4();
        } catch (NullPointerException e) {
            System.out.println("Exception: Invalid entry!");
        }
        System.out.println("");
    }
}
