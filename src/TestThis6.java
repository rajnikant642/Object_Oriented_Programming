//Calling parameterized constructor from default constructor
class B{
    B(){
        this(5);
        System.out.println("hello a");
    }
    B(int x){
        System.out.println(x);
    }
}

class TestThis6 {
    public static void main(String[] args) {
        B a = new B();
    }
}
