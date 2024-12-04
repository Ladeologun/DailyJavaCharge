package org.example;


import org.example.sampleClasses.Student;
import org.example.solutionClasses.DeserializeFootballPlayer;
import org.example.solutionClasses.JsonAlias;
import org.example.solutionClasses.SerializeFootballPlayer;
import org.example.solutionClasses.SerializeList;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        SerializeFootballPlayer.handleFootballerSerialization();
        DeserializeFootballPlayer.handleFootballerDeserialization();
        SerializeList.handleSerializeList();
        JsonAlias.useJsonAlias();

        Optional<Student> student = Optional.of(new Student());
        Student mac =  student.filter((stu)->(stu.getAge()<7)).orElse(new Student("lade",7));
        System.out.println(mac.getAge());


    }
}