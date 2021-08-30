package com.company;

import com.company.fruits.Apple;
import com.company.fruits.Box;
import com.company.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        SimpleGeneric<String> stringSimpleGeneric = new SimpleGeneric<>("One", "Two", "Three");
        System.out.println("Before swap: " + stringSimpleGeneric.toString());
        stringSimpleGeneric.swap(0,2);
        System.out.println("After swap: " + stringSimpleGeneric.toString());

        SimpleGeneric<Integer> integerSimpleGeneric = new SimpleGeneric<>(1,2,3);
        System.out.println("Before swap: " + integerSimpleGeneric.toString());
        integerSimpleGeneric.swap(0,2);
        System.out.println("After swap: " + integerSimpleGeneric.toString());

        // 2. Написать метод, который преобразует массив в ArrayList;
        String[] strings = {"One", "Two", "Three"};
        List stringList = toArrayList(strings);
        System.out.println(stringList);

        Integer[] integers = {1,2,3};
        List integerList = toArrayList(integers);
        System.out.println(integerList);

        // 3. Фрукты
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruits(new Apple[]{new Apple(), new Apple(), new Apple()});
        System.out.println("Вес ящика с яблоками: " + appleBox.getWeight());
        System.out.println();

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruits(new Orange[]{new Orange(), new Orange()});
        System.out.println("Вес первого ящика с апельсинами: " + orangeBox1.getWeight());
        System.out.println();

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruits(new Orange[]{new Orange(), new Orange(), new Orange()});
        System.out.println("Вес второго ящика с апельсинами: " + orangeBox2.getWeight());
        System.out.println();

        // сравнение ящиков
        System.out.println("Сравнение массы ящика яблок с первым ящиком апельсинов");
        System.out.println(appleBox.compare(orangeBox1) ? "Массы ящиков равны" : "Массы ящиков разные");
        System.out.println();

        System.out.println("Сравнение массы ящика яблок со вторым ящиком апельсинов");
        System.out.println(appleBox.compare(orangeBox2) ? "Массы ящиков равны" : "Массы ящиков разные");
        System.out.println();

        // пересыпаем апельсины из первого ящика во второй
        orangeBox1.transferToBox(orangeBox2);
        System.out.println("Вес первого ящика с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес второго ящика с апельсинами: " + orangeBox2.getWeight());
    }

    public static <T> List<T> toArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
