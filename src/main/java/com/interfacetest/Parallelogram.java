package com.interfacetest;
class Quadrangle{
    public static  void draw(Quadrangle q){

    }
}
public class Parallelogram extends Quadrangle{
    public static void main(String[] args) {
        /*Parallelogram p=new Parallelogram();
        draw(p);*/
        draw(new Parallelogram());
        Quadrangle q=new Parallelogram();
        Parallelogram p=(Parallelogram)q;
    }
}
