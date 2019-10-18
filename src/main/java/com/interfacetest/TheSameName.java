package com.interfacetest;

public class TheSameName {
    private int x;
    private class Inner{
        private int x=9;
        public void doit(int x){
            x++;
            this.x++;
            TheSameName.this.x++;
        }
    }
}
