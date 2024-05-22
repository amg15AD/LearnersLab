package learners;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    Instructor instructor;
    @BeforeEach
    void setUp(){
        instructor = new Instructor(201,"Remy");
    }

    @Test
    void testImplementation(){
        Assertions.assertTrue(instructor instanceof Teacher);
    }

    @Test
    void testInheritance(){
        Assertions.assertTrue(instructor instanceof Person);
    }

    @Test
    void teachTest(){
        Student student = new Student(103,"Adam");
        instructor.teach(student,8);
        double expected = 8.0;

        double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void lectureTest(){
        Student student1 = new Student(101,"Adam");
        Student student2 = new Student(102,"Javier");
        Student student3 = new Student(103,"Xander");
        Student[] students = {student1,student2,student3};
        instructor.lecture(students,12.0);

        double expected = 4.0;

        double actual = student3.getTotalStudyTime();
        assertEquals(expected,actual);
    }

}