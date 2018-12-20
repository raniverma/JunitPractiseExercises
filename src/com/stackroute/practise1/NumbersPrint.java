package com.stackroute.practise1;

import java.util.Scanner;

public class NumbersPrint {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
    }
    public String numbersPrint(int n){
        int c=0;
        String arr="";
        if(n==0)
            return"error";
        int val=1;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=i;j<=i;) {
                if(count>=j)
                    break;
                else {
                    arr+=j;
                    count++;
                }
            }
        }
        return arr;
    }
}
