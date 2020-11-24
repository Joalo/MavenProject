import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Student {
    LocalDate DOB;
    String AGE;
    String NAME;
    int ID;
    String USERNAME;
    Course COURSESLIST;
    ArrayList<Module> MODULESLIST;

    public Student(LocalDate db, String age, String name, int id, Course cour, ArrayList<Module> mods){
        this.DOB = db;
        this.AGE = age;
        this.NAME = name;
        this.ID = id;
        this.COURSESLIST = cour;
        this.MODULESLIST = mods;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getAGE() {
        return AGE;
    }

    public void setAGE(String AGE) {
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

    public String USERNAME(String NAME, String AGE) {
        String nameholder = this.getNAME() ;
        String Ageholder = this.getAGE() ;

        this.USERNAME = nameholder + Ageholder;
        return USERNAME;
    }

    public void setCOURSES(Course cour) {
        this.COURSESLIST = cour;
    }

    public Course returnCourse(){ return COURSESLIST;}

    public void setMODULES(ArrayList<Module> mods) {
        this.MODULESLIST = mods;
    }

    public ArrayList<Module> returnModule(){ return MODULESLIST;}

    public void StudentinModule(Student STU,Module mods)
    {
        if (mods.returnStudent().contains(STU)) {
            return;
        } else {
            STU.MODULESLIST.add(mods);
            mods.addStudent(STU, mods);
            return;
        }
    }

    public void addCourse( Course cour)
    {
        if (this.COURSESLIST != null){
            return;
        }
        else{
            this.COURSESLIST = cour;
            this.MODULESLIST = cour.returnModule();
        }
    }

    public static void main(String[] args) {


    }



}
