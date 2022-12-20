import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileReader {

    List<String> read_data;

    public FileReader(String path) throws Exception {
        this.read_data = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);
    }

    public List<String> GetReadData(){
        return read_data;
    }

}
