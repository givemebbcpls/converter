import helper.*;

public class Main {
    public static void main(String[] args) {
        int fromSystem, toSystem, number;
        ConverterHelper ch = new ConverterHelper();
        InputHelper ih = new InputHelper();

        System.out.println("Hello! There is converter for number systems.");
        System.out.print("Choose the system which from you want to convert (2, 10): ");
        
        fromSystem = ih.getFromSystem();

        System.out.print("Choose the system which you want to convert (2, 10, 16): ");

        toSystem = ih.getToSystem();
        while(ih.checker) {
            System.out.print("Type your number from 0 to 10000 that you want to convert ('q' for exit): ");

            number = ih.getInputNumber();
            
            if (number != -1) ch.launchConverter(fromSystem, toSystem, number);
        }
    }
}
