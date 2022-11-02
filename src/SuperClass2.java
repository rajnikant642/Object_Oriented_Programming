//Super can be used to invoke parent class method
class Animal12{
    void eat(){System.out.println("eating...");}
}
class Dog12 extends Animal12{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        bark();
    }
}
class TestSuper2{
    public static void main(String args[]){
        Dog12 d=new Dog12();
        d.work();
    }}
