package Lessons;

import Student.StudentClass;

import java.util.ArrayList;

public class Science extends LessonClass   {
    private ArrayList<String>topicList=new ArrayList<>();

    public Science(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList.add("Animal Habitats");
        topicList.add("Ball Launcher Challenge");
        topicList.add("Balloon Car");
        topicList.add("Bending Plant Roots with Gravity");
        topicList.add("Birthday Season Weather Report");
        return topicList;

    }

    /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Science class is the child of the LessonClass

     add following values to arrayList(topicList) in the override method that comes from the abstract class
     Animal Habitats
     Ball Launcher Challenge
     Balloon Car
     Bending Plant Roots with Gravity
     Birthday Season Weather Report

     return topicList;

     */

}
