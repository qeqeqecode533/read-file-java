import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFile {
    private static void pt(Object msg) {
        System.out.print(msg);
    }
    private static void ptl(Object msg) {
        System.out.println(msg);
    }
    private static void ptl() {
        System.out.println();
    }
    private static String generateKey() {
        int length = (int) (Math.random() * 32) + 32;
        String set = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        String key = "";
        for (int i = 0; i < length; i++) {
            key += set.charAt((int)(Math.random() * set.length()));
        }
        return key;
    }
    public static String[] readAllLines(String file) throws IOException {
        Scanner scan = new Scanner(new File(file));
        String lineBuffer = "";
        String key = generateKey();
        while(scan.hasNextLine()) {
            lineBuffer += scan.nextLine() + key;
        }
        return lineBuffer.split(key);
    }
}
