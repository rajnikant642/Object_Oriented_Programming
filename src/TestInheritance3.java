import org.w3c.dom.ls.LSOutput;

//Hierarchical Inheritance Example
class Animal3{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog3 extends Animal3{
    void bark(){
        System.out.println("meowing...");
    }
}
class Cat extends Animal3{
    void meow(){
        System.out.println("meowing");
    }
}
class TestInheritance3 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        //cbark(); //CTEror
    }
}

