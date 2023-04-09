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
    public static int findMin(int n, int[] arr){
        if(n==1) {
            return arr[0];
        }
        else {
            int min = findMin(n-1, arr);
            return Math.min(min, arr[n-1]);
        }
    }
    public static double findAvg(int n, int[] arr) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }
    public static boolean isPrime(int n) {
        int div = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
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
    public static int findFact(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * findFact(n-1);
        }
    }
    static int findFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return findFib(n-1) + findFib(n-2);
        }
    }
    static int findPow(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            return a * findPow(a, n-1);
        }
    }
    static String findReverse(int n, int[] arr) {
        if (n == 1) {
            return Integer.toString(arr[0]);
        }
        else {
            return Integer.toString(arr[n-1]) + " " + findReverse(n-1, arr);
        }
    }
    static boolean isAllDigits(String t) {
        if (t.length() == 1) {
            return Character.isDigit(t.charAt(0));
        }
        else {
            return Character.isDigit(t.charAt(0)) && isAllDigits(t.substring(1));
        }
    }
    static int findBin(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        else {
            return findBin(n-1, k-1) + findBin(n-1, k);
        }
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return findGCD(b, a%b);
        }
    }
}