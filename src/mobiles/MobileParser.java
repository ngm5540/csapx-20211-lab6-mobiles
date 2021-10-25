package mobiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The class who parses the mobile file and builds the mobile tree.
 *
 * @author RIT CS
 * @author Nate Mount
 */
public class MobileParser {
    /** the root node */
    private final Node root;
    /** file field for BALL */
    private final static String BALL = "BALL";
    /** file field for ROD */
    private final static String ROD = "ROD";

    /**
     * Build a parser that eventually will require the mobile tree to be fully balanced.
     * @param filename the mobile filename
     * @throws IOException an IO error occurs reading from the file
     */
    public MobileParser(String filename) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(filename))){
            this.root = parse(in);
        } // <3 Jim
    }

    /**
     * The recursive parser for building the mobile tree from the mobile file.
     * @param in a buffered reader attached to the mobile file for reading
     * @return a parsed Node of the mobile tree
     * @throws IOException an IO error occurs reading from the file
     */
    private Node parse(BufferedReader in) throws IOException {
    
        String[] line = in.readLine().split("\\s+");

        switch(line[0]){

            case ROD:
                 return new Rod(line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]), parse(in), Integer.parseInt(line[4]), parse(in)); // OG: Rod(line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]), parse(in),  parse(in))

            case BALL:
                 return new Ball(line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]) );

    };

    return null;
    
    }

    /**
     * Get the root node of the parsed mobile.
     * @return the root
     */
    public Node getRoot() {
        return this.root;
    }
}
