// MyClassTest.java

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void testAdd() {
        cdassertEquals(8, MyClass.add(5, 3));
    }
}
