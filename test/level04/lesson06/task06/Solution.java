package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String age = br.readLine();
        int age1 = Integer.parseInt(age);
        if (age1 > 20) System.out.println("И 18-ти достаточно");
    }
}
