package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] list = new int[5];
        for (int i = 0; i < 5; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
        }
        sort(list);
        for (int x : list)
        {
            System.out.println(x);
        }
    }
    public static void sort(int[] list)
    {
        int min;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list.length - i - 1; j++)
            {
                if (list[j] > list[j + 1])
                {
                    min = list[j];
                    list[j] = list[j+1];
                    list[j+1] = min;
                }
            }
        }

    }
}

