import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {

    String CourseNAME;
    ArrayList<Student>STUDENTLIST;
    ArrayList<Module>MODULELIST;
    LocalDate STDate;
    LocalDate EDDate;

    Course(String Coursename, ArrayList<Student>STU, ArrayList<Module>mods, LocalDate StartDATE, LocalDate EndDATE )
    {
        this.CourseNAME = Coursename;
        this.STDate = StartDATE;
        this.EDDate = EndDATE;
    }

    public void setCourseNAME(String Coursename)
    {
        this.CourseNAME = Coursename;
    }

    public String getCourseName()
    {
        return CourseNAME;
    }

    public void setSTDATE(LocalDate StartDATE)
    {
        this.STDate = StartDATE;
    }

    public LocalDate getSTDATE()
    {
        return STDate;
    }

    public void setEDDATE(LocalDate EndDATE)
    {
        this.EDDate = EndDATE;
    }

    public LocalDate getEDDATE()
    {
        return EDDate;
    }

    public ArrayList<Student> returnStudent(){

        return STUDENTLIST;
    }

    public ArrayList<Module> returnModule(){

        return MODULELIST;
    }

    public void setSTUDENTLIST(ArrayList<Student> STU){

        STUDENTLIST = STU;
    }

    public void setMODULELIST(ArrayList<Module> mods){

        MODULELIST = mods;
    }

    public void AddStudentToCourse(Student STU)
    {
        if(this.STUDENTLIST.contains(STU)){
            STU.addCourse(this);
            return;

        }
        else
            this.STUDENTLIST.add(STU);
        STU.addCourse(this);
    }

    public void AddModuleToCourse(Module mods,Course cour){
        if (this.MODULELIST.contains(mods)){

            return;
        }else

            MODULELIST.add(mods);
        return;
    }

    public static void main(String args[])
    {


    }




    }



