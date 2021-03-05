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
            if(checkRow('X') || checkColumn('X') || checkDiag('X')){
                return true;
            }
            else{
                return false;
            }
    }

    public Boolean isInFavorOfO() {
        if(checkRow('O') || checkColumn('O') || checkDiag('O')){
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

    public boolean checkRow(char playerXY) {
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;

        for(int i=0;i< matrix.length;i++){
            if(matrix[i][0] == playerXY){
                row1++;
            }
        }

        for(int i=0;i< matrix.length;i++){
            if(matrix[i][1] == playerXY){
                row2++;
            }
        }

        for(int i=0;i< matrix.length;i++){
            if(matrix[i][2] == playerXY){
                row3++;
            }
        }

        if(row1 == 3 || row2 == 3 || row3 == 3){
            return true;
        }

        return false;
    }

    public boolean checkColumn(char playerXY) {
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;

        for(int i=0;i< matrix.length;i++){
            if(matrix[0][i] == playerXY){
                col1++;
            }
        }

        for(int i=0;i< matrix.length;i++){
            if(matrix[1][i] == playerXY){
                col2++;
            }
        }

        for(int i=0;i< matrix.length;i++){
            if(matrix[2][i] == playerXY){
                col3++;
            }
        }

        if(col1 == 3 || col2 == 3 || col3 == 3){
            return true;
        }

        return false;
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
