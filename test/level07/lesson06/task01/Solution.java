package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*for (int i = 0; i < 5; i++)
        {
            String s = br.readLine();
            list.add(s);
            //System.out.println(list.get(i));
        }*/
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.add("hello5");

        System.out.println(list.size());
        for (int i = 0; i < 5; i++)
        {

            System.out.println(list.get(i));
        }

    }
}
