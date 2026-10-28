class Employee {
    String name;
    int salary;


    Employee(String n,int i){
        name=n;
        salary=i;

    }
    void display(){
        System.out.println("salary: "+salary);
        System.out.println("name: "+name);
    }
    public static void main (String[] args){
        Employee e=new Employee("manisha",9000);
        e.display();
    
    }
    
}
