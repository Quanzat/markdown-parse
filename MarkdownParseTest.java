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
    public void getLinksTest() throws IOException {
        MarkdownParse m = new MarkdownParse();
        Path filename = Path.of("test-file.md");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, m.getLinks(Files.readString(filename)));

    }

    @Test
    public void getLinkTest1() throws IOException {
        MarkdownParse m = new MarkdownParse();
        Path filename = Path.of("test1.md");
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, m.getLinks(Files.readString(filename)));
    }

    @Test
    public void getLinkTest2() throws IOException {
        MarkdownParse m = new MarkdownParse();
        Path filename = Path.of("test2.md");
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, m.getLinks(Files.readString(filename)));
    }

    @Test
    public void getLinkTest3() throws IOException {
        MarkdownParse m = new MarkdownParse();
        Path filename = Path.of("test3.md");
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, m.getLinks(Files.readString(filename)));
    }
}