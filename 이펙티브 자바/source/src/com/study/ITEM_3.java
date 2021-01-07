package com.study;

class Count {
    private int count;
    public synchronized int view() {return count++;}
    public int getCount() {return count;}
}
class Person {
    public static final Person INSTANCE = new Person();
    private Person() {
        if(INSTANCE != null){
            throw new RuntimeException("이미 생성된 싱글톤 객체가 존재합니다.");
        }
    }
    public static Person getInstance(){
        return INSTANCE;
    }
}
enum Phone_item3{
    INSTANCE("Galaxy");

    private String name;

    private Phone_item3(String name){
        this.name = name;
    }
}