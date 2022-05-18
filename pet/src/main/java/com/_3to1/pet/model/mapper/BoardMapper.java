public interface BoardMapper {
    public List<Board> selectBoard();
    public Board selectBoardByNo(int articleno);
    public int insertBoard(Board board);
    public int updateBoard(Board board);
    public int deleteBoard(int articleno);
}