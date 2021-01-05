package com.study;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {

    @Test
    @DisplayName("정팩매 메서드는 이름이 존재한다.")
    public void study_test(){
        Student student1 = new Student(20,"홍길동");
        Student student2 = Student.studentWithNameAndAge(20, "홍길동");

        assertNotEquals(student2,student1);
    }

    @Test
    @DisplayName("반환 타입의 하위 타입 객체를 반환")
    public void study_test_2(){
        MiddleSchool middleSchool = Student.middleSchoolStudnent();
        assertEquals("hello world!",middleSchool.print());
    }
}