//Java Program to demonstrate the use of the parameterized constructor.
class Student44{
    int id;
    String name;
    //creating a parameterized constructor
    Student44(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        Student44 s1 = new Student44(111,"Karan");
        Student44 s2 = new Student44(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}