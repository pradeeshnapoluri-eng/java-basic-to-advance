class Box <T>{
    T value;
    Box(T value){
        this.value=value;
    }
    void show(){
        System.out.println(value);
    }
    public static void main(String[] args){
        Box <Integer> b = new Box <>(100);
        b.show();
        Box <String> c = new Box <>("One Hundred");
        c.show();
    }
}