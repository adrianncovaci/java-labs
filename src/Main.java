//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import lab_4.*;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get("/home/adrian/Desktop/Uni/OOP/java-labs/src/text.txt"));
        for (String line : allLines) {
            mate mat = new mate();
            System.out.println(mat.areParenthesisBalanced(line));
        }
    }
}
