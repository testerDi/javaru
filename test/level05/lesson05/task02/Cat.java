package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;

    }

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Cat cat1 = new Cat("vasya", 2, 3, 4);
        Cat cat2 = new Cat("barsik", 2, 3, 5);

      System.out.print(cat1.fight(cat2));
    }

        public boolean fight (Cat anotherCat)
        {
            //напишите тут ваш код
            if (this.strength >= anotherCat.strength)
            {
                return true;

            } else
                return false;


        }


    }
