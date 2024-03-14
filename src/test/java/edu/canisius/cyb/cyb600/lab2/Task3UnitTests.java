package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.Assert.assertNotNull;


public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        // Student should write tests here
        String test = "HelloHello";
        ArrayList<String> check = task3.removeDuplicates(test);

        Collections.sort(check);
        String result = String.join("", check);

        assertNotNull(result);
        assertEquals("Incorrect values in list", "Helo", result);
    }

    @Test
    public void test_removeDuplicates_average(){
        // Student should write tests here
        String test = "";
        ArrayList<String> check = task3.removeDuplicates(test);

        String result = String.join("", check);

        assertNotNull(result);
        assertEquals("Incorrect values in list", "", result);
    }

    @Test
    public void test_removeDuplicates_worst(){
        // Student should write tests here
        String test = null;
        ArrayList<String> check = task3.removeDuplicates(test);

        String result = String.join("", check);

        assertNotNull(result);
        assertEquals("Incorrect values in list", "", result);


    }

    @Test
    public void test_areTheseAnagrams_best(){
        // Student should write tests here
        String anagram1 = "rats";
        String anagram2 = "star";

        boolean check = task3.areTheseAnagrams(anagram1, anagram2);

        assertEquals("Incorrect values in list", true, check);
    }

    @Test
    public void test_areTheseAnagrams_average(){
        // Student should write tests here
        String test1 = "";
        String test2 = "rats";

        boolean check = task3.areTheseAnagrams(test1, test2);

        assertEquals("These are not Anagrams", false, check);

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        // Student should write tests here
        String test1 = null;
        String test2 = null;

        boolean check = task3.areTheseAnagrams(test1, test2);

        assertEquals("These are not Anagrams", false, check);
    }

}
