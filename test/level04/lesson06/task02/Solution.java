package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b1 = br.readLine();
        String b2 = br.readLine();
        String b3 = br.readLine();
        String b4 = br.readLine();
        int b11 = Integer.parseInt(b1);
        int b22 = Integer.parseInt(b2);
        int b33 = Integer.parseInt(b3);
        int b44 = Integer.parseInt(b4);
        if (b11 > b22 && b11 > b33 && b11 > b44)
        {
            System.out.println(b11);
        } else
        {
            if (b22 > b11 && b22 > b33 && b22 > b44)
            {
                System.out.println(b22);
            } else
            {
                if (b33 > b11 && b33 > b22 && b33 > b44)
                {
                    System.out.println(b33);
                } else
                {
                    if (b44 > b11 && b44 > b33 && b44 > b22)
                    {
                        System.out.println(b44);
                    }
                }
            }
        }
    }
}



