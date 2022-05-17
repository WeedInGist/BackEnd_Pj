public class Board{
    private int board_Id;
    private String title;
    private String content;
    private String regDate;
    private String updateDate;
    private String deleteDate;
    private int inNum;
    private String category;
    private int recoCount;
    private int viewCount;

    public int getBoard_Id() {
        return board_Id;
    }

    public void setBoard_Id(int board_Id) {
        this.board_Id = board_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public int getInNum() {
        return inNum;
    }

    public void setInNum(int inNum) {
        this.inNum = inNum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRecoCount() {
        return recoCount;
    }

    public void setRecoCount(int recoCount) {
        this.recoCount = recoCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}