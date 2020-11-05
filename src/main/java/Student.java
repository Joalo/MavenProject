public class Student {
    String DOB;
    int AGE;
    String NAME;
    int ID;
    String USERNAME;
    String COURSES;
    String MODULES;

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
        this.USERNAME = NAME + AGE;
    }

    public String getCOURSES() {
        return COURSES;
    }

    public void setCOURSES(String COURSES) {
        this.COURSES = COURSES;
    }

    public String getMODULES() {
        return MODULES;
    }

    public void setMODULES(String MODULES) {
        this.MODULES = MODULES;
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.setNAME("Abe");
        s.setAGE(17);
        System.out.println(s.getAGE());
        System.out.println(s.getNAME());
        s.setUSERNAME( s.getNAME(), s.getAGE());
        System.out.println(s.getUSERNAME());
    }



}
