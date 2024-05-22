package com.modernjava.var;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VarTypeExample {


    //var in the class properties are not allowed.
    //private var x = "abc";


    public static void main(String[] args) {

        var names = List.of("miel", "kim", "bella");

        for (var name : names) {
            System.out.println(name);
        }


        var map = Map.ofEntries(Map.entry("names", names));

        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));



        var NAME = transform("miel");
        System.out.println(NAME);


    }

    static String transform(String name) { // var in the function argument is not allowed

        return name.toUpperCase();

    }

}

