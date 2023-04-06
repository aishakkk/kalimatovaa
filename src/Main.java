public class Main {
    public static void main(String[] args) {
        String text = "12354";
        System.out.println(isAllNumbers(text));
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
    static boolean isAllNumbers(String t) {
        if (t.length() == 1) {
            return Character.isDigit(t.charAt(0));
        }
        else {
            return Character.isDigit(t.charAt(0)) && isAllNumbers(t.substring(1));
        }
    }
}