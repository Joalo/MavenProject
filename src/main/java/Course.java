import java.util.ArrayList;

public class Course {

    String CourseName;

    Course(String Coursename)
    {
        this.CourseName = Coursename;
    }

    public String getCourseName()
    {
        return CourseName;
    }

    public static void main(String args[]) {
        for (int i = 0; i < 3; i++)
        {
            Course c = new Course("Course" + i);

        }
        //Module[] module = new Module[10];
        ArrayList<Module> modulelist = new ArrayList();
        for (int i = 0; i < 5; i++) {

            Module m = new Module("Module"+i, "Mod"+i);
            modulelist.add(m);

        }
            ////////////////////////////////////////////////////////////////
 /*
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
*/
        Module printmodule = new Module("","");

        for (int i = 0; i < modulelist.size(); i++) {

            printmodule = modulelist.get(i);

            System.out.println("Module Name:" + printmodule.getMODNAME());

        }



        }

    }



