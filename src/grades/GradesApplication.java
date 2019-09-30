package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GradesApplication {
//    Create a map for students and GitHub usernames
//
//    Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.
//    Be creative! Make up GitHub usernames and grades for your student objects.
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student annette = new Student("Annette");
        annette.addGrade(90);
        annette.addGrade(85);
        annette.addGrade(40);

        Student bridget = new Student ("Bridget");
        bridget.addGrade(90);
        bridget.addGrade(70);
        bridget.addGrade(60);


        Student bev = new Student("Bev");
        annette.addGrade(97);
        annette.addGrade(96);
        annette.addGrade(95);


        Student glo = new Student("Glo");
        annette.addGrade(94);
        annette.addGrade(93);
        annette.addGrade(92);



        students.put("bmills", bridget);
        students.put("annette1", annette);
        students.put("bevvybev", bev);
        students.put("thegloUp", glo);

            String nameList = " | ";

        for(String username : students.keySet()){
            nameList += " " + username + " | ";

        }
            System.out.println(nameList);




    }

}
