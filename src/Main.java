public class Main {
    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        System.out.println(findGCD(a, b));
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