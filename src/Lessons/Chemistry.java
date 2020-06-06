package Lessons;


import Student.StudentClass;

import java.util.ArrayList;

public class Chemistry extends LessonClass {
    private ArrayList<String>topicList=new ArrayList<>();

    public Chemistry(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
    topicList.add("Pedagogy");
    topicList.add("Prerequisites");
    topicList.add("Course Offerings");
    topicList.add("Safety");
    topicList.add("General Chemistry");
    return topicList;
    }

      /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Chemistry class is the child of the LessonClass

     add following values to arrayList(topicList) in the override method that comes from the abstract class
     Pedagogy
     Prerequisites
     Course Offerings
     Safety
     General Chemistry
     return topicList

     */


}
