package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ2{

    public static void main(String aregs[]){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        practiseQ2 obj=new practiseQ2();
        String ans=obj.tomJerry(n);
        System.out.println(ans);
    }
    public String tomJerry(int n){
        if(n%2!=0 && (n>20 && n<30))
            return "Tom";
        else if(n%2==0 && (n>20 && n<30))
            return "Jerry";
        else
            return "Other";
    }
}
