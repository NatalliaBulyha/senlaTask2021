package task3;
import exception.ExitException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static util.TextReader.readText;

public class ProgramTask3 {

//    3.	Создайте программу, которая будет:
//   -	подсчитывать количество гласных в словах
//   -	выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
//   -	делать первую гласную букву в слове заглавной
//    Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).

    public void startTask3() {
        try {
            String string = readText();
            Pattern patlatletter = Pattern.compile("[а-яА-Я]");
            Matcher matlatletter = patlatletter.matcher(string);

            if (!matlatletter.matches()) {
                System.out.println("Error! Enter the sentence in RUSSIAN LETTERS:");
                string = readText();
            }

            ManipulationsWithVowels tast = new ManipulationsWithVowels();
            System.out.println("Number of vowel letters per line: " + tast.countTheNumberOfVowels(string));
            System.out.println("Sorting by the number of vowels: " + tast.sortByTheNumberOfVowels(string));
            System.out.println("The first vowel letter in the word is uppercase: " + tast.makeTheFirstVowelInTheWordCapital(string));
        } catch (ExitException e) {
            System.out.println("Error! Try again!");
            startTask3();
        }
    }
}
