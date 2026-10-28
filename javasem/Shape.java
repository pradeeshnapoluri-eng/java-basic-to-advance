abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    void area(){
        double r=5;
        System.out.println(3.14*r*r);
    }
    public static void main(String[] args){
        Circle obj=new Circle();
        obj.area();
    }
} 