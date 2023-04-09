import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the problem to solve (1-10): ");
        int answer = sc.nextInt();
        switch (answer) {
            case 1:
                System.out.println("First problem... Enter a length, and array");
                int n1 = sc.nextInt();
                int[] arr1 = new int[n1];
                for (int i = 0; i < n1; i++) {
                    arr1[i] = sc.nextInt();
                }
                System.out.println(findMin(n1, arr1));
            case 2:
                System.out.println("Second problem... Enter a length, and array");
                int n2 = sc.nextInt();
                int[] arr2 = new int[n2];
                for (int i = 0; i < n2; i++) {
                    arr2[i] = sc.nextInt();
                }
                System.out.println(findAvg(n2, arr2));
            case 3:
                System.out.print("Third problem... Enter your number: ");
                int n3 = sc.nextInt();
                System.out.println(isPrime(n3));
            case 4:
                System.out.print("Fourth problem... Enter your number: ");
                int n4 = sc.nextInt();
                System.out.println(findFact(n4));
            case 5:
                System.out.print("Fifth problem... Enter your number: ");
                int n5 = sc.nextInt();
                System.out.println(findFib(n5));
            case 6:
                System.out.println("Sixth problem... Enter your numbers");
                int a6 = sc.nextInt();
                int n6 = sc.nextInt();
                System.out.println(findPow(a6, n6));
            case 7:
                System.out.println("Seventh problem... Enter a length, and array");
                int n7 = sc.nextInt();
                int[] arr7 = new int[n7];
                for (int i = 0; i < n7; i++) {
                    arr7[i] = sc.nextInt();
                }
                System.out.println(findReverse(n7, arr7));
            case 8:
                System.out.print("Eighth problem... Enter your text: ");
                String text = sc.nextLine();
                System.out.println(isAllDigits(text));
            case 9:
                System.out.println("Ninth problem... Enter your numbers");
                int n9 = sc.nextInt();
                int k9 = sc.nextInt();
                System.out.println(findBin(n9, k9));
            case 10:
                System.out.println("Sixth problem... Enter your numbers");
                int a10 = sc.nextInt();
                int b10 = sc.nextInt();
                System.out.println(findGCD(a10, b10));
        }
    }
    /**
     * findMin - function find a minimum number from given array
     *
     * @param n - length of given array
     * @param arr - array to work with them
     * @return - returns minimum number of array
     */
    public static int findMin(int n, int[] arr){
        if(n==1) { // base case
            return arr[0];
        }
        else {
            int min = findMin(n-1, arr); // repeating statement
            return Math.min(min, arr[n-1]);
        }
    }
    /**
     * findAvg - function find average of all elements of array
     *
     * @param n - length of given array
     * @param arr - array to work with them
     * @return - returns average of array
     */
    public static double findAvg(int n, int[] arr) {
        double sum = 0; // adding a new value
        for (int i = 0; i < n; i++) { // summing all element of array
            sum += arr[i];
        }
        return sum / n; // returning result
    }
    /**
     * isPrime - function checking is the given number prime or composite
     *
     * @param n - number to check
     * @return - returns true if number prime, false otherwise
     */
    public static boolean isPrime(int n) {
        int div = 0; // adding new value
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { // checking for divisible
                div++;
            }
        }
        if (div == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * findFact - function find factorial of given number
     *
     * @param n - number to find factorial
     * @return - return factorial of number
     */
    public static int findFact(int n) {
        if (n == 1) { // base case
            return 1;
        }
        else {
            return n * findFact(n-1); // repeating statement
        }
    }
    /**
     * findFib - function find fibonacci number
     *
     * @param n - fibonacci number to find
     * @return - returns founded fibonacci number
     */
    static int findFib(int n) {
        if (n == 1 || n == 2) { // base case
            return 1;
        }
        else {
            return findFib(n-1) + findFib(n-2); // repeating statement
        }
    }
    /**
     * findPow - function find result of power of two given numbers
     *
     * @param a - number
     * @param n - power of number
     * @return - returns a power of n
     */
    static int findPow(int a, int n) {
        if (n == 1) { // base case
            return a;
        }
        else {
            return a * findPow(a, n-1); // repeating statement
        }
    }
    /**
     * getReverse - function return reverse of array with string
     *
     * @param n - length of given array
     * @param arr - array to reverse
     * @return - reverse string
     */
    static String findReverse(int n, int[] arr) {
        if (n == 1) { // base case
            return Integer.toString(arr[0]);
        }
        else {
            return Integer.toString(arr[n-1]) + " " + findReverse(n-1, arr); // repeating statement
        }
    }
    /**
     * isAllDigits - function that check is all string contain digits
     *
     * @param t - given string to check
     * @return - returns true if string contain all digits, false otherwise
     */
    static boolean isAllDigits(String t) {
        if (t.length() == 1) { // base case
            return Character.isDigit(t.charAt(0));
        }
        else {
            return Character.isDigit(t.charAt(0)) && isAllDigits(t.substring(1)); // repeating statement
        }
    }
    /**
     * findBin - function find binomial coefficient by two number
     *
     * @param n - first bottom argument
     * @param k - second top argument
     * @return - returns binomial coefficient of two numbers
     */
    static int findBin(int n, int k) {
        if (k == 0 || k == n) { // base case
            return 1;
        }
        else {
            return findBin(n-1, k-1) + findBin(n-1, k); // repeating stateent
        }
    }
    /**
     * findGCD - function find the greatest common divisor of two numbers
     *
     * @param a - first number
     * @param b - second number
     * @return - returns gcd of two numbers
     */
    public static int findGCD(int a, int b) {
        if (b == 0) { // base case
            return a;
        }
        else {
            return findGCD(b, a%b); // repeating statement
        }
    }
}