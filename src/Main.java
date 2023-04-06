public class Main {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n));
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
}