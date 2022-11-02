//Super is used to invoke parent class constructor
class Animal13{
    Animal13(){System.out.println("animal is created");}
}
class Dog13 extends Animal13{
    Dog13(){
        super();
        System.out.println("dog is created");
    }
}
class TestSuper3{
    public static void main(String args[]){
        Dog13 d=new Dog13();
    }
}