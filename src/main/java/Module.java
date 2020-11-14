import java.util.ArrayList;
import java.util.Scanner;

public class Module {

    String MODNAME;
    String MODID;
    ArrayList<Student>STUDENTLIST;
    ArrayList<Course>COURSELIST;

    Module(String modname,String Moid, ArrayList<Student>STU, ArrayList<Course>cour)
    {
        this.MODNAME = modname;
        this.MODID = Moid;
        this.STUDENTLIST = STU;
        this.COURSELIST = cour;
    }

    public String getMODNAME() {

        return MODNAME;

    }

    public void setMODNAME(String name){

        MODNAME = name;

    }

    public String getMODID()
    {
        return MODID;
    }

    public void setMODID(String Moid){

        MODID = Moid;
    }

    public ArrayList<Student> returnStudent(){

        return STUDENTLIST;
    }

    public ArrayList<Course> returnCourse(){

        return COURSELIST;
    }

    public void setSTUDENTLIST(ArrayList<Student>STU){

        STUDENTLIST = STU;
    }

    public void setCOURSELIST(ArrayList<Course>cour){

        COURSELIST = cour;
    }


    public static void main(String args[]){



            }






    }



