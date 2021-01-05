package com.study;

class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(int age, String name){
        this.name = name;
        this.age = age;
    }
    // 어떤 역할인지 명시적 표현.
    public static Student studentWithNameAndAge(int age, String name) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        return student;
    }
    // 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.
    public static MiddleSchool middleSchoolStudnent() {
        return new MiddleSchool();
    }
}
class MiddleSchool extends Student{
    public String print(){
        return "hello world!";
    }
}
class Activity {

    private double price;
    private int activityCount;

    public Activity(){}
    // public 생성자
    public Activity(double price, int activityCount){
        this.price = price;
        this.activityCount = activityCount;
    }

    // 정팩매
    public static final Activity DISCOUNT_THREE_ACTIVITY = new Activity(10000.0, 3);
    public static Activity setPriceWithActivity(double price, int activityCount) {
        // 생성되어 있는 객체를 할당.
        if (activityCount == 3) {
            return DISCOUNT_THREE_ACTIVITY;
        }
        Activity activity = new Activity();
        activity.price = 20000.0;
        activity.activityCount = activityCount;
        return activity;
    }
}

class Fruit {
    // Fruit (){} // 왜 없어도 잘 동작하나요?
    public static Fruit getFruit(String name) {
        if ("Apple".equals(name)) {
            return new Apple();
        } else if ("Banana".equals(name)) {
            return new Banana();
        } else {
            return new Strawberry();
        }
    }
}
class Apple extends Fruit {
    public String print(){
        return "Apple!!";
    }
}
class Banana extends Fruit {
    public String print(){
        return "Banana!!";
    }
}
class Strawberry extends Fruit {
    public String print(){
        return "Strawberry!!";
    }
}

class CellPhone {
    String model;
    String color;

    public static DmbCellPhone getPhone(){
        return new DmbCellPhone();
    }

    void powerOn() {
        System.out.println("Power On.");
    }
    void powerOff() {
        System.out.println("Power Off");
    }
}

class DmbCellPhone extends CellPhone {
    int channel;

    public DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    protected DmbCellPhone() { }

    void turnOnDmb() {
        System.out.println("채널" + channel + "번 DMB 방송 수신");
    }
}


