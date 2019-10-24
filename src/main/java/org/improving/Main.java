package org.improving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       List<String> Students = new ArrayList<>();
       Students.addAll(Arrays.asList("Jennifer", "Paloma", "Ethan"));
       for (String student: Students){
           System.out.println(student);
       }
    }
}
