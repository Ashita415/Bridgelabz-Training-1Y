package com.Question1;

public class Box<T> {
    public T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
