package com.example.admin.codingtest;
import  java.util.*;

/**
 * Created by Admin on 8/29/2017.
 */

public class CodingTest {
    public static void main(String[] args) {

        checkdiv();
        System.out.println();
        checkDuplicate();
    }
    private static void checkdiv()
    {
        for(int i =1; i<=20; i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("fizz buzz");
            }
            else if(i%3 == 0)
            {
                System.out.println("fizz");
            }
            else if(i%5 == 0)
            {
                System.out.println("buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    private static void checkDuplicate()
    {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");
        Set<String> stringArrayList2 = new HashSet<String>();

        for(String S: stringArrayList)
        {
            if(!stringArrayList2.add(S))
            {
                System.out.println(S);
            }
        }

    }
}
