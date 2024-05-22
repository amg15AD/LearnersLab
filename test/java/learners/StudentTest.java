package learners;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;

    @BeforeEach
    void setUp(){
        student = new Student(101,"Alex");
    }

    @Test
    void testImplementation(){

        Assertions.assertTrue(student instanceof Learner);
    }

    @Test
    void inheritanceTest(){

        Assertions.assertTrue(student instanceof Person);
    }

    @Test
    void learnTest(){
        double hoursLearning = 8.0;
        double expected = hoursLearning;
        student.learn(hoursLearning);
        double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected,actual);
    }


}