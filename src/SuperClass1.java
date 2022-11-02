//Super is used to refer immediate parent class instance variable

class Animal11{
    String color = "white";
}
class Dog11 extends Animal11{
    String color = "black";
    void printColor(){
        System.out.println(color); //prints color of Dog class
        System.out.println(super.color); //prints color of Animal class
    }
}

class SuperClass1 {
    public static void main(String[] args) {
        Dog11 d = new Dog11();
        d.printColor();
    }
}
