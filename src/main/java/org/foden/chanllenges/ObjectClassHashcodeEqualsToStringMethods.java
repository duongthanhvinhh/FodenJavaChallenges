package org.foden.chanllenges;

import java.util.*;

public class ObjectClassHashcodeEqualsToStringMethods {

    int age;
    String name;
    ObjectClassHashcodeEqualsToStringMethods(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Somethings[age: " + age + ", name: " + name + "]";
    }

    @Override
    public boolean equals(Object somethings){
        //Check reference
        if (this == somethings) return true;
        if (somethings == null || this.getClass() != somethings.getClass()) return false;
        //Safe cast type
        ObjectClassHashcodeEqualsToStringMethods obj = (ObjectClassHashcodeEqualsToStringMethods) somethings;
        return this.age == obj.age && this.name.equals(obj.name);
    }

    //If we don't override this hashCode here, then the line 43 will return null as hashmap cannot get "Foden" by key somethings1
    //because the hashId of somethings1 != somethings.
    @Override
    public int hashCode(){
        return Objects.hashCode(age) + 346875555;
    }

    public static void main(String[] args) {
        ObjectClassHashcodeEqualsToStringMethods objectClassHashcodeEqualsToStringMethods = new ObjectClassHashcodeEqualsToStringMethods(27, "Foden");
        ObjectClassHashcodeEqualsToStringMethods objectClassHashcodeEqualsToStringMethods1 = new ObjectClassHashcodeEqualsToStringMethods(27, "Foden");
        System.out.println(objectClassHashcodeEqualsToStringMethods.hashCode());
        System.out.println(objectClassHashcodeEqualsToStringMethods1.hashCode());
        System.out.println(objectClassHashcodeEqualsToStringMethods);
        System.out.println(objectClassHashcodeEqualsToStringMethods == objectClassHashcodeEqualsToStringMethods1);
        System.out.println(objectClassHashcodeEqualsToStringMethods.equals(objectClassHashcodeEqualsToStringMethods1));
        HashMap<ObjectClassHashcodeEqualsToStringMethods, String> hashMap = new HashMap<>();
        hashMap.put(objectClassHashcodeEqualsToStringMethods, "Foden");
        System.out.println(hashMap.get(objectClassHashcodeEqualsToStringMethods1));
    }
}
