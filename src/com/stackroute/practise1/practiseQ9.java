package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

    }
    public String reverseString(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;

    }
}
