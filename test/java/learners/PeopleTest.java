package learners;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    People people;
    Person personX;
    @BeforeEach
    void setUp(){
         people = new People();
        Person person1 = new Person(101,"Adam");
        Person person2 = new Person(102,"Kim");
        personX = new Person(103,"Zack");
        people.add(person1);
        people.add(person2);
        people.add(personX);
    }


    @Test
    void addTest(){
        Person person = new Person(104,"Peter");
        people.add(person);
        int expected = 4;

        int actual = people.count();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void removeTest(){

        people.remove(personX);
        int expected = 2;

        int actual = people.count();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findByIdTest(){
        Assertions.assertEquals(personX.getName(),people.findById(103));
    }






}