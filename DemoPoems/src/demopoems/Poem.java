package demopoems;

/**
 *
 * @author lycan
 */
public class Poem {
    private String name;
    private int numLines;

    public Poem(String name, int numLines) {
        this.name = name;
        this.numLines = numLines;
    }

    public String getName() {
        return name;
    }

    public int getNumLines() {
        return numLines;
    }
    
}
