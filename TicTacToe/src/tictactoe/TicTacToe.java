package tictactoe;
import javax.swing.JOptionPane;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] xos = {{'1', '2', '3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'}};
        char play;
        boolean player = true;
        boolean didWin = false;
        boolean finishedTurn;
        while(!didWin){
            finishedTurn = false;
            while(!finishedTurn){
                if(player)
                    play = JOptionPane.showInputDialog(null, display(xos)).charAt(0);
                else
                    play = (char)(computer()+'0');
                if(isAvailable(xos, play)){
                    playTurn(xos, play, player);
                    if(calculate(xos, player)){
                        didWin = true;
                    }else
                        player ^= true;
                    finishedTurn = true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, displayWin(xos, player));
    }
    public static void playTurn(char[][] xos, char play, boolean player){
        int a, b;
        char newPlay;
        if(player)
            newPlay = 'X';
        else
            newPlay = 'O';
        for(a = 0;a < 3;++a)
            for(b = 0;b < 3;++b)
                if(xos[a][b] == play)
                    xos[a][b] = newPlay;
    }
    public static StringBuilder displayWin(char[][] xos, boolean player){
        int a, b;
        StringBuilder win = new StringBuilder("");
        if(player)
            win.append("Congratulations, you won!\n\n\n");
        else
            win.append("Sorry, you lost.\n\n\n");
        for(a = 0;a < 3;++a){
            for(b = 0;b < 3;++b)
                win.append(xos[a][b]).append(" ");
            win.append("\n");
        }
        return win;
    }
    public static StringBuilder display(char[][] xos){
        int a, b;
        StringBuilder playPos = new StringBuilder("Enter the position you want to play at:\n\n\n");
        for(a = 0;a < 3;++a){
            for(b = 0;b < 3;++b)
                playPos.append(xos[a][b]).append(" ");
            playPos.append("\n");
        }
        return playPos;
    }
    public static boolean isAvailable(char[][] xos, char input){
        int a, b;
        for(a = 0; a < 3;++a)
            for(b = 0;b < 3;++b)
                if(xos[a][b] == input)
                    return true;
        return false;
    }
    public static boolean calculate(char[][] xos, boolean player){
        if((xos[0][0] == 'X' && xos[0][1] == 'X' && xos[0][2] == 'X') ||
            (xos[0][0] == 'O' && xos[0][1] == 'O' && xos[0][2] == 'O'))
                return true;
        if((xos[1][0] == 'X' && xos[1][1] == 'X' && xos[1][2] == 'X') ||
            (xos[1][0] == 'O' && xos[1][1] == 'O' && xos[1][2] == 'O'))
                return true;
        if((xos[2][0] == 'X' && xos[2][1] == 'X' && xos[2][2] == 'X') ||
            (xos[2][0] == 'O' && xos[2][1] == 'O' && xos[2][2] == 'O'))
                return true;
        
        if((xos[0][0] == 'X' && xos[1][2] == 'X' && xos[2][2] == 'X') ||
            (xos[0][0] == 'O' && xos[1][2] == 'O' && xos[2][2] == 'O'))
                return true;
        if((xos[0][2] == 'X' && xos[1][2] == 'X' && xos[2][0] == 'X') ||
            (xos[0][2] == 'O' && xos[1][2] == 'O' && xos[2][0] == 'O'))
                return true;
        
        if((xos[0][0] == 'X' && xos[1][0] == 'X' && xos[2][0] == 'X') ||
            (xos[0][0] == 'O' && xos[1][0] == 'O' && xos[2][0] == 'O'))
                return true;
        if((xos[0][1] == 'X' && xos[1][1] == 'X' && xos[2][1] == 'X') ||
            (xos[0][1] == 'O' && xos[1][1] == 'O' && xos[2][1] == 'O'))
                return true;
        return (xos[0][2] == 'X' && xos[1][2] == 'X' && xos[2][2] == 'X') ||
                (xos[0][2] == 'O' && xos[1][2] == 'O' && xos[2][2] == 'O');
    }
    public static int computer(){
        return (int)(Math.random() * 9) + 1;
    }
}
