import java.util.List;

public class Main {

    static Board board;

    public static void main(String[] args) {
        System.out.println("Start over here");
        /*todo 1. create enum for orb , shape ,
               2. create solution
               -> bfs( 4 direction)
               -> swap
               -> check if iscancelable(if same color with neigbor -> dfs -> check sharp) -> yes : cancel -> drop -> check
                                                                                              no : loop bfs


        * */

        board = new Board(Board.Size.NORMAL);

    //    List<Result> results = new Solution().run();
    }
}
