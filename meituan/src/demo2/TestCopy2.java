package demo2;

import java.io.FileReader;
import java.io.FileWriter;

public class TestCopy2 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:\\HELLO.txt");
        FileWriter fw = new FileWriter("F:\\HELLOCOPY2.txt");

        char[] buffer = new char[20];
        int len = 0;
        while( (len = fr.read(buffer)) != -1){
            fw.write(buffer, 0, len);
        }

        fw.flush();
        fw.close();
    }
}
