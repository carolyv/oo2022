public class Sudoku {
    int[][] game;
    public Sudoku(int[][] game) {
        this.game = game;
    }
    // prindib sudoku
    public void printSudoku() {
        for(int i = 0; i < game.length; i++) {
            if(i % 3 == 0 && i != 0) {
                System.out.println("");
                System.out.println("---------------------");
            } else {
                System.out.println("");
            }
            for(int j = 0; j < game.length; j++) {
                if(j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(game[i][j]);
                System.out.print(" ");
            }
        }
    }
    // leiab koik rea numbrid ja paneb need massiivi
    public int[] getRow(int rowNr) {
        int[] rowNumbers = new int[9];
        for(int i = 0; i < game.length; i++) {
            rowNumbers[i] = game[rowNr][i];
        }
        return rowNumbers;
    }
    // leiab koik tulba numbrid ja paneb need massiivi
    public int[] getCol(int colNr) {
        int[] colNumbers = new int[9];
        for(int i = 0; i < game.length; i++) {
            colNumbers[i] = game[i][colNr];
        }
        return colNumbers; 
    }
    // leiab koik kasti numbrid ja paneb need massiivi
    public int[] getBox(int row, int column) {
        int[] boxNumbers = new int[9];
        int counter = 0;
        // Leian kastis oleva esimese numbri koordinaadid labi jaagi arvutamise
        int rowRemainder = row % 3;
        int colRemainder= column % 3;
        row = row - rowRemainder;
        column = column - colRemainder;
        for(int i = row; i < row + 3; i++) {
            for(int j = column; j < column + 3; j++) {
                boxNumbers[counter] = game[i][j];
                counter++;
            }
        }
        return boxNumbers;
    }
    // kontrollib, kas massiiv sisaldab otsitavat numbrit
    public boolean doesContain(int number, int[] array) {
        boolean contains = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                contains = true;
            }
        }
        return contains;
    }
    // kontrollib, kas tuhjale kohale saab seda kindlat numbrit panna
    public boolean isValid(int number, int row, int column) {
        boolean rowContain = doesContain(number, getRow(row));
        boolean colContain = doesContain(number, getCol(column));
        boolean boxContain = doesContain(number, getBox(row, column));
        /*System.out.println("box " + boxContain);
        System.out.println("row " + rowContain);
        System.out.println("col " + colContain);*/
        if(rowContain == false && colContain == false && boxContain == false) {
            return true;
        } else {
            return false;
        }
    }
    // lahendab sudoku taielikult
    public boolean solveSudoku() {
        for(int row = 0; row < 9; row++) { // rida
            for(int column = 0; column <  9; column++) { // veerg
                if(game[row][column] == 0) {
                    for(int number = 1; number <= game.length; number++) {
                        if(isValid(number, row, column)) {
                            game[row][column] = number;
                            if(solveSudoku()) {
                                return true;
                            } else {
                                game[row][column] = 0; // kui false, siis teeb ruudu uuesti tuhjaks
                            }
                        }
                    }
                    return false; // kui ukski number ei sobi
                }
            }
        }
        printSudoku();
        return true; 
    }
}