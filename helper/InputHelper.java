package helper;

import java.io.*;

public class InputHelper {
    private String errorNumberText = "Your number isn't correct. Type in a number from 0 to 10'000: ";
    private String errorBaseText = "Your system isn't correct. It should be 2 or 10: ";
    private String errorToText = "Your system isn't correct. It should be 2, 10 or 16: ";
    public boolean checker = true;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int getInputNumber() {
        int number = -1;
        do {
            try {
                String input = br.readLine();
                if (input.equals("q")) {
                    checker = false;
                    number = -1;
                    break;
                }
                number = Integer.parseInt(input);
                if (number > 10000 | number < 0) System.out.print(errorNumberText);
            } catch (IOException | NumberFormatException ex) {
                System.out.print(errorNumberText);
            }
        } while (number < 0 | number > 10000);
        return number;
    }

    public int getFromSystem() {
        int base = -1;
        do {
            try {
                base = Integer.parseInt(br.readLine());
                if (base != 2 & base != 10) System.out.print(errorBaseText);
            } catch (IOException | NumberFormatException ex) {
                System.out.print(errorBaseText);
            }
        } while (base != 2 & base != 10);
        return base;
    }

    public int getToSystem() {
        int toSys = -1;
        do {
            try {
                toSys = Integer.parseInt(br.readLine());
                if (toSys != 2 & toSys != 16 & toSys != 10) System.out.print(errorToText);
            } catch (IOException | NumberFormatException ex) {
                System.out.print(errorToText);
            }
        } while (toSys != 2 & toSys != 10 & toSys != 16);
        return toSys;
    }
}
