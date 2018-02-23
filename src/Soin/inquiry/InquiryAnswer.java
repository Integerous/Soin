package Soin.inquiry;

import java.util.Date;

public class InquiryAnswer {
	private String inquiryId;
	private String memberId;
	private String title;
	private String content;
	private Date answerDate;
	
	public InquiryAnswer() {
		// TODO Auto-generated constructor stub
	}
	
	// 생성자 오버로드1 - 답변일x
	public InquiryAnswer(String inquiryId, String memberId, String title, String content) {
		this.inquiryId = inquiryId;
		this.memberId = memberId;
		this.title = title;
		this.content = content;
	}
	
	// 생성자 오버로드2
	public InquiryAnswer(String inquiryId, String memberId, String title, String content, Date answerDate) {
		this.inquiryId = inquiryId;
		this.memberId = memberId;
		this.title = title;
		this.content = content;
		this.answerDate = answerDate;
	}

	public String getInquiryId() {
		return inquiryId;
	}

	public void setInquiryId(String inquiryId) {
		this.inquiryId = inquiryId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public Date getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}
	
	
	
}
