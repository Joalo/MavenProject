import java.util.ArrayList;

public class Course {

    String CourseName;



    public static void main(String args[]){

        Module[] module = new Module[10];

        ArrayList<Student> CourseStudentlist = new ArrayList();
        for (int i = 0; i < 20; i++) {

            Student student = new Student();
            student.setNAME("St" + i);
            student.setAGE(19);
            student.setID(20 + i);
            student.setDOB("12/05/00");
            student.setMODULES("");
            student.setCOURSES("");
            CourseStudentlist.add(student);

        }

        Student printCoursestudent = new Student();

        for (int i = 0; i < CourseStudentlist.size(); i++) {

            printCoursestudent = CourseStudentlist.get(i);
            System.out.println("Student Name:" + printCoursestudent.getNAME() +
                    "Student Age:" + printCoursestudent.getAGE() +
                    "Student ID:" + printCoursestudent.getID() +
                    "Student Username:" + printCoursestudent.getUSERNAME() +
                    "Student DOB:" + printCoursestudent.getCOURSES() +
                    "Student Course:" + printCoursestudent.getCOURSES() +
                    "Student Modules:" + printCoursestudent.getMODULES() );

        }



    }


}


