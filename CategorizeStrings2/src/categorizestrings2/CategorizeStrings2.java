package categorizestrings2;
import java.util.Arrays;
import javax.swing.*;

public class CategorizeStrings2 {
    public static void main(String[] args) {
        String[] noSpacesArray = new String[10];
        String[] oneSpaceArray = new String[10];
        String[] moreSpacesArray = new String[10];
        String entered;
        final String QUIT = "Quit";
        final String NOSPACES = "NO SPACES";
        final String ONESPACE = "ONE SPACE";
        final String MORESPACES = "MORE SPACES";
        int i;
        int counterSpaces = 0;
        int counterNoSpaces = 0;
        int counterOneSpace = 0;
        int counterMoreSpaces = 0;
        char c;
        
        entered = JOptionPane.showInputDialog(null, "Please enter your first word, or Quit to quit.");
        while((counterNoSpaces + counterOneSpace + counterMoreSpaces) < 9 && !entered.equalsIgnoreCase(QUIT)){
           for(i = 0;i < entered.length();++i){
               c = entered.charAt(i);
               if(Character.isWhitespace(c)){
                   ++counterSpaces;
               }
           }
           switch(counterSpaces){
               case 0:
                    for(i = 0;i < noSpacesArray.length;++i){
                        if(noSpacesArray[i] == null){
                            noSpacesArray[i] = entered;
                            ++counterNoSpaces;
                            break;
                        }
                    }
                   break;
               case 1:
                    for(i = 0;i < oneSpaceArray.length;++i){
                        if(oneSpaceArray[i] == null){
                            oneSpaceArray[i] = entered;
                            ++counterOneSpace;
                            break;
                        }
                    }
                   break;
               default:
                    for(i = 0;i < moreSpacesArray.length;++i){
                        if(moreSpacesArray[i] == null){
                            moreSpacesArray[i] = entered;
                            ++counterMoreSpaces;
                            break;
                        }
                    }
                   break;
           }
            counterSpaces = 0;
            entered = JOptionPane.showInputDialog(null, "Please enter another  word, or Quit to quit.");
        }
        entered = JOptionPane.showInputDialog(null, "Please enter which type to string list you want to see,\n"+
                "Or Quit to quit.");
        while(!entered.equalsIgnoreCase(QUIT)){
            switch(entered.toUpperCase()){
                case NOSPACES:
                    JOptionPane.showMessageDialog(null, Arrays.toString(Arrays.copyOf(noSpacesArray,counterNoSpaces)));
                    break;
                case ONESPACE:
                    JOptionPane.showMessageDialog(null, Arrays.toString(Arrays.copyOf(oneSpaceArray,counterOneSpace)));
                    break;
                case MORESPACES:
                    JOptionPane.showMessageDialog(null, Arrays.toString(Arrays.copyOf(moreSpacesArray,counterMoreSpaces)));
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "No spaces:\n"+Arrays.toString(Arrays.copyOf(noSpacesArray,counterNoSpaces))+"\n"+
                            "One space:\n"+Arrays.toString(Arrays.copyOf(oneSpaceArray,counterOneSpace))+"\n"+
                            "More than one space:\n"+Arrays.toString(Arrays.copyOf(moreSpacesArray,counterMoreSpaces)));
                    break;
            }
            entered = JOptionPane.showInputDialog(null, "Please enter which type to string list you want to see,\n"+
                "Or Quit to quit.");
        }
       JOptionPane.showMessageDialog(null, "Goodbye.");
    }
}
