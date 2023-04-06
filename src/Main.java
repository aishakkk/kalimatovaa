public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        double avg = findAvg(arr.length, arr);
        System.out.println("Min from arr is: " + avg);
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
}