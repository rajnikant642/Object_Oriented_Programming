//Object and class example: Initialization through a constructor

class Employee{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s){
        id = i;
        name = n;
        salary = s;
    }
    void diplay(){
        System.out.println(id+" "+name+" "+salary);
    }
}
class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insert(101,"ajeet",45000);
        e2.insert(102,"irfan",25000);
        e3.insert(103,"nakul",55000);
        e1.diplay();
        e2.diplay();
        e3.diplay();
    }
}
