package MainC;

import Exceptions.EmptyStackGenericException;
import Exceptions.FullStackException;

import java.util.ArrayList;

public class GenericStack <T> {
    private ArrayList<T> stack;
    private int totalElements;
    private int currentElements;

    public GenericStack(int stackSize){
        this.totalElements = stackSize;
        this.stack = new ArrayList<T>(stackSize);
        this.currentElements = 0;
    }

    public void push(T newElement) throws FullStackException {
        if (this.currentElements >= this.totalElements){
            throw new FullStackException();
        }
        this.stack.add(newElement);
        IncrementCurrentElements();
    }

    public T pop() throws EmptyStackGenericException{
        T outElementStack;
        if (this.currentElements == 0){
            throw new EmptyStackGenericException();
        }
        outElementStack = this.stack.remove(this.currentElements-1);
        DecrementCurrentElements();
        return outElementStack;
    }

    public boolean isEmpty() {
        return this.currentElements == 0 ? true : false;
    }


    private void IncrementCurrentElements(){
        this.currentElements++;
    }

    private void DecrementCurrentElements(){
        this.currentElements--;
    }

    public int getCurrentElements() {
        return currentElements;
    }
}
