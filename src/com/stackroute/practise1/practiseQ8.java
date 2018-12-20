package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ8 {
    public static void main(String args[]){
        int target=100;
        Scanner sc=new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if (n < target) {
                System.out.println("Number guessed is less than original number.");
            }
            else if(n>target){
                System.out.println("Number guessed is more than original number.");
            }
            else  if(n==target){
                System.out.println("Number guessed matches the original number.");
                break;
            }
        }

    }

    public String searchTarget(int n){
        int target=100;
        int flag=0;
        while(true && flag==0) {
            if (n < target) {
                return "Number guessed is less than original number.";
            }
            else if(n>target){
                return "Number guessed is more than original number.";
            }
            else if(n==target){
                flag=1;
            }
        }
        return "Number guessed matches the original number.";
    }
}
