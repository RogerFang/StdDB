package edu.whu.irlab.model.mysql;

public class Answer {
    private Integer id;

    private Integer questionId;

    private String username;

    private String userTag;

    private String voteNum;

    private String commentNum;

    private String thanksNum;

    private String date;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserTag() {
        return userTag;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag == null ? null : userTag.trim();
    }

    public String getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(String voteNum) {
        this.voteNum = voteNum == null ? null : voteNum.trim();
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum == null ? null : commentNum.trim();
    }

    public String getThanksNum() {
        return thanksNum;
    }

    public void setThanksNum(String thanksNum) {
        this.thanksNum = thanksNum == null ? null : thanksNum.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}