import java.util.Random;

public class HomeWork_1 {
    public void printGenericNumberOnBiggerValue() {
        Random random = new Random();

        int randomNumber = random.nextInt(900) + 100;
        String stringNumber = Integer.toString(randomNumber);

        int firstNumber = Integer.parseInt(String.valueOf(stringNumber.charAt(0)));
        int secondNumber = Integer.parseInt(String.valueOf(stringNumber.charAt(1)));
        int thirdNumber = Integer.parseInt(String.valueOf(stringNumber.charAt(2)));


        int biggerNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
        biggerNumber = biggerNumber > thirdNumber ? biggerNumber : thirdNumber;

        System.out.println("Random number is " + randomNumber);
        System.out.println("Bigger number is " + biggerNumber);
    }

    public void printNumberCloserToTen(float m, float n) {
        float _nToTen = n - 10;
        float _mToTen = m - 10;

        if (_nToTen < 0) {
            _nToTen = _nToTen * -1;
        }

        if (_mToTen < 0) {
            _mToTen = _mToTen * -1;
        }

        if (_nToTen == _mToTen) {
            System.out.println("Numbers are equal");
        } else if (_nToTen > _mToTen) {
            System.out.println("Number " + m + " is closer to 10");
        } else {
            System.out.println("Number " + n + " is closer to 10");
        }
    }

    public void printEvenOrOddNumber(int number) {
        String result = "";
        int remainder = number % 2;

        if (number == 0) {
            result = "Enter other value than " + number;
        } else if (remainder == 0) {
            result = "Number " + result + " is even";
        } else if (remainder == 1) {
            result = "Number " + result + " is odd";
        }

        System.out.println(result);
    }
}