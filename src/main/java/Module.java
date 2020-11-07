import java.util.ArrayList;
import java.util.Scanner;

public class Module {

    String MODNAME;
    String MODID;

    Module(String MODNAME,String MODID )
    {
        this.MODNAME = MODID;
        this.MODID = MODID;
    }

    public String getMODNAME() {

        return MODNAME;
    }

    public String getMODID()
    {
        return MODID;
    }




    public static void main(String args[]){


        /*Course[] course = new Course[5];

        course[0] = new Course();
        course[0].setCourseName("");

        course[1] = new Course();
        course[1].setCourseName("");

        course[2] = new Course();
        course[2].setCourseName("");

        course[3] = new Course();
        course[3].setCourseName("");

        course[4] = new Course();
        course[4].setCourseName("");
*/
/////////////////////////////////////////////////////////////////////////////
        ArrayList<Module> modulelist = new ArrayList();

        for (int i = 0; i < 3; i++) {
            Module m = new Module("Module" + i, "Mod" + i);
            modulelist.add(m);


////////////////////////////////////////////////////////////////////////////
            //Scanner input = new Scanner(System.in);
            //Student[] students = new Student[10];
            ArrayList<Student> Studentlist = new ArrayList();
            for (int j = 0; j < 20; j++) {

                Student student = new Student();
                student.setNAME("St" + j);
                student.setAGE(19);
                student.setID(20 + j);
                student.setDOB("12/05/00");
                student.setMODULES(m.getMODNAME());
                student.setCOURSES("");
                Studentlist.add(student);

            }

            Student printstudent = new Student();

            System.out.println("List of Students in Module:" + m.getMODNAME());

            for (int j = 0; j < Studentlist.size(); j++) {

                printstudent = Studentlist.get(i);
                System.out.println("Student Name:" + printstudent.getNAME() +
                        "Student Age:" + printstudent.getAGE() +
                        "Student ID:" + printstudent.getID() +
                        "Student Username:" + printstudent.getUSERNAME() +
                        "Student DOB:" + printstudent.getCOURSES() +
                        "Student Course:" + printstudent.getCOURSES() +
                        "Student Modules:" + printstudent.getMODULES());

            }
        }

//////////////////////////////////////////////////////////////////////////////////////////

      /*  ArrayList<Course> Courselist = new ArrayList();
        for (int i = 0; i < 3; i++) {

            Course course = new Course("Placeholder" + i);

            Courselist.add(course);

        }

        Course printcourse = new Course("Placeholder");

        for (int i = 0; i < Courselist.size(); i++) {

            printcourse = Courselist.get(i);
            System.out.println( "Course Name:" + printcourse.getCourseName() + i);
           }

      */



    }



}
