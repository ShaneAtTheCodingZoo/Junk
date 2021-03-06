package com.thecodingzoo.lessons.advanced.streams.done;

import com.thecodingzoo.lessons.advanced.streams.Student;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToHashmapExample {
    public static void main(String[] args) {
        List<Student> students = findStudentList();
        Map<String, Student> studentMap1 = students.stream()
                .collect(Collectors.toMap(Student::getName, Function.identity()));

        //What to do with clashing keys
        Map<String, Student> studentMap2 = students.stream()
                .collect(Collectors
                        .toMap(Student::getName,
                                Function.identity(),
                                (a, b) -> b
                        ));

        //How to specify what type of map
        Map<String, Student> studentMap3 = students.stream()
                .collect(Collectors
                        .toMap(Student::getName,
                                Function.identity(),
                                (a, b) -> b,
                                LinkedHashMap::new
                        ));

    }

    private static List<Student>  findStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shane",35, "123-333-4744" ));
        students.add(new Student("Nick",12, "123-333-4464" ));
        students.add(new Student("Chiayi",12, "123-333-4454" ));
        students.add(new Student("ting-hui",35, "223-333-4444" ));

        return students;
    }


}
