package com.kenzie.app;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {


    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void runMainWithoutCrashing() {
        boolean crashed = false;
        try {
            Main.main(new String[]{});
        } catch (Exception e) {
            crashed = true;
        }

        assertEquals(false, crashed, "App can run without crashing") ;
    }

    @Test
    public void runMain_CorrectOutPut(){
        String output = outContent.toString();

        assertThat(output, containsString("Apple"));
        assertThat(output, containsString("Apricot"));
        assertThat(output, containsString("Banana"));
        assertThat(output, containsString("Blueberry"));
        assertThat(output, containsString("Durian"));
        assertThat(output, containsString("Grapes"));
        assertThat(output, containsString("Guava"));
        assertThat(output, containsString("Lemon"));
        assertThat(output, containsString("Lime"));
        assertThat(output, containsString("Mango"));
        assertThat(output, containsString("Melon"));
        assertThat(output, containsString("Orange"));
        assertThat(output, containsString("Papaya"));
        assertThat(output, containsString("Pear"));
        assertThat(output, containsString("Persimmon"));
        assertThat(output, containsString("Pineapple"));
        assertThat(output, containsString("Rasberry"));
        assertThat(output, containsString("Strawberry"));
        assertThat(output, containsString("Tomato"));
        assertThat(output, containsString("Watermelon"));
        
    }


}
