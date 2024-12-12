class Number {
    int num;
  
    Number(int num) {
      this.num = num;
    }
  }
  
  class Palindrome extends Number {
    Palindrome(int num) {
      super(num);
    }
  
    boolean isPalindrome() {
      int reversed = 0;
      int original = num;
  
      while (original != 0) {
        int digit = original % 10;
        reversed = reversed * 10 + digit;
        original /= 10;
      }
  
      return num == reversed;
    }
  }
  
  class Armstrong extends Number {
    Armstrong(int num) {
      super(num);
    }
  
    boolean isArmstrong() {
      int sum = 0;
      int original = num;
  
      while (original != 0) {
        int digit = original % 10;
        sum += digit * digit * digit;
        original /= 10;
      }
  
      return num == sum;
    }
  }
  
  class Fibonacci extends Number {
    Fibonacci(int num) {
      super(num);
    }
  
    boolean isFibonacci() {
      int a = 0;
      int b = 1;
  
      while (a < num) {
        int temp = a;
        a = b;
        b = temp + b;
      }
  
      return a == num;
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      int num = 153;
  
      Palindrome palindrome = new Palindrome(num);
      Armstrong armstrong = new Armstrong(num);
      Fibonacci fibonacci = new Fibonacci(num);
  
      System.out.println(num + " is palindrome: " + palindrome.isPalindrome());
      System.out.println(num + " is armstrong: " + armstrong.isArmstrong());
      System.out.println(num + " is fibonacci: " + fibonacci.isFibonacci());
    }
  }