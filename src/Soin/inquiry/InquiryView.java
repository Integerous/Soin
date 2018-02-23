package Soin.inquiry;

import java.util.Date;

public class InquiryView extends Inquiry {
	public InquiryView() {
		// TODO Auto-generated constructor stub
	}
	
	public InquiryView(
			String id,
			String title,
			String content,
			String type,
			String attachment,
			Date regDate,
			String answercheck,
			String memberId) {
		super(id,title,content,type,attachment,regDate,answercheck,memberId);
	}
	
	
	
}
