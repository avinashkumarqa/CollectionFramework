package Assignments.Arraylist;

/*
Write a program that takes a list of integers as input, and reverses the order of the elements using an ArrayList.
*/

import java.util.*;
import java.util.Scanner;

public class ElementReverseArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<Integer>();
        String ch = "y";
        while(ch.equalsIgnoreCase("y")){

            System.out.println("Enter element to array: ");
            arrayList.add(sc.nextInt());
            System.out.println("Do you want to continue(y/n): ");
            sc.nextLine();
            ch = sc.nextLine();

        }

        System.out.println("Elements of array: "+arrayList);
        System.out.println("Reverse elements of array: "+reverseElement(arrayList));
    }//main

    public static List reverseElement(List<Integer> list){
        List<Integer> newList = new ArrayList<Integer>();
        for(int i=list.size()-1;i>=0;i--){

              newList.add(list.get(i));
        }
        return newList;
    }

}//class
