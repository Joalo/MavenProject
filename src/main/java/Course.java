import java.util.ArrayList;
import org.joda.time.LocalDateTime;

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

    public LocaDate getSTDATE()
    {
        return STDate;
    }

    public void setEDDATE(LocalDate EndDATE)
    {
        this.EDDate = EndDATE;
    }

    public LocaDate getEDDATE()
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

    public static void main(String args[]) {


        }

    }



