// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) throws IOException {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {

            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);

<<<<<<< HEAD
            if (nextOpenBracket == -1) {
=======
            //checks for infinite looping
>>>>>>> 2ddf26f76403e0baa1789d5d0956e6c735c8d0d9
            if (nextOpenBracket == -1 || nextCloseBracket == -1 || openParen == -1 || closeParen == -1) {
                break;
            }

<<<<<<< HEAD
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);
            toReturn.add(markdown.substring(openParen + 1, closeParen));

=======
            //checks for brackets and parentheses with stuff between them, and empty links
            if (nextCloseBracket + 1 == openParen && openParen + 1 != closeParen) {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }
            
>>>>>>> 2ddf26f76403e0baa1789d5d0956e6c735c8d0d9
            currentIndex = closeParen + 1;

            //System.out.println(currentIndex + " " + markdown.charAt(currentIndex-1));
        }
        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}
