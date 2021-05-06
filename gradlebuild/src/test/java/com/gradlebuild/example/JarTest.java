package com.gradlebuild.example;




import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class JarTest {


    @BeforeAll
    public static void setupJar(){

    }

    @Test
    public void testMultiply() {
        int a = 5;
        int b = 6;
        int c = 30;
        assertEquals(a * b,c);
        System.out.println("\n************************");
        System.out.println("*Running testMultiply()*");
        System.out.println("************************\n");
    }

    @Test
    public void testInvalidMultiply() {
        int a = 5;
        int b = 6;
        int c = 56;
        assertNotEquals(a * b,c);
        System.out.println("\n************************");
        System.out.println("Running testInvalidMultiply()");
        System.out.println("************************\n");

    }
}