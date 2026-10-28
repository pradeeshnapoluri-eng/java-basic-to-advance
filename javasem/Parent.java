class Parent{
    void show(){
        System.out.println("i am a parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("i am a child");
    }
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Child d=new Child();
        d.show();
        System.out.println(d.add(2,7));
        System.out.println(d.add(1,2,3));
    }
}