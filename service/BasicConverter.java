package service;

public class BasicConverter implements Converter {
    @Override
    public void BintoDec(int num) {
        
    }

    @Override
    public void DectoBin(int num) {
        
    }

    @Override
    public void DectoHex(int num) {
        int pos = Positions(num, 16);
        char[] number = new char[pos];
        DectoHexHelper(num, number, number.length - 1);
        for (char ch : number) System.out.print(ch);
        System.out.println();
    }

    private void DectoHexHelper(int num, char[] result, int index) {
        int reminder = num % 0x10;
        char remChar;
        num /= 0x10;
        switch (reminder) {
            case 10:
                remChar = 'A';
                break;
            case 11:
                remChar = 'B';
                break;
            case 12:
                remChar = 'C';
                break;
            case 13:
                remChar = 'D';
                break;
            case 14:
                remChar = 'E';
                break;
            case 15:
                remChar = 'F';
                break;
            default:
                remChar = (char) (reminder + 48);
        }
        result[index] = remChar;
        if (num == 0) {
            return;
        }
        DectoHexHelper(num, result, --index);
    }

    private static int Positions (int num, int base) {
        for (int i = 0; ; i++) {
            if (num / (int) Math.pow(base, i) == 0) return i;
        }
    }
}
