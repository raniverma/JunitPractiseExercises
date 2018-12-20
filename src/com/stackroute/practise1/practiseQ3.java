package com.stackroute.practise1;

import java.util.Arrays;
import java.util.Scanner;

public class practiseQ3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
    }
    public String[] checkEachCharType(String str){
        String arr[]=new String[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>='a'&& (str.charAt(i)<='z'))||(str.charAt(i)>='A'&& (str.charAt(i)<='Z'))) {

                if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') ||
                        (str.charAt(i) == 'o') || (str.charAt(i) == 'u') || (str.charAt(i) == 'A') ||
                        (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O') ||
                        (str.charAt(i) == 'U')) {
                   // System.out.print("Vowel ");
                    arr[i]="Vowel";

                } else
                   // System.out.print("Consonant ");
                   arr[i]="Consonant";
            }
            else{
               // System.out.println("error");
                arr[i]="error";
                break;
            }
        }
        return arr;
    }
}
