//Program where this keyword is required
class Student10{
    int rollno; //instance variables
    String name;
    float fee;
    Student10(int rollno, String name, float fee){ //parameter variables
        this.rollno = rollno; //ambiguity between instance variables and parameter variables
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class TestThis3 {
    public static void main(String[] args) {
        Student10 s1 = new Student10(111,"ankit",5000f);
        Student10 s2 = new Student10(222,"sumit",6000f);
        s1.display();
        s2.display();
    }
}