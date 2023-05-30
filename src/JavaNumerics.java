public class JavaNumerics
{
    public static void main(String[] args)
    {
        double burgerPrice = 3.50; // South Park!
        int burgerOrder = 4;
        double orderPrice = 0;

        orderPrice = burgerPrice * burgerOrder;

        System.out.println("The price of an order of " + burgerOrder + " burgers is " + orderPrice + " dollars!");


        // loss of precision
        double sum = 0;
        double valA = 2.50;
        int valB = 6;

        sum = valA + valB; // double = sum of double + int
        System.out.println("The sum of " + valA + " and " + valB + " is " +sum);

        sum = valB; // double is an int

        System.out.println("Sum is " + sum);

        int intSum = 9;
        // intSum = valA;
        intSum = (int) valA;

        // integer division 5/2 = 2.5 but gets saved as 2 due to integer designation
        int iiisum = 5 / 2;
        System.out.println("iiiSum = " + iiisum);

        double diiSum = 5 / 2; // 2
        System.out.println("diiSum = " + diiSum);

        diiSum = 5.0 / 2; // double is a double and an int; 5 / 2.0 also valid format
        System.out.println("diiSum = " + diiSum);

        diiSum = (double) 5/2; // double is a double and an int 5 / 2.0
        System.out.println("diiSum = " + diiSum);

        final double TAX_RATE = .17;
        // TAX_RATE = 23.4; illegal to try and change a constant val

        // Math Functions

        // x to the power of n
        double x = 2.0;
        double n = 3.0;

        double xCubed = Math.pow(x, n);
        System.out.println("X Cubed is " +xCubed);

        x = 9.0;
        n = Math.sqrt(x);

        System.out.println("The square root of " + x + " is " + n);


    }
}