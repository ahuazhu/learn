package com.interfacetest;

public class QuadrangleDemo {
    private QuadrangleDemo[] qtest=new QuadrangleDemo[6];
    private int nextIndex=0;
    public void draw(QuadrangleDemo q){
        if(nextIndex<qtest.length){
            qtest[nextIndex]=q;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args) {
        QuadrangleDemo q=new QuadrangleDemo();
        q.draw(new SquareTest());
        q.draw(new ParallelogramgleDemo());
    }
}
class SquareTest extends QuadrangleDemo{
    public SquareTest(){
        System.out.println("正方形");
    }
}
class ParallelogramgleDemo extends QuadrangleDemo{
    public ParallelogramgleDemo(){
        System.out.println("平行四边形");
    }
}
