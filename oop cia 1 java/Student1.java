class Student1 {
    String name;
    int marks;

    // Student1() {
    //     name="unknown";
    //     marks=0;
    // }
    Student1(String n,int m ){
        name=n;
        marks=m;
    }
    void display() {
        System.out.println("name: "+name);
        System.out.println("marks: "+marks);
    }
    public static void main(String[] args){
        Student1 data=new Student1("pradeeshna",990);
        // Student1 data1=new Student1();

        data.display();
        // data1.display();
    }
}


// class Student2 {
//     String name;
//     int marks;
//     Student2() {
//         name="unknown";
//         marks=0;
//     }
//     Student2(String n,int m ){
//         name=n;
//         marks=m;
//     }
//     void display() {
//         System.out.println("name: "+name);
//         System.out.println("marks: "+marks);
//     }
//     public static void main(String[] args){
//         Student2 plain=new Student2();
//         Student2 data=new Student2("pradeeshna",990);
//         data.display();
//         plain.display();
//     }
// }
