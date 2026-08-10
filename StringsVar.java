import java.util.Scanner;
class StringsVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("enter your name: ");
            String name = scanner.nextLine();
            System.out.println("enter your age: ");
            int age = scanner.nextInt();
            System.out.println("hello "+name +" your age is "+ age+" years old");
            scanner.close();
    }
}
