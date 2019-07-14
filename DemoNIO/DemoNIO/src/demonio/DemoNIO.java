package demonio;
import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.nio.file.attribute.BasicFileAttributes;
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
        //test relative to absolute path
        Path inputPath = Paths.get("text.txt");
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println(fullPath.toString());
        //testing checkAccess
        Path path4 = Paths.get("text2.txt");
        try{
            path4.getFileSystem().provider()
                    .checkAccess(path4, READ, WRITE, EXECUTE);
            System.out.println("File exists and is not in use!");
        }catch(IOException e){
            System.out.println("Sorry, file either doesn't exist or is in use");
        }
        
        //attempting to delete now
        try{
           Files.delete(fullPath);
        }catch(NoSuchFileException nsfe){
            System.out.println("No such File Exception");
        }catch(DirectoryNotEmptyException dnee){
            System.out.println("Directory is not empty");
        }catch(SecurityException se){
            System.out.println("Security Exception");
        }catch(IOException ioe){
            System.out.println("IO Exception");
        }
        
        /**
         * deletesIfExist() can also be used
         * but if a file doesn't exist, no exception is thrown
        **/
        
        //reading file attributes
        try{
            BasicFileAttributes bfa = Files.readAttributes(Paths.get
        ("E:\\Testing\\Java-Programming-Joyce-Farrell-8th-Edition\\DemoNIO\\DemoNIO\\src\\demonio\\test.txt")
                    , BasicFileAttributes.class);
            System.out.println(bfa.size());
            System.out.println(bfa.creationTime());
            System.out.println(bfa.lastModifiedTime());
        }catch(IOException e){
            System.out.println("IO Exception");
        }
        
        /**
         * FileTime can be instanced to assign the .creationTime() time.
         * returns less than 0 if the first fileTime comes before the argument
         * returns 0 if both are equal
         * returns more than 0 if the argument comes before the base fileTime
        **/
        
        /**
         * Besides BasicFileAttributes , Java supports specialized classes for DOS file attributes used on DOS
         *  systems and POSIX file attributes used on systems such as UNIX. For example, DOS files might be hidden or
         * read only and UNIX files might have a group owner. For more details on specialized file attributes, visit the
         * Java Web site.
         */
        
    }
    
}
