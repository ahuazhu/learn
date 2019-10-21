package com.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main_04 {
    public static void main(String[] args) {
        Class recordC=null;
        try{
            recordC=Class.forName("Record");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("------ 构造方法的描述如下 ------");
        Constructor[] declaredConstructors=recordC.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {
            Constructor constructor=declaredConstructors[i];
            if (constructor.isAnnotationPresent(Constructor_Annotation.class)){
                Constructor_Annotation ca=(Constructor_Annotation)constructor.getAnnotation(Constructor_Annotation.class);
                System.out.println(ca.value());
            }
            Annotation[][] parameterAnnotations=constructor.getParameterAnnotations();
            for (int j = 0; j < parameterAnnotations.length; j++) {
                int length=parameterAnnotations[j].length;
                if (length==0)
                    System.out.println("    未添加Annotation的参数");
                else
                    for (int k = 0; k < length; k++) {
                        Field_Parameter_Annotation pa=(Field_Parameter_Annotation)parameterAnnotations[j][k];
                        System.out.print("    "+pa.describe());
                        System.out.println("    "+pa.type());
                    }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("-------- 字段的描述如下 --------");
        Field[] declaredFields=recordC.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field field=declaredFields[i];
            if (field.isAnnotationPresent(Field_Parameter_Annotation.class)){
                Field_Parameter_Annotation fa=field.getAnnotation(Field_Parameter_Annotation.class);
                System.out.print("    "+fa.describe());
                System.out.println("    "+fa.type());
            }
        }

        System.out.println();
        System.out.println("-------- 方法的描述如下 --------");
        Method[] methods=recordC.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method=methods[i];
            if (method.isAnnotationPresent(Field_Parameter_Annotation.class)){
                Field_Parameter_Annotation ma=method.getAnnotation(Field_Parameter_Annotation.class);
                System.out.println(ma.describe());
                System.out.println(ma.type());
            }
            Annotation[][] parameterAnnotations=method.getParameterAnnotations();
            for (int j = 0; j < parameterAnnotations.length; j++) {
                int length=parameterAnnotations[j].length;
                if(length==0)
                    System.out.println("    未添加Annotation的参数");
                else
                    for (int k = 0; k < length; k++) {
                        Field_Parameter_Annotation pa=(Field_Parameter_Annotation)parameterAnnotations[j][k];
                        System.out.print("    "+pa.describe());
                        System.out.println("   "+pa.type());
                    }
            }
            System.out.println();
        }
    }
}
