package Test;

import MainC.Counter;

import static org.junit.jupiter.api.Assertions.*;


class CounterTest {
    Counter counter1;

    /**
     * @throws java.lang.Exception
     **/
    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception {
        counter1 = new Counter();
    }

//    @org.junit.jupiter.api.AfterEach
//    void tearDown() {
//    }

    @org.junit.jupiter.api.Test
    void testDecrement() {
        assertTrue(counter1.decrement() == -1);
    }

    @org.junit.jupiter.api.Test
    void testIncrement() {
        assertTrue(counter1.increment() == 1);
        assertTrue(counter1.increment() == 2);
    }

    @org.junit.jupiter.api.Test
    void getCount() {
    }
}