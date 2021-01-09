package com.study;

class InitProject{
    private static final String testing = "Hello";
    public InitProject(){
        System.out.println("InitProject 호출됨");
    }
    public static String sayHello(){
        return InitProject.testing;
    }
}

class SubProject extends InitProject{
    private static final String testing2 = "world!";
    public SubProject(){
        System.out.println("SubProject 호출됨");
    }
    public static String sayWorld(){
        return SubProject.testing2;
    }
}
