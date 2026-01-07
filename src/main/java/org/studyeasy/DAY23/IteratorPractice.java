package org.studyeasy.DAY23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  07 1/7/2026 12:19 PM
 Project Name : 30Days_Java
 ***/
public class IteratorPractice {
    public static void main(String[] args) {
        List<String> ls =new ArrayList<>();
        ls.add("Tushar");
        ls.add("Thakur");
        ls.add("Rajput");

        Iterator <String> iterator = ls.iterator();//WE can obtain an iterator for my list collection
//        while (iterator.hasNext()){
//            //String aura = iterator.next();//storing the strings i get from the ls in a object
//            //System.out.print(aura+" ");// i am also printing the aura object which is containg the ls elements
//
//        }
        iterator.forEachRemaining((element) -> {
            System.out.println(element);// it can iterate over all the elements remaining in the iterator internally. for each element
            // calls a lambda expression passed as parameter to for eachremaining ()
        });
    }
}
