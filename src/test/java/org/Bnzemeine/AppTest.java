package org.Bnzemeine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void test1() {
        App1 a = new App1();
        assertEquals(3, a.add(1, 2));
    }

    @Test
    void test2() {
        assertArrayEquals(
                new int[]{0, 2},
                App1.twoSum(new int[]{1, 2, 3, 4}, 4)
        );
    }
}
