package doesithavelegs;
import javax.swing.*;
public class DoesItHaveLegsOwn {

    public static void main(String[] args) {
        String[] questions = new String[100];
        String[] answers = new String[100];
        String yourAnimal, yourQuestion;
        boolean wantToPlay = true;
        boolean didFinish;
        int position = 0;
        int previousIteration;
        int yesSibling = 1;
        int noSibling = 2;
        int answer;
        questions[position] = "Does the animal you are thinking of have legs?";
        questions[yesSibling] = "Is it a dog?";
        questions[noSibling] = "Is it a fish?";
        answers[yesSibling] = "dog";
        answers[noSibling] = "fish";
        while(wantToPlay){
            position = 0;
            didFinish = false;
            while(!didFinish){
                System.out.println("Times entered:");
                answer = JOptionPane.showConfirmDialog(null, questions[position]);
                previousIteration = position;
                yesSibling = position * 2 + 1;
                noSibling = position * 2 + 2;
                if(answer == JOptionPane.YES_OPTION){
                    System.out.println("Yes");
                    position = yesSibling;
                }
                else{
                    position = noSibling;
                    System.out.println("NOOO!");
                }
                System.out.println("Position: "+position+" yesSibling: "+yesSibling+" noSibling:"+noSibling);
                if(questions[position] == null){
                    if(answer == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Yay! I win.");
                        position = 0;
                        didFinish = true;
                    }
                    else{
                        yourAnimal = JOptionPane.showInputDialog(null,
                                "I give up. What was your animal?");
                        yourQuestion = JOptionPane.showInputDialog(null,
                                "Type a question for which the answer"
                                + " is Yes for "+answers[previousIteration]+"\nbut No for "+
                                        yourAnimal);
                        questions[yesSibling] = questions[previousIteration];
                        questions[previousIteration] = yourQuestion;
                        questions[noSibling] = "Is it a "+yourAnimal+"?";
                        answers[yesSibling] = answers[previousIteration];
                        answers[noSibling] = yourAnimal;
                        position = 0;
                        didFinish = true;
                         }
                    }
            }
                System.out.println("Array contains: ");
                for(int x = 0;x < 100;++x){
                    System.out.print(x+": "+questions[x]+" -=-");
                    System.out.println(x+": "+answers[x]);
                }
                answer = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
                wantToPlay = (answer == JOptionPane.YES_OPTION);
        }
    }
}
