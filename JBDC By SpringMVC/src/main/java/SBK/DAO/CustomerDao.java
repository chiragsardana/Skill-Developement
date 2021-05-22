package SBK.DAO;

import java.util.List;

import SBK.Models.Students;

public interface CustomerDao {
	public void save(Students customer);
	
	public void update(Students customer);
    
    public void delete(String Email_Id);
     
    public Students get(String Email_Id);
     
    public List<Students> list();
}
