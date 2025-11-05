import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        String input = Files.readString(Path.of(args[0]));
        String result = "";
        for (String word : input.split(" ")) {
            if (word.length() == 0)
                continue;

            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        result = result.trim();
        OutputStream output = Files.newOutputStream(Path.of(args[1]));
        output.write(result.getBytes());
        output.close();
    }
}
