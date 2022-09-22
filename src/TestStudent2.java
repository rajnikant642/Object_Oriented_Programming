//Object and class example: Initialization through reference
class Student2{
    int id;
    String name;
}

class TestStudent2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.id = 101;
        s1.name = "Rajni";
        System.out.println(s1.id+" "+s1.name);
    }
}
