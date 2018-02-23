package Soin.inquiry;

import java.util.List;

public interface InquiryAnswerDao {
	public int insert(InquiryAnswer inquiryAnswer);
	public int delete(String inquiryId, String memberId);
	public int update(String inquiryId, String memberId);
	
	public List<InquiryAnswerView> getList();
	public InquiryAnswerView get(String inquiryId, String memberId);
}
