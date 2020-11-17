import java.util.ArrayList;

public class Student {
    String DOB;
    int AGE;
    String NAME;
    int ID;
    String USERNAME;
    ArrayList<Course> COURSESLIST;
    ArrayList<Module> MODULESLIST;

    public Student(String db, int age, String name, int id, ArrayList<Course> Cour, ArrayList<Module> mods){
        this.DOB = db;
        this.AGE = age;
        this.NAME = name;
        this.ID = id;
        this.COURSESLIST = Cour;
        this.MODULESLIST = mods;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {

        return USERNAME;
    }

    public void setUSERNAME(String NAME, int AGE) {
        this.NAME = NAME;
        this.AGE = AGE;
        this.USERNAME = NAME + AGE;
    }

    public void setCOURSES(ArrayList<Course> Cour) {
        this.COURSESLIST = Cour;
    }

    public ArrayList<Course> returnCourse(){ return COURSESLIST;}

    public void setMODULES(ArrayList<Module> mods) {
        this.MODULESLIST = mods;
    }

    public ArrayList<Module> returnModule(){ return MODULESLIST;}

    public static void main(String[] args) {



    }



}
