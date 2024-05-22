package learners;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PersonTest {


    @Test
    void testConstructor() {
        //given
        Person person = new Person(101, "Rob");
        long expected = 101;
        //when
        long actual = person.getId();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setName() {
        //given
        Person person = new Person(103, null);
        String expected = "Rodneyson";
        //when
        person.setName("Rodneyson");
        String actual = person.getName();
        //then
        Assertions.assertEquals(expected, actual);
    }

}