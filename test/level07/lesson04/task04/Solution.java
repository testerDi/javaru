package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int list[] = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++)
        {
            list[i] = Integer.parseInt(br.readLine());
        }
        for (int j = list.length-1; j >= 0; j--)
        {
            System.out.println(list[j]);
        }

    }
}
