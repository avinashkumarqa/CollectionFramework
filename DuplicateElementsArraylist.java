package Assignments.Arraylist;

/*
   Write a program that takes a list of integers as input and removes all duplicate elements using an ArrayList.
*/

import java.util.*;
import java.util.Scanner;

public class DuplicateElementsArraylist {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          ArrayList<Integer> arrayList = new ArrayList<Integer>();
          String ch = "y";
          while(ch.equalsIgnoreCase("y")){

              System.out.println("Enter element to array: ");
              arrayList.add(sc.nextInt());
              System.out.println("Do you want to continue(y/n): ");
              sc.nextLine();
              ch = sc.nextLine();

          }

        System.out.println(arrayList);
        System.out.println("New arraylist without duplicate values: "+duplicateArraylist(arrayList));

    }//main

    public static List duplicateArraylist(ArrayList<Integer> list){

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for(Integer i: list){

            if(!newList.contains(i)){
                  newList.add(i);
            }
        }

        return newList;
    }
}//class
