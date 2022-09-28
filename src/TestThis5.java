//Calling parameterized constructor from default constructor
class Aa{
    Aa(){
        System.out.println("hello a");
    }
    Aa(int x){
        this();
        System.out.println(x);
    }
}

class TestThis5 {
    public static void main(String[] args) {
        Aa a = new Aa(10);
    }
}
