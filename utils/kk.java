class KK {
    public static void main(String[] args) {
        int firstOperand = 10;
        int secondOperand = 20;
        int complexSum = firstOperand + secondOperand + 23;
        System.out.println("The sum of " + firstOperand + " and " + secondOperand + " is: " + complexSum);
        int complexProduct = firstOperand * secondOperand;
        System.out.println("The product of " + firstOperand + " and " + secondOperand + " is: " + complexProduct);

        if (secondOperand != 0) {
            int division = firstOperand / secondOperand;
            System.out.println("The division of " + firstOperand + " by " + secondOperand + " is: " + division);
        } else {
            System.out.println("Division by zero is not allowe.");
        }
    }

}