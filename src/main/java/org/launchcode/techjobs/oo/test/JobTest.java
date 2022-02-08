package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

//    Job testJobOne;
//    Job testJobTwo;

//    @Before
//    public void createJobObject(){
//        testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        testJobTwo = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        System.out.println(testJobOne.getId() + "\n" + testJobTwo.getId());
//    }

    @Test
    //may need to adjust this test
    //Use assertEquals, assertTrue, or assertFalse to test that the ID values for the two objects are NOT the same and differ by 1.
    public void testSettingJobId() {
        Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobTwo = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        System.out.println(testJobOne.getId() + "\n" + testJobTwo.getId());
        assertFalse(testJobOne.equals(testJobTwo));


    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJobObject = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJobObject.getName() instanceof String);
        assertTrue(testJobObject.getEmployer() instanceof Employer);
        assertTrue(testJobObject.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJobObject.getLocation() instanceof Location);
        assertTrue(testJobObject.getPositionType() instanceof PositionType);

//        assertEquals(1, testJobObject.getId());
        assertEquals("Product tester", testJobObject.getName());
        assertEquals("Persistence", testJobObject.getCoreCompetency().toString());
        assertEquals("ACME", testJobObject.getEmployer().toString());
        assertEquals("Desert", testJobObject.getLocation().toString());
        assertEquals("Quality control", testJobObject.getPositionType().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job testJobObjectOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobObjectTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJobObjectOne.equals(testJobObjectTwo));
    }
}
