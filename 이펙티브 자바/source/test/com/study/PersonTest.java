package com.study;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    @DisplayName("두 객체가 같은 인스턴스를 참조함")
    public void PersonTest1(){
//        Person item1 = new Person();
        Person item2 = Person.INSTANCE;
        Person item3 = Person.INSTANCE;
        assertEquals(item2,item3);
    }

    @Test(expected = InvocationTargetException.class)   // 리팩토링
    @DisplayName("예외가 발생함")
    public void PersonTest2() throws Exception {
        Person item = Person.INSTANCE;
        Constructor<Person> constructor = (Constructor<Person>) item.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);
        Person item2 = constructor.newInstance();
        assertNotEquals(item2,item);
    }

    @Test
    @DisplayName("정팩매 사용하기")
    public void PersonTest3(){
        Supplier<Person> barSupplier = Person::getInstance;
        Person person1 = barSupplier.get();
        Person person2 = barSupplier.get();
        assertEquals(person1,person2);
    }
}