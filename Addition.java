public class Addition {
    
    // int num1,num2;
    // public void showAddition() {
    //     num1=30;
    //     num2=70;
    //     int total=num1+num2;
    //     System.out.println("the Total addition is: "+total);
    // }
    // public static void main(String args[]) {
    //     Addition adding=new Addition();  // className voidName = new className();-->left.voidName();
    //     adding.showAddition();
    // }

    /////this is another method of static type.
    static void add(int a,int b){
        System.out.println("answer is: "+(a+b));
    }
    public static void main(String args[]) {
        add(10,60);
    }

    
}
