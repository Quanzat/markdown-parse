import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(3, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals("https://something.com", links.get(0));
        assertEquals("some-page.html", links.get(1));
    }
    
    @Test
    public void getLinksTest1() throws IOException {
        Path fileName = Path.of("test1.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links);
    }
    
    @Test
    public void getLinksTest2() throws IOException {
        Path fileName = Path.of("test2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<>();

        assertEquals(expected, links);
    }

    @Test
    public void getLinksTest3() throws IOException {
        Path fileName = Path.of("test3.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<>();

        assertEquals(expected, links);
    }
}