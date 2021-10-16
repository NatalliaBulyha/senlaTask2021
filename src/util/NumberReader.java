package util;

import exception.ExitException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberReader {
    private static Integer number;

    public static Integer readNumber() throws ExitException {
    String earlyNumber = "";

        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        earlyNumber = reader.readLine();
        if (earlyNumber.equals("e")) {
            throw new ExitException("User logged out.");
        } else if (earlyNumber.isEmpty()) {
            System.out.println("Error! You entered an empty value, try again!");
            readNumber();
        }
        number = Integer.parseInt(earlyNumber);
    } catch (NumberFormatException e) {
        System.out.println("Error! You entered not integer, try again.");
        readNumber();
    } catch (
    IOException e) {
        e.printStackTrace();
    }
        return number;
}

}
