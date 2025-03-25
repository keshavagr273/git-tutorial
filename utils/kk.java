public class KK {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        if (num2 != 0) {
            int division = num1 / num2;
            System.out.println("The division of " + num1 + " by " + num2 + " is: " + division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

}