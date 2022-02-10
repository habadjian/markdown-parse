import static org.junit.Assert.*;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTester() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(contents), new ArrayList<String>(List.of("https://something.com", "some-page.html")));
    }

    @Test
    public void failTest() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(contents), new ArrayList<String>(List.of("https://something.com", "some-page.html")));
    }
}
