package com.xiaozh.basic.Polymorphism.Classic;

/**
 * https://juejin.im/post/5aaf21806fb9a028cd44e304
 * **/
public class Test {

    public static void main(String[] args) {
        /**
         * A <- B <- C(D)
         * */
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));  // A and A
        System.out.println("2--" + a1.show(c));  // A and A
        System.out.println("3--" + a1.show(d));  // A and D

        /**
         * a2是B类的引用对象，类型为A，所以this指向A类，然后在A类里面找this.show(B)方法，没有找到，所以到了super.show(B),
         * 由于A类没有父类，所以到了this.show（super B），B的父类是A，即super B = A，所以执行方法this.show（A），
         * 在A方法里面找show（A），找到了，但是由于a2是一个类B的引用对象，而B类里面覆盖了A类的show（A）方法，
         * 所以最终执行的是B类里面的show（A）方法，即输出B and A； 
         *
         * */
        System.out.println("4--" + a2.show(b));  // B and A

        /**
         * a2是B类的引用对象，类型为A，所以this指向A类，然后在A类里面找this.show(C)方法，没有找到，所以到了super.show（C）方法，
         * 由于A类没有父类，所以到了this.show(super C),C的父类是B，所以在A类里面找show（B），同样没有找到，发现B还有父类，即A，
         * 所以还继续在A类里面找show（A）方法，找到了，但是由于a2是一个类B的引用对象，而B类里面覆盖了A类的show（A）方法，
         * 所以最终执行的是B类里面的show（A）方法，即输出B and A；
         * **/
        System.out.println("5--" + a2.show(c));  // B and A

        System.out.println("6--" + a2.show(d));  // A and D

        System.out.println("7--" + b.show(b));   // B and B

        /**
         * b是B类的一个实例化对象，首相执行this.show(C)，在B类里面找show（C）方法，没有找到，所以到了super.show(c),B的父类是A，
         * 所以在A类中找show（C）方法，没有找到，于是到了this.show(super C),C的父类是B，所以在B类中找show(B)f方法，找到了，
         * 所以执行B类中的show（B）方法输出B and B；
         *
         * **/
        System.out.println("8--" + b.show(c));   // B and B

        /**
         *  b是B类的一个实例化对象，首先执行this.show(D)，在B类里面找show（D）方法，没有找到，于是到了super.show(D),B的父类是A类，
         *  所以在A类里面找show（D）方法，找到了，输出A and D；
         *  **/
        System.out.println("9--" + b.show(d));   // A and D


    }
}
