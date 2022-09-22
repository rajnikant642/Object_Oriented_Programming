//create multiple objects and store information in it through reference variable

class Student3{
    int id;
    String name;
}

class TestStudent3 {
    public static void main(String[] args) {
        //Creating objects
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        //initializing objects
        s1.id=101;
        s1.name="Rajni";
        s2.id=202;
        s2.name="John";
        //printing data
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
