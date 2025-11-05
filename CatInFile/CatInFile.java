import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length != 1)
            return;

        OutputStream output = Files.newOutputStream(Path.of(args[0]));
        byte[] buffer = new byte[1024];
        while (true) {
            int n = System.in.read(buffer);
            if (n == -1)
                break;

            output.write(buffer, 0, n);
        }
        output.close();
    }
}
