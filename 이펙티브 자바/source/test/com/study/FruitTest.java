package com.study;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.*;

public class FruitTest {

    @Test
    public void fruit_test(){
        // 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있습니다.
        Fruit fruit1 = Fruit.getFruit("Apple");
        assertEquals(fruit1.getClass().getSimpleName(),"Apple");

        Fruit fruit2 = Fruit.getFruit("Banana");
        assertEquals(fruit2.getClass().getSimpleName(),"Banana");

        Fruit fruit3 = Fruit.getFruit("asdfad");
        assertEquals(fruit3.getClass().getSimpleName(),"Strawberry");

        Apple apple = (Apple) Fruit.getFruit("Apple");
        assertEquals(apple.print(),"Apple!!");

        Banana Banana = (Banana) Fruit.getFruit("Banana");
        assertEquals(Banana.print(),"Banana!!");

        Strawberry Strawberry = (Strawberry) Fruit.getFruit("ewfsd");
        assertEquals(Strawberry.print(),"Strawberry!!");
    }
}