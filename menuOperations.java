import java.util.Scanner;

class A {
    public void switchCaseExample(int option) {
        switch (option) {
            case 1:
                System.out.println("Option 1 selected!");
                break;
            case 2:
                System.out.println("Option 2 selected!");
                break;
            case 3:
                System.out.println("Option 3 selected!");
                break;
            default:
                System.out.println("Invalid option selected");
        }
    }
}

class B {
    public int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial of negative number does not exist");
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

class C {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}

class D {
    public boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int numberOfDigits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        return result == originalNum;
    }
}

public class menuOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A classA = new A();
        B classB = new B();
        C classC = new C();
        D classD = new D();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Switch to class A");
            System.out.println("2. Calculate factorial");
            System.out.println("3. Check if a number is even or odd");
            System.out.println("4. Check Armstrong number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an option for switching to class A: ");
                    int switchOption = scanner.nextInt();
                    classA.switchCaseExample(switchOption);
                    break;

                case 2:
                    System.out.println("Enter a number to calculate its factorial: ");
                    int num = scanner.nextInt();
                    int fact = classB.factorial(num);
                    if (fact == 0) {
                        System.out.println(num+" is not a Factorial Num");
                    } else {
                        System.out.println("Factorial of " + num + " is: ");
                    }
                    // System.out.println("Factorial of " + num + " is: " + fact);
                    break;

                case 3:
                    System.out.println("Enter a number to check if it is even or odd: ");
                    int number = scanner.nextInt();
                    if (classC.isEven(number)) {
                        System.out.println(number + " is even");
                    } else {
                        System.out.println(number + " is odd");
                    }
                    break;

                case 4:
                    System.out.println("Enter a number to check if it is an Armstrong number: ");
                    int armstorngNum = scanner.nextInt();
                    if (classD.isArmstrong(armstorngNum)) {
                        System.out.println(armstorngNum + " is an Armstrong number");
                    } else {
                        System.out.println(armstorngNum + " is not an Armstrong number");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

        }
    }
}



/*
Out-put

javac menuOperations.java
java menuOperations


Select an option:
1. Switch to class A
2. Calculate factorial
3. Check if a number is even or odd
4. Check Armstrong number
5. Exit
Enter your choice: 1
Enter an option for switching to class A: 
2
Option 2 selected!

Select an option:
1. Switch to class A
2. Calculate factorial
3. Check if a number is even or odd
4. Check Armstrong number
5. Exit
Enter your choice: 2
Enter a number to calculate its factorial: 
80
80 is not a Factorial Num

Select an option:
1. Switch to class A
2. Calculate factorial
3. Check if a number is even or odd
4. Check Armstrong number
5. Exit
Enter your choice: 3
Enter a number to check if it is even or odd: 
80
80 is even

Select an option:
1. Switch to class A
2. Calculate factorial
3. Check if a number is even or odd
4. Check Armstrong number
5. Exit
Enter your choice: 4
Enter a number to check if it is an Armstrong number: 
80
80 is not an Armstrong number

Select an option:
1. Switch to class A
2. Calculate factorial
3. Check if a number is even or odd
4. Check Armstrong number
5. Exit
Enter your choice: 5

Exiting the program.
 */