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
        //Path fileName = Path.of("./test-file.md");
	    //String contents = Files.readString(fileName);
        //assertEquals(MarkdownParse.getLinks(contents), new ArrayList<String>(List.of("https://something.com", "some-page.html")));
    }

    @Test
    public void snippet1() throws IOException{
        Path fileName = Path.of("/Users/heikoabadjian/Documents/GitHub/markdown-parse/snippet1.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("`google.com","google.com","ucsd.edu"),links);
    }

    @Test
    public void snippet2() throws IOException{
        Path fileName = Path.of("/Users/heikoabadjian/Documents/GitHub/markdown-parse/snippet2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("a.com", "a.com((", "example.com"),links);
    }

    @Test
    public void snippet3() throws IOException{
        Path fileName = Path.of("/Users/heikoabadjian/Documents/GitHub/markdown-parse/snippet3.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"),links);
    }



    
}
