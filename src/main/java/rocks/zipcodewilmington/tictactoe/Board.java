package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {


    public Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        if (matrix[0][0] == ('X') && matrix[0][1] == ('X') && matrix[0][2] == ('X')) {
            return true;
        } else if (matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X') {
            return true;
        } else if (matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X') {
            return true;
        } else if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X') {
            return true;
        } else if (matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X') {
            return true;
        } else if (matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') {
            return true;
        } else if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X') {
            return true;
        } else if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if (matrix[0][0] == ('O') && matrix[0][1] == ('O') && matrix[0][2] == ('O')) {
            return true;
        } else if (matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O') {
            return true;
        } else if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
            return true;
        } else if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O') {
            return true;
        } else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O') {
            return true;
        } else if (matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O') {
            return true;
        } else if (matrix[2][0] == 'O' && matrix[1][1] == 'O' && matrix[0][2] == 'O') {
            return true;
        } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
            return false;
        } else if (matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X') {
            return false;
        } else if (matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O') {
            return false;
        } else if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X') {
            return false;
        } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
            return false;
        } else if (matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') {
            return false;
        } else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O') {
            return false;
        } else if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X') {
            return false;
        } else if (matrix[0][0] == 'X' && matrix[0][1] == 'O' && matrix[0][2] == 'X' &&
                matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'X' &&
                matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'O'){
            return true;
        } else if (matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'O' &&
                matrix[1][0] == 'O' && matrix[1][1] == 'X' && matrix[1][2] == 'X' &&
                matrix[2][0] == 'X' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
            return true;

        }
        return null;
        }



    public String getWinner() {
        if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X') {
            return "X";
        } else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O') {
            return "O";
        } else if (matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') {
            return "X";
        } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
            return "O";
        } else if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X') {
            return "X";
        } else if (matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O') {
            return "O";
        } else if (matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X') {
            return "X";
        } else if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
            return "O";
        } else if (matrix[0][0] == 'X' && matrix[0][1] == 'O' && matrix[0][2] == 'X' &&
                matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'X' &&
                matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'O'){
            return "";
        } else if (matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'O' &&
                matrix[1][0] == 'O' && matrix[1][1] == 'X' && matrix[1][2] == 'X' &&
                matrix[2][0] == 'X' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
            return "";

        }
        return null;
    }
}


