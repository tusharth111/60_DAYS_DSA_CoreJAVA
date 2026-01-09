package org.studyeasy.DAY25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  09 1/9/2026 10:18 AM
 Project Name : 30Days_Java
 ***/
public class StreamTutorial {
    public static void main(String[] args) throws IOException {
        //System.out.println(IntStream.range(1,5).sum()); this line is to print the sum of the range specifoed in the range meth0d
                //.skip(5)//skip the first 5 elements from range and start from 6 to 9;
                //.forEach(x -> System.out.println(x));
        //Stream of string
        //Stream.of("Ava","Aneril","Alberto").sorted().findFirst().ifPresent(x-> System.out.println(x));// this stream take a Stream of some strings and use .sorted() to sort the stream of strings
        // and .findFirst() get the first element in the sorted stream of strings and check using .ifPresent(x->sout(x)) if it is present and print that value
        //String[] arr ={"Al","Ankit","Kushal","Vikram","Sarika","Sakshi","Siya","Riya","Lavanya"};
        //Arrays.stream(arr).filter(x -> x.startsWith("S")).sorted().forEach(x -> System.out.println(x));
        // Arrays.stream(arr) is used to create a stream of arrays and .filter(x-> x.startsWith("S") is used to filter the array with those object in the array stream which start with "S"
        // AND .sorted() is then used to sort the stream of object we get and then we use Foreach() to print each object we get and print it on the terminal
        /*Arrays.stream(new int [] {2,4,6,8,10})
                .map(x -> x*x)// it is used to apply a operions on the stream elements
                .average()
                .ifPresent(x -> System.out.println(x));*/

        /*List<String> people = Arrays.asList("Al","Ankit","Kushal","Vikram","Sarika","Sakshi","Siya","Riya","Lavanya");
        people.stream().map(String :: toLowerCase)//map the stream of object  into lowercase and then filter them according into that object start with "s"
                .filter(x -> x.startsWith("s"))
                .forEach(x -> System.out.println(x));*/
//        Stream<String> song = Files.lines(Paths.get("Songs.txt"));
//        song.sorted()
//                .filter(x ->x.length() < 10)
//                .forEach(x -> System.out.println(x));
//        song.close();//this is used to close the stream and help free the resources and prvent memory leaks
        Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length ==2)
                .filter(x -> Integer.parseInt(x[1])>30)
                .forEach(x -> System.out.println(x[0]+" "+ x[1] ));
        rows2.close();

    }
}
