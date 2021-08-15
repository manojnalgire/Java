package com.company;

import java.sql.SQLOutput;

public class cwh_10_resulting_data_type {
    public static void main(String[] args) {
       /* int a = 654 + 6;

        short c = 4 + 9;
        byte d = 7 + 2;
        float b = 5.35f + c;
        System.out.println("b =" + b);*/



/* b =byte , f =float , s=short , d=double ,
 i=integer(int) , c=character, l=long.*/

/* R = b+s = int ,R =s+i =int , R=l+f + float ,R=i+f = float ,
 R=c+i =int ,R=c+s =int , R=l+d =double , R=f+d= double*/


        // Increment and Decrement Operations
        int i = 56;
        //int b = i++;
        //First j is increment i (56) than i is incremented.
        int j = 67;
        int c = ++j;
        // First j is incremented than c is assigned.
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(j++);

        System.out.println(i);
        int y = 7;
        System.out.println(++y*8);
        char ch = 'A';
        System.out.println(ch++);
        System.out.println(++ch);




    }
}




