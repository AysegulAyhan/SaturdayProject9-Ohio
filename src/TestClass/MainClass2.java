package TestClass;

import Lessons.LessonClass;
import Lessons.Music;
import Student.StudentClass;


public class MainClass2 {
    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("Origiii", "CornerTakenQuickly","England" );

        LessonClass lessonClass = new Music(studentClass);


        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*
        Run the MainClass2
        Then Type the class names
        Enter: Math
        Enter: Science
        Enter: Music

        Result should be like this
        StudentClass{username='Origiii', password='CornerTakenQuickly'Price of the school is £6500 Location of the school is EnglandClass names and score for it {Math=32, Science=59, Music=7}}

         */
    }
}