package com.study;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CountTest {
    @Test
    @DisplayName("자원을 공유하지 않는 프로세스")
    public void CountTest1(){
        Count count = new Count();
        for(int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
//                System.out.println(count.view());
                count.view();
            }
        }
        assertEquals(10000,count.getCount());
    }
    @Test
    @DisplayName("자원을 공유하는 스레드")
    public void CountTest2(){
        Count count = new Count();
        for(int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
//                    System.out.println(count.view());
                    count.view();
                }
            }).start();
        }
        assertNotEquals(10000,count.getCount());
    }
}