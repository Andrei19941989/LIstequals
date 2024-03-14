package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> z =Get(10);//создать список с помощьтю вывода функции
        ArrayList<Integer> v = new ArrayList<>();//создаем спичсок
        v.add(5);
        v.add(7);
        ArrayList<Integer> t = GetList(z,v);//с помощьб фукнции создаюем другой список
        for(int j=0;j<t.size();j++)//проходил цикл по листу созданному выше
        {
            System.out.println(t.get(j));//вывод все эжлементы списка
        }


        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(9);
        a.add(8);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(8);

        System.out.println(equals(a,b));

    }
    public static ArrayList<Integer> Get(int n)//фукнция которая вовращает всех делителей числа n
    {
        ArrayList<Integer> m =new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n % i==0)//
            {
                m.add(i);
            }

        }
        return m;
    }



    public static ArrayList<Integer> GetList(ArrayList<Integer> list1,ArrayList<Integer> list2)//функция которая совсмещает два списка и сортирует
    {
        ArrayList<Integer> listall = new ArrayList<>();
        for(int i=0;i<list1.size();i++)//цткл по первому списку
        {
            listall.add(list1.get(i));
        }
        for(int j=0;j<list2.size();j++)//цикл по втормоу списку
        {
            listall.add(list2.get(j));
        }
        Collections.sort(listall);//сортировка списка
        return listall;
    }



    public static HashSet<Integer> GetSet(ArrayList<Integer> a)
    {
        HashSet<Integer> l=new HashSet<>();
        for(int i =0;i<a.size();i++)
        {
            l.add(a.get(i));
        }

        return l;
    }

    public static Boolean equals(ArrayList<Integer> list1,ArrayList<Integer> list2)
    {
        HashSet<Integer> set1 = GetSet(list1);
        HashSet<Integer> set2 = GetSet((list2));
        if(set1.equals(set2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}



