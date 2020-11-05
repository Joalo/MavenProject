import java.util.ArrayList;
import java.util.Scanner;

public class Module {

    String MODNAME;
    String MODID;



    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        //Student[] students = new Student[10];
        ArrayList<Student> Studentlist = new ArrayList();
        for (int i = 0; i < 20; i++) {

            Student student = new Student();
            student.setNAME("St" + i);
            student.setAGE(19);
            student.setID(20 + i);
            student.setDOB("12/05/00");
            student.setMODULES("");
            student.setCOURSES("");
            Studentlist.add(student);

        }

        Student printstudent = new Student();

        for (int i = 0; i < Studentlist.size(); i++) {

            printstudent = Studentlist.get(i);
            System.out.println("Student Name:" + printstudent.getNAME() +
                               "Student Age:" + printstudent.getAGE() +
                               "Student ID:" + printstudent.getID() +
                                "Student Username:" + printstudent.getUSERNAME() +
                               "Student DOB:" + printstudent.getCOURSES() +
                               "Student Course:" + printstudent.getCOURSES() +
                                "Student Modules:" + printstudent.getMODULES() );

        }


    }



}
