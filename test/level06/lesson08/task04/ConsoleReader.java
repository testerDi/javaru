package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;

    }

    public static int readInt() throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s1 = Integer.parseInt(br.readLine());
        return s1;

    }

    public static double readDouble() throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double s2 = Double.parseDouble(br.readLine());
        return s2;


    }

    public static boolean readBoolean() throws Exception
    {
        //напишите тут ваш код
        boolean a = true;
        boolean b = false;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s3 = br.readLine();
        if (s3.equals("true"))
        {
            return  a;
        }
            else if
        (s3.equals("false"));

            return b;



    }

}