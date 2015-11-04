package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String b1= br.readLine();
String b2=br.readLine();
        int b11=Integer.parseInt(b1);
        int b22=Integer.parseInt(b2);
        if (b11>b22)
        {
            System.out.println(b22);
        }else{
                System.out.print(b11);
            }
        }

    }
