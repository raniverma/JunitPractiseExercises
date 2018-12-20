package com.stackroute.practise1;

import java.util.Scanner;

public class TomJerry {

    public static void main(String aregs[]){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        TomJerry obj=new TomJerry();
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
