package com.interfacetest;
class QuadrangleTest{
    public static void draw(Quadrangle q){}
}
class Square extends QuadrangleTest{

}
class Anything{

}
public class ParallelogramTest extends QuadrangleTest{
    public static void main(String[] args) {
        QuadrangleTest q=new QuadrangleTest();
        if (q instanceof ParallelogramTest) {
            ParallelogramTest p=(ParallelogramTest)q;
        }
        if(q instanceof Square){
            Square s=(Square)q;
        }
    }
}
