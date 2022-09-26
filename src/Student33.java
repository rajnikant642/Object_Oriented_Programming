//Example of default constructor

class Student33 {
    int id;
    String name;
    //method to display the value of id and name
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        //creating objects
        Student33 s1 = new Student33();
        Student33 s2 = new Student33();
        //displaying values of the object
        s1.display();
        s2.display();
    }
}
