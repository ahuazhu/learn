package com.ahuazhu.helloworld;


public class TestMemoryCell {
    public static void main(String[] args) {
        /*MenoryCell m=new MenoryCell();
        m.write("37");
        String val=(String) m.read();
        System.out.println("Consents are:"+val);*/

        MenoryCell m=new MenoryCell();
        m.write(new Integer(37));
        Integer wrapperVal=(Integer)m.read();
        int val=wrapperVal.intValue();
        System.out.println("Comtents are:"+val);
    }
}
