package com.github.magnusheino.dgs.it;

import org.junit.Test;

import com.github.magnusheino.dgs.generated.DgsConstants;
import com.github.magnusheino.dgs.generated.types.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {
    @Test
    public void constantName() {
        assertEquals("Person", DgsConstants.PERSON.TYPE_NAME);
    }

    @Test
    public void builder() {
        Person person = Person.newBuilder()
            .name("Michael")
            .age(28)
            .likesDogs(true)
            .build();

        assertEquals("Michael", person.getName());
        assertEquals(Integer.valueOf(28), person.getAge());
        assertTrue(person.getLikesDogs());
    }
}
