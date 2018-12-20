package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);
    }

    public String checkChar(char ch){

        if(ch>='a'&&ch<='z'){
            return "Small letter";
        }
        else if(ch>='A'&&ch<='Z'){
            return "Capital letter";
        }
        else if(ch>='0' && ch<='9'){
            return "digit";
        }
        else
            return "Special symbol";
    }
}
