package org.example;

public class Main {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,2,5,11,34,78,54,3,9,55,23,76,10,22,67,12,45};

        int first = -1;

        for ( int i = 0 ; i < a.length ; i++){
            if (a[i]==10){
                first = i;
                break;
            }
        }

        if (first != -1) {
            System.out.println("The first occurrence of the number 10 is at index: " + first);
        } else {
            System.out.println("The number 10 is not found in the array.");
        }


    }
}