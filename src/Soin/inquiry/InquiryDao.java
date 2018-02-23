package Soin.inquiry;

import java.util.List;

public interface InquiryDao {
	//1:1문의하기는 수정이 없으므로 update는 뺌
	public int insert(Inquiry inquiry);
	public int delete(String id);
	
	public List<InquiryView> getList();
	public InquiryView get(String id);
}
