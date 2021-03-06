package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private  int left;
    private int top;
    private int width ;
    private int height ;

    public Rectangle(int left, int top, int width, int height)
            //-	заданы 4 параметра: left, top, width, height
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }


    public Rectangle(int left, int top)
    //ширина/высота не задана (оба равны 0)
    {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }


    public Rectangle(int left, int top, int width)
    //высота не задана (равно ширине) создаём квадрат
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle r)
    //создаём копию другого прямоугольника (он и передаётся в параметрах)
    {
        this.left = r.left;
        this.top = r.top;
        this.width = r.width;
        this.height = r.height;
    }
}
