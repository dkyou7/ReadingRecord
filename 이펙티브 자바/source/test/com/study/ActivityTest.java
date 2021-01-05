package com.study;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ActivityTest {

    @Test
    @DisplayName("인스턴스 생성 통제")
    public void activity_test(){
        Activity activity1 = new Activity(10000.0, 3);
        Activity activity2 = new Activity(10000.0, 3);

        assertNotEquals(activity1,activity2);

        Activity activity6 = Activity.setPriceWithActivity(10000.0,3);
        Activity activity7 = Activity.setPriceWithActivity(10023.0,3);

        assertEquals(activity6,activity7);
    }
}