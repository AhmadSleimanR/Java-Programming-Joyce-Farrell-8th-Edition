package doesithavelegs;

import javax.swing.JOptionPane;

public class DoesItHaveLegs {

    public static void main(String[] args) {
        String[] questions = new String[100];
        String[] answers = new String[100];
        String yourAnimal, yourQuestion;
        int position = 0, previousIteration;
        int yesSibling = 1, noSibling = 2;
        int answer;
        questions[position] = "Does the animal you are thinking of have legs?";
        questions[yesSibling] = "Is it a dog?";
        questions[noSibling] = "Is it a fish?";
        answers[yesSibling] = "dog";
        answers[noSibling] = "fish";
        boolean wannaPlay = true;
        boolean didFinish;
        
        while(wannaPlay){
            position = 0;
            didFinish = false;
            while(!didFinish){
                answer = JOptionPane.showConfirmDialog(null, questions[position]);
                previousIteration = position;
                yesSibling = position * 2 + 1;
                noSibling = position * 2 + 2;
                if(answer == JOptionPane.YES_OPTION)
                    position = yesSibling;
                else
                    position = noSibling;
                if(questions[position] == null){
                    if(answer == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Yay, I win!");
                        position = 0;
                        didFinish = true;
                    }else{
                        yourAnimal = JOptionPane.showInputDialog(null, "I give up."
                                + " What was your animal?");
                        yourQuestion = JOptionPane.showInputDialog(null,
                                "Type a question for which the answer"
                                + " is Yes for "+answers[previousIteration]
                                +" but No for "+yourAnimal+".");
                        questions[yesSibling] = questions[previousIteration];
                        questions[previousIteration] = yourQuestion;
                        questions[noSibling] = "Is it a "+yourAnimal+"?";
                        answers[noSibling] = yourAnimal;
                        answers[yesSibling] = answers[previousIteration];
                        position = 0;
                        didFinish = true;
                    }
                }
            }
            answer = JOptionPane.showConfirmDialog(null,
                    "Do you want to play again?");
            wannaPlay = answer == JOptionPane.YES_OPTION;
        }
    }
    
}
