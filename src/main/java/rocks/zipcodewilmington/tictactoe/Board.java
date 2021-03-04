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
        for(int i=0;i< matrix.length;i++){
            if(checkColumn('X',i)){
                xWon = true;
            }
            else if(checkRow('X',i)){
                xWon = true;
            }
            else if(checkDiag('X')){
                xWon = true;
            }
            else{
                xWon = false;
            }
        }
        return xWon;
    }

    public Boolean isInFavorOfO() {
        boolean oWon = false;
        for(int i=0;i< matrix.length;i++){
            if(checkColumn('O',i)){
                oWon = true;
            }
            else if(checkRow('O',i)){
                oWon = true;
            }
            else if(checkDiag('O')){
                oWon = true;
            }
            else{
                oWon = false;
            }
        }
        return oWon;

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

    public boolean checkColumn(char playerXY,int column){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][column].equals(playerXY)){
                count++;
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkRow(char playerXY,int row){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[row][i].equals(playerXY)){
                count++;
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkDiag(char playerXY){
        int countLeftDiag = 0;
        int countRightDiag = 0;

        for(int i=0;i<matrix.length;i++){
            if(matrix[i][i].equals(playerXY)){
                countLeftDiag++;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][matrix.length-i-1].equals(playerXY)){
                countRightDiag++;
            }
        }


        if(countLeftDiag==3 || countRightDiag==3){
            return true;
        }
        else{
            return false;
        }
    }

}
