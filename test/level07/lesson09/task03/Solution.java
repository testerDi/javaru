package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < 6; i++)
        {
            {
                //if (i % 2 == 0)

                    list.add(i + 1, "именно");
                i++;
                //System.out.println(list.get(i));
            }


        }
        for (int j = 0; j < list.size(); j++)
        {
            //list.add(i+1, "именно");
            System.out.println(list.get(j));
        }
    }
}
