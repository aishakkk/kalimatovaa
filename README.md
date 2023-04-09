# Assignment 1 Kalimatova

## Task 1
> You are given a number “n” and an array of “n” elements, write the function that returns minimum of them.
### Solution:
```
public static int findMin(int n, int[] arr){
        if(n==1) { // base case
            return arr[0];
        }
        else {
            int min = findMin(n-1, arr); // repeating statement
            return Math.min(min, arr[n-1]);
        }
    }
```

## Task 2
> You are given a number “n” and an array of “n” elements, write the function that returns average of them. 
### Solution:
```
public static double findAvg(int n, int[] arr) {
        double sum = 0; // adding a new value
        for (int i = 0; i < n; i++) { // summing all element of array
            sum += arr[i];
        }
        return sum / n; // returning result
    }
```

## Task 3
> You are given a number “n”, write the function for checking whether “n” is prime.
### Solution:
```
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
```

## Task 4
> You are given a number “n”, write the program using recursion for finding “n!” 
### Solution:
```
public static int findFact(int n) {
        if (n == 1) { // base case
            return 1;
        }
        else {
            return n * findFact(n-1); // repeating statement
        }
    }
```

## Task 5
> You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). F0= 0, F1 = 1.
### Solution:
```
static int findFib(int n) {
        if (n == 1 || n == 2) { // base case
            return 1;
        }
        else {
            return findFib(n-1) + findFib(n-2); // repeating statement
        }
    }
```

## Task 6
> You are given numbers “a” and “n”, write the function that returns “a power of n”. 
### Solution:
```
static int findPow(int a, int n) {
        if (n == 1) { // base case
            return a;
        }
        else {
            return a * findPow(a, n-1); // repeating statement
        }
    }
```

## Task 7
> You are given a number “n” and an array of “n” elements, write the program that returns given array in reverse order without using array data structure.
### Solution:
```
static String findReverse(int n, int[] arr) {
        if (n == 1) { // base case
            return Integer.toString(arr[0]);
        }
        else {
            return Integer.toString(arr[n-1]) + " " + findReverse(n-1, arr); // repeating statement
        }
    }
```

## Task 8
> You are given a string “s”, write the function for checking whether “s” is all consists of digits. 
### Solution:
```
static boolean isAllDigits(String t) {
        if (t.length() == 1) { // base case
            return Character.isDigit(t.charAt(0));
        }
        else {
            return Character.isDigit(t.charAt(0)) && isAllDigits(t.substring(1)); // repeating statement
        }
    }
```

## Task 9
> You are given numbers“n” and “k”,write the program that finds (binomial coefficient)
### Solution:
```
static int findBin(int n, int k) {
        if (k == 0 || k == n) { // base case
            return 1;
        }
        else {
            return findBin(n-1, k-1) + findBin(n-1, k); // repeating stateent
        }
    }
```

## Task 10
> You are given “a” and “b”, write the function for finding GCD(a, b) using recursion. (Hint: Euclidean Algorithm)
### Solution:
```
public static int findGCD(int a, int b) {
        if (b == 0) { // base case
            return a;
        }
        else {
            return findGCD(b, a%b); // repeating statement
        }
    }
```

[![Header](https://vincentdnl.com/static/d39b503cebf83760d389b29b8c66d03b/6a068/semicolon2.jpg "Header")](https://www.instagram.com/oddaishaa)
