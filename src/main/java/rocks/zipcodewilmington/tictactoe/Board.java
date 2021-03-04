package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix = new Character[3][3];

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        boolean xWon = false;
            if(checkWin('X')){
                return true;
            }
            else{
                return false;
            }
    }

    public Boolean isInFavorOfO() {
        boolean xWon = false;
        if(checkWin('O')){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean isTie() {
        if(isInFavorOfX() || isInFavorOfO()){
            return false;
        }
        else{
            return true;
        }
    }

    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        }
        if(isInFavorOfO()){
            return "O";
        }
        else{
            return "";
        }
    }

    public boolean checkWin(char playerXY) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == playerXY) {
                    count++;
                }
            }
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }
}
