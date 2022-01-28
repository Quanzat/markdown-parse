import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void testGetlink() throws IOException{
        Path testFile_1 = Path.of("test-file.md");
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("https://something.com");
        test1.add("some-page.html");       
        assertEquals(test1, MarkdownParse.getLinks(Files.readString(testFile_1)));
    }
}
