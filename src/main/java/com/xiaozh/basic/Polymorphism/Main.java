package com.xiaozh.basic.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // 向上转型
//        Animal dogAnimal = new Dog(); //父类引用指向子类对象
//        dogAnimal.eat();
//        animal.run();  // 向上转型丢失了子类单独定义的方法，wrong!

        // 错误的向下转型：
//        Animal dogAnimal2 = new Animal();
//        Dog dog = (Dog) dogAnimal2;
//        dog.eat();  // wrong
//        dog.run();  // wrong

        // 向下转型：
//        Animal dogAnimal3 = new Dog();
//        Dog dog3 = (Dog) dogAnimal3;
//        dog3.eat();  // wrong
//        dog3.run();  // wrong

        Animal dogAnimal4 = new Animal();
        eat(dogAnimal4);


    }
    public static void eat(Animal animal){
        if(animal instanceof Dog){
            Dog d = (Dog) animal;
            d.eat();
            d.run();
        }
        else if(animal instanceof Cat){
            Cat c = (Cat) animal;
            c.eat();
            System.out.println("cat cann't run");
        }
        else{
            animal.eat();
        }

    }
}
