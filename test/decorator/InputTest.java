package decorator;

import decorator.io.LowercaseInputStream;

import java.io.*;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-28 下午3:13
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowercaseInputStream(
                                new BufferedInputStream(
                                        new FileInputStream(
                                                new File("")
                                                        .getAbsolutePath()+
                                                            "/test/decorator/StarbuzzCoffee.java")));

            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
