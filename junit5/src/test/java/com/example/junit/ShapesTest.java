package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// above annotation is used for changing the behaviour of test instance.

//  with this instance of class object will run only once before all.
// if we will not write PER_CLASS it will take by default PER_METHOD.

public class ShapesTest {

        ShapesTest(){
            System.out.println("Test object is created before test method");
        }
        // This constructor is invoked whenever an object of the ShapesTest class is instantiated.

        // Constructors in Java are special methods that are invoked when an object of a class is created. They are typically used to initialize the object's state or perform any setup tasks necessary for the object to function correctly.


        @BeforeAll
        // this method will run only once before all test cases.

        // beforeAll and afterAll are static methods means they are independent of any instance.

        static void beforeAll(){
            System.out.println("before all tests");
        }

        @AfterAll
        // this method will run only once after all test cases.
        static void afterAll(){
            System.out.println("after all tests");
        }

        Shapes shape;

        @BeforeEach
        //  with this annotation, this method will call before every test cases, like here there are 3 test cases which have written bwlow so this method will run 3 times means every befire each test cases.

        void init(){
            shape = new Shapes();
            System.out.println("Before Test");
        }

    @Test
    void testSqaureArea(){
        // Shapes shape = new Shapes();
        // so now there is no need of writting here because we have implemented this above in @beforeeach so every that will run before this.

        assertEquals(576, shape.squareArea(24),"Area is Wrong");
        System.out.println("Actual test running");
    }

    @Test
    void testCircleArea(){
        // Shapes shape = new Shapes();
        assertEquals(78.5, shape.circleArea(5),"Area is wrong");
        System.out.println("Actual test running");

    }

    @Test
    void testArrays(){
        int []expected = {2,4,6,8};
        int []actual = {2,4,6,8};

        // here assert equal will check both arrays address that would not be same but asser arrays equal will check value of array which will become pass.

        // assertEquals(expected, actual);

        // Arrays.sort(actual);

        assertArrayEquals(expected, actual);
        System.out.println("Actual test running");

    }

    @AfterEach
    //  so similarly this method will run after each test cases. means first before test will run then main test then after test. 

    // so basically we will use all of this methods when we want to destroy something after test then we can use it. 

    void destroy(){
        System.out.println("After test");
    }
}
 