package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
    BufferedReader br = new BufferedReader(( new InputStreamReader(System.in)));
     String b1= br.readLine();
     String b2= br.readLine();
     String b3= br.readLine();
        int b11=Integer.parseInt(b1);
        int b22=Integer.parseInt(b2);
        int b33=Integer.parseInt(b3);
        int max1 = max(b11,b22);
        int max2 = max(b22,b33);
        int min1= min(b11,b22);
        int min2=min(b22,b33);
        System.out.println(max(max1,max2));
        System.out.println(min(max1,max2));
        System.out.println(min(min1,min2));
    }
 public static int max(int a, int b){
if ( a>b) return a;
   else return b;
}
    public static int min(int a, int b){
        if ( a<b) return a;
        else return b;
    }
}

