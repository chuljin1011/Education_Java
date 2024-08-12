package xyz.itwill.dto;

import java.util.List;

public class MyCommentReply {

	private MyComment1 comment;

	private List<MyReply> replyList;
	
	public MyCommentReply() {
		// TODO Auto-generated constructor stub
	}

	public MyComment1 getComment() {
		return comment;
	}

	public void setComment(MyComment1 comment) {
		this.comment = comment;
	}

	public List<MyReply> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<MyReply> replyList) {
		this.replyList = replyList;
	}
	
}
