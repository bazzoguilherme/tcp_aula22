package Test;

import Exceptions.EmptyStackGenericException;
import Exceptions.FullStackException;
import MainC.GenericStack;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GenericStackTestInteger<T> {
    GenericStack<Integer> stack;


    @BeforeEach
    void setUpClass() {
        stack = new GenericStack<Integer>(10);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testPush() throws FullStackException {
        stack.push(1);
        assertTrue(stack.getCurrentElements() == 1);
    }

    @Test
    void testPushFull0Stack() { // This means that the stack is full, as there are 0 elements in 0 positions
        GenericStack<Integer> stackZero = new GenericStack<>(0);
        try {
            stackZero.push(1);
        } catch (FullStackException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testPushFull1Stack() {
        GenericStack<Integer> stackZero = new GenericStack<>(1);
        try {
            stackZero.push(1);
            stackZero.push(2);
        } catch (FullStackException e){
            System.out.println(e.getMessage());
        }
    }


    @Test
    void testPop() throws EmptyStackGenericException, FullStackException{
        Integer a;
        stack.push(1);
        a = stack.pop();
        assertTrue(a == 1);
    }

    @Test
    void testPopStackSize1() throws EmptyStackGenericException, FullStackException{
        stack.push(1);
        stack.pop();
        assertTrue(stack.getCurrentElements() == 0);
    }

    @Test
    void testPopStackEmpty(){
        try {
            stack.pop();
        } catch (EmptyStackGenericException e){
            System.out.println(e.getMessage());
        }
    }


    @Test
    void testEmpty() throws FullStackException{
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}