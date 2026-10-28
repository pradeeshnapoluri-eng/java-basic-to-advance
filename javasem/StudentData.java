class StudentData{
    String name="maggie";
    String dept="data science";
}
class Marks extends StudentData{
    int marks=98;
    public static void main(String[] args){
        Marks m=new Marks();
        System.out.println("student name is: "+m.name);
        System.out.println("Student dept is: "+m.dept);
        System.out.println(m.name+" marks are: "+m.marks);
    }
}