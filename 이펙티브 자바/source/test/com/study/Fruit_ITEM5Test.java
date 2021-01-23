package com.study;

import org.junit.Test;


class Fruit_ITEM5Test {
    @Test
    public void Fruit_ITEM5Test(){
        Fruit apple = new Apple();
        Fruit banana = new Apple();
        Fruit strawberry = new Apple();

        Fruit_ITEM5 fruit_item5_apple = new Fruit_ITEM5(apple);
        Fruit_ITEM5 fruit_item5_banana = new Fruit_ITEM5(banana);
        Fruit_ITEM5 fruit_item5_strawberry = new Fruit_ITEM5(strawberry);
    }
}