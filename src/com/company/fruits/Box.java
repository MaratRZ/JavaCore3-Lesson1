package com.company.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit<Fruit>> {
    private List<T> box = new ArrayList<>();

    public List<T> getBox() {
        return box;
    }

    // вес ящика
    public float getWeight() {
        float result = 0.0f;
        for (T t : box) {
            result += t.getWeight();
        }
        return result;
    }

    // сравнение ящиков
    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    // добавление фрукта
    public void addFruit(T fruit) {
        box.add(fruit);
    }

    // добавление нескольких фруктов
    public void addFruits(T[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            addFruit(fruits[i]);
        }
    }

    // пересыпание всех фруктов в другой ящик
    public void transferToBox(Box<T> box) {
        box.getBox().addAll(this.box);
        this.box.clear();
    }
}
