package org.example.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTriangleTest {

   // static Logger logger = (Logger) LoggerFactory.getLogger(AreaTriangleTest.class);

    @Test
    void someMethod() throws MyException {

        AreaTriangle areaTriangle = new AreaTriangle();
       // logger.info("object created");

        assertEquals(12,areaTriangle.someMethod(5,5,6));
       //  logger.info("check1");
        assertThrows(MyException.class,()-> areaTriangle.someMethod(-1,5,6) );
        assertThrows(MyException.class,()-> areaTriangle.someMethod(0,5,6) );
        assertThrows(MyException.class,()-> areaTriangle.someMethod(5,5,600) );



    }







}