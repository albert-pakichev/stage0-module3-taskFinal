package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int currentDigit;
        currentDigit = number%10;
        sum = sum + currentDigit;
        number = number/10;

        currentDigit = number%10;
        sum = sum + currentDigit;
        number = number/10;

        currentDigit = number%10;
        sum = sum + currentDigit;
        number = number/10;

        sum = sum + number;

        System.out.println(sum);
    }
}
