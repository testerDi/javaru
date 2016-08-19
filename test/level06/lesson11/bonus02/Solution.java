package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfather = reader.readLine();
        Cat catGrandfather = new Cat(grandfather, null, null);

        String grandmother = reader.readLine();
        Cat catGrandmother = new Cat(grandmother, null, null);

        String father = reader.readLine();
        Cat catFather = new Cat (father, catGrandfather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat (motherName, null, catGrandmother);

        String sonName = reader.readLine();
        Cat catSonName = new Cat (sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat (daughterName, catFather, catMother);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSonName);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat (String name) { this.name = name;}

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            if (mother == null)
            {
                if (father == null)

                    return "Cat name is " + name + ", no mother" + ", no father ";
                else
                    return "Cat name is " + name + ", no mother" + ", father is "+father.name;
            } else
            {
                if (father == null)
                {
                    return "Cat name is " + name +", mother is "+ mother.name + ", no father";}
                    else return "Cat name is " + name +", mother is "+ mother.name + ", father is "+father.name;
                }
            }

        }
}

