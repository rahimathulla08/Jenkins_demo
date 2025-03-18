public class ArithmeticOperations {


    public ArithmeticOperations(int num1, int num2) {
        
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));

       
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));

        
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));

        
        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
    }

    
    public static void main(String[] args) {
       
        new ArithmeticOperations(20, 5);
    }
}

