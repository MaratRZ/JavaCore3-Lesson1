package com.company;

import java.util.Arrays;

public class SimpleGeneric <T> {
    private Object[] elements;

    public SimpleGeneric(T... elements) {
        this.elements = elements;
    }

    public void swap(int pos1, int pos2) {
        Object obj;
        obj = elements[pos1];
        elements[pos1] = elements[pos2];
        elements[pos2] = obj;
    }

    @Override
    public String toString() {
        return "SimpleGeneric{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
