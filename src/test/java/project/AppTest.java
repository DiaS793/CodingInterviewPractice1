package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {
    @Test
    void appHasAGreeting() {
        javaPractice1 classUnderTest = new javaPractice1();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
