package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
    int sum = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     while (true)
     {
         String s = br.readLine();
         int s1 = Integer.parseInt(s);
         sum = sum+s1;
         if (s1 == -1)
         {
             System.out.println(sum);
             break;
         }
     }
    }
}
