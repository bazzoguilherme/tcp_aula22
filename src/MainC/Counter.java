package MainC;

public class Counter {
    int count = 0;

    public int increment(){
        return count += 1;
    }

    public int decrement(){
        return count -= 1;
    }

    public int getCount(){
        return count;
    }

}
