package com.study;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DmbCellPhoneTest {

    @Test
    public void phone_test(){
        DmbCellPhone dmbCellPhone = new DmbCellPhone("nathanPhone", "black", 10);

        System.out.println("Mode : " + dmbCellPhone.model);
        System.out.println("Color : " + dmbCellPhone.color);
        System.out.println("Channel : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.powerOff();
    }
}