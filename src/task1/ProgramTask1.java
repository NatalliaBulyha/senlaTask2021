package task1;
import exception.ExitException;

import static util.TextReader.readText;

public class ProgramTask1 {
    //1. Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
    // Если цифр нет, возвращаемая сумма равна 0.

    public void startTask1() {
        try {
            String string = readText();

            ManipulationsWithString m = new ManipulationsWithString();
            System.out.println("The sum of the numbers from the string: " + m.sumNumbersFromString(string));
        } catch (ExitException e) {
            System.out.println("Error! Try again!");
            startTask1();
        }
    }
}

