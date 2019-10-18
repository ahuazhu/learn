package com.interfacetest;
interface OutInterface{
    public void f();
}
public class InterfaceInner {
    public static void main(String[] args) {
        OuterClass2 out=new OuterClass2();
        OutInterface outinter=out.doit();
        outinter.f();
    }
}
class OuterClass2{
    private class InnerClass implements OutInterface{
        InnerClass(String s){
            System.out.println(s);
        }
        public void f(){
            System.out.println("访问内部类的f()方法");
        }
    }
    public OutInterface doit(){
        return new InnerClass("访问内部类构造方法");
    }
}
interface OutInterface2{

}
class OuterClass4{
    public OutInterface2 doit(){
        return new OutInterface2() {
            private int i=0;
            public int getValue(){
                return i;
            }
        };
    }
}