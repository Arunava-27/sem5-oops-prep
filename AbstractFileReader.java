import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * An abstract class representing a file reader.
 * This class provides common functionality for reading files.
 */
public abstract class AbstractFileReader {

    private final Path filePath;

    /**
     * Constructs a new AbstractFileReader with the specified file path.
     * @param filePath the path of the file to be read
     */
    protected AbstractFileReader(String filePath) {
        this.filePath = Path.of(filePath);
    }

    /**
     * Returns the path of the file being read.
     * @return the file path
     */
    public String getFilePath() {
        return filePath.toString();
    }

    /**
     * Returns the name of the file being read.
     * @return the file name
     */
    public String getFileName() {
        return filePath.getFileName().toString();
    }
    
    /**
     * Parses a line of text from the file.
     * Subclasses must implement this method to define how each line is parsed.
     * @param line the line of text to be parsed
     * @return the parsed result
     */
    protected abstract String parseLine(String line);

    /**
     * Reads the file and returns its contents as a list of strings.
     * @return the contents of the file
     * @throws IOException if an I/O error occurs while reading the file
     */
    public List<String> readFile() throws IOException {
        return Files.lines(filePath)
            .map(this::parseLine)
            .collect(Collectors.toList());
    }

}