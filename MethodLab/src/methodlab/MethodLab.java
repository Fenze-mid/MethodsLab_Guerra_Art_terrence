/*
- Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
- Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodlab;
import java.util.Scanner;

/**
 *
 * @author GUERRA_CPE113
 */
public class MethodLab {      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        greetuser(0);
      
        System.out.println("Enter the first number: ");
        int a = input.nextInt(); 
        System.out.println("Enter the second number: ");
        int b = input.nextInt();         
      
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
      
       
           System.out.println("Enter a number for factorial: ");
        int factNum = input.nextInt();
           System.out.println("The factorial is: " + factorial(factNum));
        
        int[] numbers = {15, 15, 15, 15, 15};
        System.out.println("The sum of array elements is: " + sumArray(numbers));
        
             System.out.println("Enter a number to check prime: ");
        int primeNum = input.nextInt();
        if (isPrime(primeNum)) {
              System.out.println(primeNum + " is prime.");
        } else {
            System.out.println(primeNum + " is not prime.");
        }

      
        int[] sampleArray = {12, 45, 89, 23, 67};
        System.out.println("The max element in array is: " + maxInArray(sampleArray));

      
          System.out.println("Enter two numbers for GCD and LCM: ");
        int g1 = input.nextInt();
        int g2 = input.nextInt();
        System.out.println("The GCD is: " + gcd(g1, g2));
        System.out.println("The LCM is: " + lcm(g1, g2));

        input.close();
    }
    
    static void greetuser(int greet){
        System.out.println("Hello user, pls... ");
    } 

    static void addition(int a, int b){
        System.out.println("The addition is: " + (a + b));
    }

    static void subtraction(int a, int b){
        System.out.println("The subtraction is: " + (a - b));
    }

    static void multiplication(int a, int b){
        System.out.println("The multiplication is: " + (a * b));
    }

    static void division(double a, double b){
        System.out.println("The division is: " + (a / b));
    }   
    
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    static int maxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int gcd(int a, int b) { 
        while (b != 0) { 
            int t = b; 
            b = a % b; 
            a = t; 
        } 
        return a; 
    }

    static int lcm(int a, int b) { 
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b; 
   
    }}
