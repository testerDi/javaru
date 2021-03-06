package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int  maximum;
        int  minimum;

        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
        }

        minimum = list.get(0);
        maximum = list.get(1);
        for (int i = 0; i < 20; i++)
        {
          int s = list.get(i);
            if (minimum >= s){
                minimum = s;
            }
            else if (maximum <= s)
            {
                maximum = s;
            }
        }

        System.out.println(maximum + " " + minimum);
        //System.out.println(minimum);
    }

}

