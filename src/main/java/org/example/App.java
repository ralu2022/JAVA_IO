package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class App {
    public static void main(String[] args) throws IOException {
        String names = "src/names.txt";
        Path pathNames = Paths.get(names);
        String linesNames = Files.readString(pathNames);

        List<String> nameList = new ArrayList<>();
        nameList.add(linesNames);

        //System.out.println(nameList);

        String grades = "src/grades.txt";
        Path pathGrades = Paths.get(grades);
        String linesGrades = Files.readString(pathGrades);

        List<String> gradeList = new ArrayList<>();
        gradeList.add(linesGrades);

        //System.out.println(gradeList);

        Map<String, String> all = new HashMap<>();

        all.put(linesNames, linesGrades);

        System.out.println(all);

    }
}
