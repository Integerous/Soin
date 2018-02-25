package Soin.Contract;

import java.util.List;

public interface ContractDao {

	public int insert(Contract contract);
	public int update(Contract contract);
	public int delete(String id);
	
	public List<ContractView> getList();
	public ContractView get(String id);
}