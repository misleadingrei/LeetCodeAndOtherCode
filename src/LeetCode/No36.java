package LeetCode;

public class No36 {
    public boolean isValidSudoku(char[][] board) {
        return isRowValid(board)&&isColValid(board)&&isUnitValid(board);

    }

    private boolean  isRowValid (char[][] board){
        HashSet<Character> set = null;
        for(int i = 0 ;i<board.length;i++){
            set = new HashSet<>();
            for(int j = 0 ;j<board[i].length;j++){
                if(board[i][j]=='.')continue;
                if(board[i][j]<'0'||board[i][j]>'9')return false;
                boolean unexis = set.add(board[i][j]);
                if(!unexis){
                    return false;
                }
            }

        }
        return true;
    }

    private boolean isColValid(char[][] board){
        HashSet<Character>  set =null;
        for(int i = 0 ;i<board[0].length;i++){
            set = new HashSet<>();
            for(int j = 0 ;j<board.length;j++){
                if(board[j][i]=='.')continue;
                if(board[j][i]<'0'||board[j][i]>'9')return false;
                boolean unexis = set.add(board[j][i]);
                if(!unexis){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isUnitValid(char[][] board){
        for(int i = 0 ;i<9;i+=3){
            for(int j = 0 ;j<9;j+=3){
                HashSet set = new HashSet<>();
                for(int pos1 = i;pos1<i+3;pos1++){
                    for(int pos2 = j;pos2<j+3;pos2++){
                        if(board[pos1][pos2]=='.')continue;
                        if(board[pos1][pos2]<'0'||board[pos1][pos2]>'9')return false;
                        boolean unexis = set.add(board[pos1][pos2]);
                        if(!unexis){
                            return false;
                        }

                    }
                }
            }
        }
        return true;
    }
}
