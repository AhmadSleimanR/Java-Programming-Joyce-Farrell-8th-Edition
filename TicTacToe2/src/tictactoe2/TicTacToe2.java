package tictactoe2;
import javax.swing.JOptionPane;

public class TicTacToe2 {
    public static void main(String[] args) {
        char[][] xos = {{'1', '2', '3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'}};
        char play;
        boolean player = true;
        boolean didWin = false;
        boolean finishedTurn;
        int turns = 0;
        while(!didWin && turns < 9){
            finishedTurn = false;
            while(!finishedTurn){
                if(player)
                    play = JOptionPane.showInputDialog(null, display(xos)).charAt(0);
                else
                    play = (char)(computer(xos)+'0');
                if(isAvailable(xos, play)){
                    playTurn(xos, play, player);
                    if(calculate(xos, player)){
                        didWin = true;
                    }else
                        player ^= true;
                    ++turns;
                    finishedTurn = true;
                }
            }
        }
        if(didWin)
            JOptionPane.showMessageDialog(null, displayWin(xos, player));
        else
            JOptionPane.showMessageDialog(null, displayDraw(xos));
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
    public static StringBuilder displayDraw(char[][] xos){
        int a, b;
        StringBuilder draw = new StringBuilder("It was a draw.\n\n\n");
        for(a = 0;a < 3;++a){
            for(b = 0;b < 3;++b)
                draw.append(xos[a][b]).append(" ");
            draw.append("\n");
        }
        return draw;
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
        if(xos[0][0] == xos[0][1] && xos[0][0] == xos[0][2])
                return true;
        if(xos[1][0] == xos[1][1] && xos[1][0] == xos[1][2])
                return true;
        if(xos[2][0] == xos[2][1] && xos[2][0] == xos[2][2])
                return true;
        if(xos[0][0] == xos[1][1] && xos[0][0] == xos[2][2])
                return true;
        if(xos[0][2] == xos[1][1]&& xos[0][2] == xos[2][0])
                return true;
        if(xos[0][0] == xos[1][0] && xos[0][0] == xos[2][0])
                return true;
        if(xos[0][1] == xos[1][1] && xos[0][1] == xos[2][1])
                return true;
        return (xos[0][2] == xos[1][2] && xos[0][2] == xos[2][2]);
    }
    public static int computer(char[][] xos){
        if((xos[0][1] == 'O' && xos[0][2] == 'O')
                ||
           (xos[1][1] == 'O' && xos[2][2] == 'O')
                ||
           (xos[1][0] == 'O' && xos[2][0] == 'O')
                )
            return 1;
        if((xos[0][0] == 'O' && xos[0][2] == 'O')
                ||
           (xos[1][1] == 'O' && xos[2][1] == 'O')
                )
            return 2;
        if((xos[0][0] == 'O' && xos[0][1] == 'O')
                ||
           (xos[1][1] == 'O' && xos[2][0] == 'O')
                ||
           (xos[1][2] == 'O' && xos[2][2] == 'O')    
                )
            return 3;
        if((xos[1][1] == 'O' && xos[1][2] == 'O')
                ||
           (xos[0][0] == 'O' && xos[2][0] == 'O')    
                )
            return 4;
        if((xos[1][0] == 'O' && xos[1][2] == 'O')
                ||
           (xos[0][1] == 'O' && xos[2][1] == 'O')     
                ||
           (xos[0][0] == 'O' && xos[2][2] == 'O')     
                ||
           (xos[0][2] == 'O' && xos[2][0] == 'O')     
                )
            return 5;
        if((xos[1][0] == 'O' && xos[1][1] == 'O')
                ||
           (xos[0][2] == 'O' && xos[2][2] == 'O')
                )
            return 6;
        if((xos[2][1] == 'O' && xos[2][2] == 'O')
                ||
           (xos[0][0] == 'O' && xos[1][0] == 'O')     
                ||
           (xos[0][2] == 'O' && xos[1][1] == 'O')     
                )
            return 7;
        if((xos[2][0] == 'O' && xos[2][2] == 'O')
                ||
           (xos[0][1] == 'O' && xos[1][1] == 'O')     
                )
            return 8;
        if((xos[2][0] == 'O' && xos[2][1] == 'O')
                ||
           (xos[0][0] == 'O' && xos[1][1] == 'O')     
                ||
           (xos[0][2] == 'O' && xos[1][2] == 'O')     
                )
            return 9;
        return (int)(Math.random() * 9) + 1;
    }
}
