//SINGLE INHERITANCE

// class Animal {
//     void eat(){
//         System.out.println("Animal eating!...");
//     }
// }
// class Cat extends Animal {
//     void meow() {
//         System.out.println("cat meows paws paws!");
//     }
//     public static void main(String[] args) { //main method here found so java Cat should use in terminal
//         Cat z=new Cat();
//         z.meow();
//         z.eat();
//     }
// }


//MULTILEVEL INHERITANCE
class Bird{
    void fly() {
        System.out.println("bird flies in sky");
    }
}
class Dove extends Bird {
    void white() {
        System.out.println("Dove was white in colour");
    }
}
class Grain extends Dove {
    void rice() {
        System.out.println("grains are fav");
    }
    public static void main(String[] args) {
        Grain f=new Grain();
        f.fly();
        f.rice();
        f.white();
    }
}
