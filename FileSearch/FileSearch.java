import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSearch {
    public static String searchFile(String fileName) {
        try {
            return searchFromDir(Path.of("documents"), fileName);
        } catch (Exception e) {
            System.err.println(e);
        }
        return "";
    }

    static String searchFromDir(Path dirPath, String search) throws IOException {
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(dirPath)) {
            for (Path entry : dir) {
                if (entry.toFile().isDirectory()) {
                    String res = searchFromDir(dirPath.resolve(entry.getFileName()), search);
                    if (res != null)
                        return res;
                }

                // System.out.println(entry.getFileName() + "!=" + search);
                if (search.equals(entry.getFileName().toString())) {
                    return dirPath.resolve(entry.getFileName()).toString();
                }
            }
        }
        return null;
    }
}
