public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        int min = findMin(arr.length, arr);
        System.out.println("Min from arr is: " + min);
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
}