package com.xiaozh.basic.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
//            Scanner in = new Scanner(System.in);
//            System.out.println("输入一个类名（e.g. java.util.Date）："); // reflect.Employee
//            name = in.next();
            name = "com.xiaozh.basic.Reflect.Employee";
        }
        try {

            Class cl = Class.forName(name);
            Class superCl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            System.out.println("modifiers: " + modifiers);
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            if (superCl != null && superCl != Object.class) {
                System.out.print(" extends " + superCl.getName());
            }
            System.out.println("\n{");
            System.out.println("构造方法：");
            printConstructors(cl); // 打印构造方法
            System.out.println("方法：");
            printMethods(cl);   // 打印方法
            System.out.println("属性：");
            printFields(cl);    // 打印属性
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * 打印Class对象的所有构造方法
     */
    public static void printConstructors(Class cl) {
        //返回这个类的所有构造器的对象数组，包含protected和private的构造器；相近的方法 getConstructors() 则返回这个类的所有公有构造器的对象数组，不包含保护和私有的构造器
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers()); //public or protected or private
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            // 打印构造参数
            Class[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 打印Class的所有方法
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        //Method[] methods = cl.getMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();  // 返回类型
            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + m.getName() + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 打印Class的所有属性
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field f: fields) {
            Class type = f.getType();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length()> 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + f.getName() + ";");
        }
    }
}