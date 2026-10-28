import java.io.*;
class FileDemo{
    public static void main(String[] args) throws IOException{

        FileWriter fw = new FileWriter("file_a.txt");
        fw.write("hello pradeeshna.this file is created by java");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("file_a.txt"));
        System.out.println(br.readLine());
        br.close();
    }
}