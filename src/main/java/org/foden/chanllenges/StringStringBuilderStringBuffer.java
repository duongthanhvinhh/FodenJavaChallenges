package org.foden.chanllenges;

import java.util.function.Predicate;

public class StringStringBuilderStringBuffer {

    public static void main(String[] args) {

        //String immutable, low performance if want't to work with chaining string in loop
        String name = "Foden";
        String name1 = "Foden";
        System.out.println(name == name1); //true, because 2 variables with the same content will be pointed to the same references in String pool, instead of creating 2 different references.
        name.toUpperCase(); //We don't assign the new string of toUpperCase to a variable, so the new string object will be removed by GC after stack is done
        System.out.println(name); //output is still Foden, because String is immutable
        //but if we reassigned
        name = name.toUpperCase(); //JVM will create another object here and reassign the name variable to that new reference.
        System.out.println(name); //output is FODEN
        String str1 = new String("Foden");
        String str2 = new String("Foden");
        System.out.println(str1 == str2); //false because the reference of 2 strings is differences.
        System.out.println(str1.equals(str2)); //true - because String override the equals method of Object class, only validate the content of 2 strings.
        String string1 = "Foden";
        String string2 = "   Foden  ".trim();
        System.out.println(string1 == string2); //false, because pool is created at compile-time, but trim() is evaluated at run-time
        String string3 = "Foden";
        String string4 = "   Foden  ".trim().intern(); //use intern() to tell the compiler that need to evaluate the trim() method
        System.out.println(string3 == string4); //true

        //StringBuilder mutable, high performance in case chaining string in loop - not thread-safe
        StringBuilder stringBuilder = new StringBuilder("Foden");
        StringBuilder stringBuilder1 = new StringBuilder("Foden");
        StringBuilder stringBuilder2 = new StringBuilder("Foden");
        stringBuilder.append(" Duong");
        System.out.println(stringBuilder); //output is Foden Duong - because StringBuilder is mutable
        System.out.println(stringBuilder1.equals(stringBuilder2)); //false, because StringBuilder does not override the equals method of Object class like String class.
        //To compare, we need to covert string builder to string
        System.out.println(stringBuilder1.toString().equals(stringBuilder2.toString())); //true
        //There is one exception of StringBuilder, the metod subString is not mutable
        stringBuilder.substring(3);
        System.out.println(stringBuilder); //output is still Foden Duong

        //StringBuffer mutable, thread-safe because all methods is implemented with synchronized, but low performance compared to StringBuilder

    }
}

