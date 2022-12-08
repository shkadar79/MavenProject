package Classwork.day14;

import org.junit.Test;
import people.AutomatedEngineer;

import static org.junit.Assert.assertEquals;

public class AutomatedEngineerTest {
    AutomatedEngineer ae = new AutomatedEngineer(32, 5);

    @Test
    public void ageTest() {
        assertEquals(32, ae.getAge());
    }

    @Test
    public void skillTest() {
        assertEquals(15, ae.getSkill());
    }
    @Test
    public void experienceTest(){
        assertEquals(5, ae.getExperience());
    }

}
