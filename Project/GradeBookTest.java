import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
    private GradeBook gradeTest1;
    private GradeBook gradeTest2;
   
    @Before
    public void setUp() throws Exception {
    	
    	gradeTest1 = new GradeBook(5);
    	gradeTest1.addScore(96);
    	gradeTest1.addScore(52);
    	gradeTest1.addScore(74);
    	gradeTest1.addScore(88);
    	gradeTest1.addScore(65);
    	
    	gradeTest2 = new GradeBook(5);
    	gradeTest2.addScore(20);
    	gradeTest2.addScore(99);
    	gradeTest2.addScore(92);
    	gradeTest2.addScore(78);
    }

    @After
    public void tearDown() throws Exception {
    	gradeTest1 = gradeTest2 = null;
    }

    @Test
    public void addScore() {
        assertTrue(gradeTest1.toString().equals("96.0 52.0 74.0 88.0 65.0 "));
        assertTrue(gradeTest2.toString().equals("20.0 99.0 92.0 78.0 "));
            }

    @Test
    public void sum() {
        assertEquals(375, gradeTest1.sum(), 0.001);
        assertEquals(289, gradeTest2.sum(), 0.001);
    }

    @Test
    public void minimum() {
        assertEquals(52, gradeTest1.minimum(), 0.001);
        assertEquals(20, gradeTest2.minimum(), 0.001);
    }

    @Test
    public void finalScore() {
        assertEquals(323, gradeTest1.finalScore(), 0.001);
        assertEquals(269, gradeTest2.finalScore(), 0.001);
    }
}