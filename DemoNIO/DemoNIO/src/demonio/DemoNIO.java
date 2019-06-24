package demonio;
import java.nio.file.*;
/**
 *
 * @author lycan
 */
public class DemoNIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("E:\\testing\\testfile.txt");
        //Another way to do it which is operating system agnostic
        Path path2 = fs.getPath("E:"+fs.getSeparator()+
                "testing"+fs.getSeparator()+"testfile.txt");
        //third way this time using Paths (s)
        Path path3 = Paths.get("E:\\testing\\testfile.txt");
        
    }
    
}
