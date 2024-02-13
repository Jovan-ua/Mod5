package org.example;

public class Main {
    public static void main(String[] args) {
         fLoop(6);
        System.out.println(fRecursive(6));
        System.out.println(fDP(6));
    }

    //O(n) time complexity
    //O(1) Memory complexity
    private static void fLoop(int n) {
        int first = 0;
        int second = 1;
        int next;
        for (int i = 1; i <= n+1; i++) {
            System.out.println((first));
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println("______________________");
    }
    //O(2^n) time complexity
    //O(n) Memory complexity
    private static int fRecursive(int n) {

        if (n < 2) {
            return n;
        } else {
            return fRecursive(n - 1) + fRecursive(n - 2);
        }
    }
    //O(n) time complexity
    //O(n) Memory complexity
    private static int fDP(int n){
        if(n < 2){
            return n;
        }
        int [] fArr = new int[n+1];
        fArr[0] = 0;
        fArr[1] = 1;
        for (int i = 2; i <= n; i++){
           fArr[i] = fArr[i - 1] + fArr[i - 2];
        }
        return fArr[n];
    }
}