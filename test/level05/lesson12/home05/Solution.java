package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int sum = 0;
        String s = "сумма";
        while (true)
        {
            String n = br.readLine();
            if (!n.equals(s))
            {
                int n1 = Integer.parseInt(n);
                sum = sum + n1;}
            else
                break;
            }
        System.out.println(sum);
        }


    }

