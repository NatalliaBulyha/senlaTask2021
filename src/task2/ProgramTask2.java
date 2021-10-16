package task2;

import exception.ExitException;

import java.util.List;
import static util.NumberReader.readNumber;

public class ProgramTask2 {
    //2.	Создать программу, которая будет вычислять и выводить на экран простые множители из которых состоит
    // целое число, введенное пользователем. Если введено не целое число, то сообщать ему об ошибке.

    public void startTask2() {

        try {
            Integer number = readNumber();
            while (number < 0) {
                System.out.println("Error! Enter only positive numbers, try again!");
                number = readNumber();
            }


            ManipulationsWithNumbers m = new ManipulationsWithNumbers();
            List<Integer> primeFactors = m.decompositionIntoPrimeFactors(number);
            while (primeFactors.get(0) == number) {
                System.out.println("Error! This is a prime number, try again!");
                primeFactors.clear();
                number = readNumber();
                primeFactors = m.decompositionIntoPrimeFactors(number);
            }

            System.out.print("Prime factors of your number: ");
            for (Integer num : primeFactors) {
                System.out.print(num + ", ");
            }
            System.out.println("");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error! This is a prime number, try again!");
            startTask2();
        } catch (ExitException e) {
            System.out.println("Error! Try again!");
            startTask2();
        }
        }
}
