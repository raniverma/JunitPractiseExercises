package com.stackroute.practise1;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Palindrome obj=new Palindrome();
        boolean ans=obj.palindrome(str);

    }

    public boolean palindrome(String str){
        StringBuilder sb=new StringBuilder(str);

        int flag=0,sum=0;
        if((sb.reverse().toString()).equals(str)) {
            flag = 1;
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}
