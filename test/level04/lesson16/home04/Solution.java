package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int data_y = Integer.parseInt(br.readLine());
        int data_m = Integer.parseInt(br.readLine());
        int data_d = Integer.parseInt(br.readLine());
        System.out.println("Меня зовут "+ name);
        System.out.println("Я родился "+data_d+"."+data_m+"."+data_y);
    }
}
