import task1.ProgramTask1;
import task2.ProgramTask2;
import task3.ProgramTask3;
import task4.ProgramTask4;
import task5.ProgramTask5;

import static util.NumberReader.readNumber;

public class Menu {
    public static void main(String[] args) throws Exception {
            ProgramTask1 t1 = new ProgramTask1();
            ProgramTask2 t2 = new ProgramTask2();
            ProgramTask3 t3 = new ProgramTask3();
            ProgramTask4 t4 = new ProgramTask4();
            ProgramTask5 t5 = new ProgramTask5();

            int value;

            while (true) {
                try {
                System.out.println("\nYou are in the main menu. Enter number of task: \n 1. Task 1; \n 2. Task 2; \n " +
                        "3. Task 3; \n 4. Task 4; \n 5. Task 5; \n 0. Exit.");
                value = readNumber();

                switch (value) {
                    case 1:
                        System.out.println("You are in the section with task 1: Write a program that returns the sum of the digits " +
                                "present in this string.\nIf there are no digits, the amount returned is 0.");
                        System.out.println("Enter string with numbers. For exit from the program press \"e\".");
                        t1.startTask1();
                        break;
                    case 2:
                        System.out.println("You are in the section with task 2: Create a program that will calculate and display " +
                                "the prime factors that \nmake up the integer entered by the user. If a non-integer number is entered, " +
                                "then report an error to it.");
                        System.out.println("Enter integer. For exit from the program press \"e\".");
                        t2.startTask2();
                        break;
                    case 3:
                        System.out.println("You are in the section with task 3: Create a program that will:\n" +
                                " -\tcount the number of vowels in words;\n" +
                                " -\toutput words in a sorted list by the number of vowels (first those with more vowels);\n" +
                                " -\tmake the first vowel letter in the word uppercase.\n" +
                                "The offer is entered manually by the user in Russian letters. Use a space as a separator (“ ”).");
                        System.out.println("Enter the sentence in RUSSIAN LETTERS. For exit from the program press \"e\".");
                        t3.startTask3();
                        break;
                    case 4:
                        System.out.println("You are in the section with task 4: Create a program that will receive a number and print it " +
                                "(you can come up \nwith your own forms of numbers, as long as they are readable on the screen):\n" +
                                "Additionally: make sure that the largest digit does not consist of ‘*’, but of the corresponding small \n" +
                                "(ordinary) digits.");
                        System.out.println("Enter number. For exit from the program press \"e\".");
                        t4.startTask4();
                        break;
                    case 5:
                        System.out.println("You are in the section with task 5: You need to write a program that fills the safe " +
                                "with a set of items in such a way that the value of this set is maximum.");
                        t5.startTask5();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }
                if (value < 0 || value > 5) {
                    System.out.println("Error! Enter number from 0 to 5!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error! Enter task number!");
            }
            }
    }

    }

