class Demo{
  void perfume() {
    System.out.println("Senorita perfume");
  }
}
class Dmart extends Demo {
  void shop() {
    System.out.println("Dmart has the perfume");
  }

}
class Mart extends Dmart {
  void mall() {
    System.out.println("mall have so many grocery");
  }
  public static void main(String a[]) {
    Mart obj=new Mart();  // this last class should run as java Mart.(javac Demo.java)
    obj.shop();
    obj.mall();
    obj.perfume();
  }
}