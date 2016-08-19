package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int c1 = Integer.parseInt(c);
        int max1 = max(a1,b1);
        int max2 = max(b1,c1);
        int sered = min (max1, max2);
        System.out.println(sered);
    }
    public static int min (int a,int b)
    {
     if (a < b) return a;
        else
         return b;
    }
    public static int max (int a, int b)
    {
        if (a < b) return b;
        else
            return a;
    }
}
