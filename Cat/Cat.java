import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length != 1)
            return;

        InputStream input = Files.newInputStream(Path.of(args[0]));
        byte[] buffer = new byte[1024];
        while (true) {
            int n = input.read(buffer);
            if (n == -1)
                break;

            System.out.write(buffer, 0, n);
        }
        input.close();
    }

}
