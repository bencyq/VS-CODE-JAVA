package src.com.bencyq.IO;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\a.txt"))) {
            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
