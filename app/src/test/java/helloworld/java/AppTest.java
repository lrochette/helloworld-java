/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package helloworld.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        //assertNotNull("this should fail the test!", null);
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}