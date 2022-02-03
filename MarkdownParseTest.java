import static org.junit.Assert.*;
<<<<<<< HEAD
=======

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

>>>>>>> 2ddf26f76403e0baa1789d5d0956e6c735c8d0d9
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
<<<<<<< HEAD
        assertEquals(2, 1 + 1); // runs a check to see if right code equals to the contents of left code
    }
=======
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path filename = Path.of("test-file2.md");
        String contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), List.of("https://something.com", "some-page.html"));

        filename = Path.of("test-file.md");
        contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), List.of("https://something.com", "some-page.html", "hello"));

        filename = Path.of("test-file3.md");
        contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), List.of("https://something.com", "some-page.html"));

        filename = Path.of("test-file4.md");
        contents = Files.readString(filename);
        assertEquals(MarkdownParse.getLinks(contents), List.of("https://something.com", "some-page.html"));
    }

    /*
    @Test
    public void testGetLinks() {
        boolean exceptionThrown = false;
        Path filename = Path.of("test-file2.md");
        String contents;
        try {
            contents = Files.readString(filename);
        } catch (IOException e) {
            exceptionThrown = true;
        }
        assertEquals(false, exceptionThrown);
    }
    */
>>>>>>> 2ddf26f76403e0baa1789d5d0956e6c735c8d0d9
}
