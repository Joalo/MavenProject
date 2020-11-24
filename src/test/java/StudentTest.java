import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getUSERNAME() {

        Course cour = null;
        Student T1 = new Student(new LocalDate("2000-01-01"),"20","Test 1", 1000000 , cour , new ArrayList<Module>() );
        assertEquals("Test 1", T1.getNAME());
        assertEquals("Test 120", T1.USERNAME(T1.getNAME(),T1.getAGE()));
        assertEquals("20", T1.getAGE());
        //assertEquals('2000-01-01', T1.getDOB());
        assertEquals(1000000, T1.getID());


    }
}