//Object and class example: Initialization through method
class Student4{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno = r;
        name = n;
    }

    void displayinformation(){
        System.out.println(rollno+" "+name);
    }
}

class TestStudent4 {
    public static void main(String[] args) {
        Student4 s1 = new Student4();
        Student4 s2 = new Student4();
        s1.insertRecord(101,"Rajni");
        s2.insertRecord(202,"John");
        s1.displayinformation();
        s2.displayinformation();
    }
}
