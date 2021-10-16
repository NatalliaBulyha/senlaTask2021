package task4;

import java.util.List;

public class ManipulationsWitsNumbers {
    public void numbers (List<Integer> listOfNumbers, String letter) throws Exception {
       String l = letter.toLowerCase();
        for(int i = 0; i < 7; i++ ) {
        for(Integer num: listOfNumbers) {
            if(l.equals("y")) {
                if (num == 2 && i == 0 || num == 3 && i == 3 || num == 6 && i == 6 || num == 8 && (i == 0 || i == 3
                        || i == 6) || num == 9 && (i == 0 || i == 6)) {
                    System.out.print("  ***  ");
                }
                if (num == 2 && i == 1 || num == 6 && (i == 4 || i == 5) || num == 8 && (i == 1 || i == 2
                        || i == 4 || i == 5) || num == 9 && (i == 1 || i == 2)) {
                    System.out.print(" *   * ");
                }
                if (num == 2 && i == 2 || num == 4 && i == 3) {
                    System.out.print(" *  *  ");
                }
                if (num == 2 && i == 3 || num == 6 && i == 1 || num == 7 && i == 3) {
                    System.out.print("   *   ");
                }
                if (num == 2 && i == 4 || num == 6 && i == 2 || num == 7 && i == 4) {
                    System.out.print("  *    ");
                }
                if (num == 2 && i == 5) {
                    System.out.print(" *     ");
                }
                if (num == 2 && i == 6 || num == 5 && i == 0 || num == 4 && i == 4 || num == 7 && i == 0) {
                    System.out.print(" ***** ");
                }
                if (num == 3 && i == 0 || num == 3 && i == 6 || num == 5 && (i == 3 || i == 6) || num == 6 && i == 3) {
                    System.out.print(" ****  ");
                }
                if (num == 3 && (i == 1 || i == 2 || i == 4 || i == 5) || num == 5 && (i == 4 || i == 5) || num == 7 && i == 1
                        || num == 9 && (i == 4 || i == 5)) {
                    System.out.print("     * ");
                }
                if (num == 5 && (i == 1 || i == 2) || num == 7 && (i == 5 || i == 6)) {
                    System.out.print(" *     ");
                }
                if (num == 6 && i == 0 || num == 7 && i == 2 || num == 4 && (i == 0 || i == 5 || i == 6)) {
                    System.out.print("    *  ");
                }
                if (num == 9 && i == 3) {
                    System.out.print("  **** ");
                }
                if (num == 4 && i == 1) {
                    System.out.print("   **  ");
                }
                if (num == 4 && i == 2) {
                    System.out.print("  * *  ");
                }
                if (num == 1 && (i == 0 || i == 2 || i == 3 || i == 4 || i == 5)) {
                    System.out.print("  *  ");
                }
                if (num == 1 && i == 1) {
                    System.out.print(" **  ");
                }
                if (num == 1 && i == 6) {
                    System.out.print(" *** ");
                }
                if (num == 0 && (i == 0 || i == 6)) {
                    System.out.print("   ***   ");
                }
                if (num == 0 && (i == 1 || i == 5)) {
                    System.out.print("  *   *  ");
                }
                if (num == 0 && (i == 2 || i == 3 || i == 4)) {
                    System.out.print(" *     * ");
                }
            } else if(l.equals("n")) {
                if (num == 1) {
                    if (i == 0 || i == 2 || i == 3 || i == 4 || i == 5) {
                        System.out.print("  1  ");
                    }
                    if (i == 1) {
                        System.out.print(" 11  ");
                    }
                    if (i == 6) {
                        System.out.print(" 111 ");
                    }
                }
                if (num == 0) {
                    if (i == 0 || i == 6) {
                        System.out.print("   000   ");
                    }
                    if (i == 1 || i == 5) {
                        System.out.print("  0   0  ");
                    }
                    if (i == 2 || i == 3 || i == 4) {
                        System.out.print(" 0     0 ");
                    }
                }

                if (num == 9) {
                    if (i == 0 || i == 6 || i == 3) {
                        System.out.print("  9999 ");
                    }
                    if (i == 1 || i == 2) {
                        System.out.print(" 9   9 ");
                    }
                    if (i == 4 || i == 5) {
                        System.out.print("     9 ");
                    }
                }

                if (num == 2) {
                    if (i == 0) {
                        System.out.print("  222  ");
                    }
                    if (i == 1) {
                        System.out.print(" 2   2 ");
                    }
                    if (i == 2) {
                        System.out.print("    2  ");
                    }
                    if (i == 3) {
                        System.out.print("   2   ");
                    }
                    if (i == 4) {
                        System.out.print("  2    ");
                    }
                    if (i == 5) {
                        System.out.print(" 2     ");
                    }
                    if (i == 6) {
                        System.out.print(" 22222 ");
                    }
                }
                if (num == 3) {
                    if (i == 0 || i == 6) {
                        System.out.print(" 3333  ");
                    }
                    if (i == 1 || i == 2 || i == 4 || i == 5) {
                        System.out.print("     3 ");
                    }
                    if (i == 3) {
                        System.out.print("  333  ");
                    }
                }
                if (num == 4) {
                    if (i == 0 || i == 5 || i == 6) {
                        System.out.print("    4  ");
                    }
                    if (i == 1) {
                        System.out.print("   44  ");
                    }
                    if (i == 2) {
                        System.out.print("  4 4  ");
                    }
                    if (i == 3) {
                        System.out.print(" 4  4  ");
                    }
                    if (i == 4) {
                        System.out.print(" 44444 ");
                    }
                }
                if (num == 5) {
                    if (i == 0) {
                        System.out.print(" 55555 ");
                    }
                    if (i == 1 || i == 2) {
                        System.out.print(" 5     ");
                    }
                    if (i == 3 || i == 6) {
                        System.out.print(" 5555  ");
                    }
                    if (i == 4 || i == 5) {
                        System.out.print("     5 ");
                    }
                }
                if (num == 6) {
                    if (i == 0) {
                        System.out.print("    6  ");
                    }
                    if (i == 1) {
                        System.out.print("   6   ");
                    }
                    if (i == 2) {
                        System.out.print("  6    ");
                    }
                    if (i == 3 || i == 6) {
                        System.out.print("  666  ");
                    }
                    if (i == 4 || i == 5) {
                        System.out.print(" 6   6 ");
                    }
                }
                if (num == 7) {
                    if (i == 0) {
                        System.out.print(" 77777 ");
                    }
                    if (i == 1) {
                        System.out.print("     7 ");
                    }
                    if (i == 2) {
                        System.out.print("    7  ");
                    }
                    if (i == 3) {
                        System.out.print("   7   ");
                    }
                    if (i == 4 || i == 5 || i == 6) {
                        System.out.print("  7    ");
                    }
                }
                if (num == 8) {
                    if (i == 0 || i == 3 || i == 6) {
                        System.out.print("  888  ");
                    }
                    if (i == 1 || i == 2 || i == 4 || i == 5) {
                        System.out.print(" 8   8 ");
                    }
                }
            }
        }
            System.out.println("");
        }
    }
}
