package com.interfacetest;

public class OutoutInnerClass extends ClassA.ClassB {
    public OutoutInnerClass(ClassA a){
        a.super();
    }
}
class ClassA{
    class ClassB{

    }
}