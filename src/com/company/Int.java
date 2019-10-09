package com.company;

public class Int {

    private int value;

    public Int(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}
