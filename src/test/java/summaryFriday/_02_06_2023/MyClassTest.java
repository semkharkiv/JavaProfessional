package summaryFriday._02_06_2023;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class MyClassTest {

    @Test
    void myFunction() {
        MyClass myClass = new MyClass();

        String result=myClass.myFunction(10);
        assertEquals("Result = 20",result);
    }
}