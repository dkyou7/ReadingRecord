package com.study;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class InitProjectTest {

    @Test
    @DisplayName("첫 프로젝트 생성 테스트")
    public void InitProjectTest1(){
        assertEquals("Hello world!",SubProject.sayHello() + " " + SubProject.sayWorld());
    }

    @Test
    @DisplayName("첫 프로젝트 생성 테스트")
    public void InitProjectTest2(){

    }
}