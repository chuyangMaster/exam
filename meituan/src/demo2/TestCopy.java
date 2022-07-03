package demo2;

import java.io.*;

public class TestCopy {
    public static void main(String[] args) throws IOException {
        //从E:\读取文本文件HELLO.txt
        FileInputStream fis = new FileInputStream("E:\\HELLO.txt");
        //将文本文件拷贝到F:\目录下，名为F:\HELLOCOPY.txt
        FileOutputStream fos = new FileOutputStream("F:\\HELLOCOPY.txt");
        //字节流需要缓冲区
        byte[] buffer = new byte[1024];
        int len = 0;
        while((len = fis.read(buffer)) != -1){
            fos.write(buffer, 0, len);
        }

        fos.flush();
        fos.close();
    }
}
