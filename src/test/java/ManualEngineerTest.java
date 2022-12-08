import org.junit.Test;
import people.AutomatedEngineer;
import people.ManualEngineer;

import static org.junit.Assert.assertEquals;
public class ManualEngineerTest {
    ManualEngineer me = new ManualEngineer(32, 5);

    @Test
    public void ageTest() {
        assertEquals(32, me.getAge());
    }

    @Test
    public void skillTest() {
        assertEquals(10, me.getSkill());
    }
    @Test
    public void experienceTest(){
        assertEquals(5, me.getExperience());
    }


}
