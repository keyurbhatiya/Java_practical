import java.util.Scanner;

class A {
    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int num) {
        this.number = num;
    }
}

class B extends A {
    public int factorial() {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}

class C extends A {
    public boolean isEven() {
        return number % 2 == 0;
    }
}

class D extends A {
    public boolean isArmstrong() {
        int temp = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == number;
    }
}

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        A obj = new A();
        obj.setNumber(inputNumber);

        while (true) {

            System.out.println("\n1 = Factorial\n2 = Odd/Even\n3 = Armstrong");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting program...");
                break;
            }

            
            if (choice == 1) {
                B factorialObj = new B();
                factorialObj.setNumber(inputNumber);
                System.out.println("Factorial of " + factorialObj.getNumber() + " is: " + factorialObj.factorial());
            } else if (choice == 2) {
                C oddEvenObj = new C();
                oddEvenObj.setNumber(inputNumber);
                System.out.println("The number " + oddEvenObj.getNumber() + " is " + (oddEvenObj.isEven() ? "Even" : "Odd"));
            } else if (choice == 3) {
                D armstrongObj = new D();
                armstrongObj.setNumber(inputNumber);
                System.out.println("The number " + armstrongObj.getNumber() + (armstrongObj.isArmstrong() ? " is an Armstrong number." : " is not an Armstrong number."));
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}