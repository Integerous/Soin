package Soin.inquiry;

import java.util.Date;

public class Inquiry {
	 private String id;
	 private String title;
	 private String content;
	 private String type;
	 private String attachment;
	 private Date regDate;
	 private String answerCheck;
	 private String memberId;
	 
	 public Inquiry() {
		// TODO Auto-generated constructor stub
	}
	 
	// 생성자 오버로드1 -작성일x 
	public Inquiry(String id, String title, String content, String type, String attachment, String answerCheck, String memberId) {
		
		this.id = id;
		this.title = title;
		this.content = content;
		this.type = type;
		this.attachment = attachment;
		this.answerCheck = answerCheck;
		this.memberId = memberId;
	}
	
	// 생성자 오버로드2
	public Inquiry(String id, String title, String content, String type, String attachment, Date regDate, String answerCheck,
			String memberId) {
		
		this.id = id;
		this.title = title;
		this.content = content;
		this.type = type;
		this.attachment = attachment;
		this.regDate = regDate;
		this.answerCheck = answerCheck;
		this.memberId = memberId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getAnswerCheck() {
		return answerCheck;
	}

	public void setAnswerCheck(String answerCheck) {
		this.answerCheck = answerCheck;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	 
	 
}
