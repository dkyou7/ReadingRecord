package com.study;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


public class ITEM_6Test {

    @Test
    @DisplayName("a, b는 같다.")
    public void test(){
        String a = "java";
        String b = "java";
        assertSame(a,b);
    }

    @Test
    @DisplayName("a, b는 다르다.")
    public void test2(){
        String a = "java";
        String b = new String("java");
        b.split(".");
        assertNotSame(a,b);
    }

    @DisplayName("keyset은 같은 Map을 바라본다")
    @Test
    public void test3(){
        Map<String, Object> test = new HashMap<>();
        test.put("hello","world");

        Set<String> res1 = test.keySet();
        Set<String> res2 = test.keySet();

        assertEquals(res1,res2);
    }
    @DisplayName("Long 객체를 무수히 많이 실행함")
    @Test
    public void test4(){
        Long sum = 0L;
        for(long i = 0;i<= Integer.MAX_VALUE;i++){
            sum += i;
        }
    }
    @DisplayName("불필요한 객체생성을 하지 않은 정상 코드")
    @Test
    public void test5(){
        long sum = 0L;
        for(long i = 0;i<= Integer.MAX_VALUE;i++){
            sum += i;
        }
    }
}