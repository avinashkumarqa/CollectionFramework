package Assignments.Arraylist;

/*
Create a method that accepts two ArrayLists of strings,
and returns a new ArrayList containing the common elements between the two input lists.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElementsArraylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        String ch = "y";

        //elements of first array
        while(ch.equalsIgnoreCase("y")){

            System.out.println("Enter String elements for first array: ");
            arrayList1.add(sc.nextLine());
            System.out.println("Do you want to continue(y/n): ");
            ch = sc.nextLine();
        }

        ch = "y";
        //elements of second array
        while(ch.equalsIgnoreCase("y")){

            System.out.println("Enter String elements for second array: ");
            arrayList2.add(sc.nextLine());
            System.out.println("Do you want to continue(y/n): ");
            ch = sc.nextLine();

        }

        System.out.println(arrayList1);
        System.out.println(arrayList2);
        System.out.println("Common elements are: "+commonArraylist(arrayList1,arrayList2));
    }//main

    public static List commonArraylist(ArrayList<String> list1 , ArrayList<String> list2){

        ArrayList<String> newList = new ArrayList<String>();

        for(int i = 0;i<list1.size();i++){
            for(int j = 0; j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j)))
                    if(!newList.contains(list1.get(i))){

                        newList.add(list1.get(i));
                }
            }
        }

        return newList;
    }

}//class
