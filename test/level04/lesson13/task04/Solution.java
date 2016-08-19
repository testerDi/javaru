package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
     int s = 8;
        for (int i = 0; i < 10; i++){

                System.out.print(s);
                //System.out.print(" ");
            }
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println(s);
        }
    }
}
