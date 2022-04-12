package helper;

import service.*;

public class ConverterHelper {
    Converter bc = new BasicConverter();

    public void launchConverter(int base, int baseTo, int number) {
        switch (base) {
            case 2:
                launchBin(baseTo, number);
                break;
            case 10:
                launchDec(baseTo, number);
                break;
        }
    }

    private void launchBin(int baseTo, int number) {
        switch (baseTo) {
            case 10:
                bc.BintoDec(number);
        }
    }

    private void launchDec(int baseTo, int number) {
        switch (baseTo) {
            case 16:
                bc.DectoHex(number);
                break;
            case 2:
                bc.DectoBin(number);
        }
    }
}
