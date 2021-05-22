package SBK.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import SBK.Models.Students;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public void save(Students customers) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Customers(First_Name, Last_Name, Birthday_day, Birthday_Month, Birthday_Year, Email_Id, Mobile_Number, Gender, Address, City, Pin_Code, State, Country, Course_Id, Enrolement_Id)"
		+"VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { customers.getFirst_Name(), customers.getLast_Name(),
				customers.getBirthday_day(), customers.getBirthday_Month(), 
				customers.getBirthday_Year(), customers.getEmail_Id(), 
				customers.getMobile_Number(), customers.getGender(),
				customers.getAddress(), customers.getCity(),
				customers.getPin_Code(), customers.getState(),
				customers.getCountry(), customers.getCourse_Id(),
				customers.getEnrolement_Id()});
		
	}
	
	public void update(Students customers) {
		// TODO Auto-generated method stub
		String sql = "Update Customers set First_Name = ?, Last_Name = ?"
				+ ",Birthday_day = ?, Birthday_Month = ?, Birthday_Year = ? "
				+ ", Mobile_Number = ?, Gender = ?"
				+ ",Address = ?, City = ?, Pin_Code = ?, State = ?,"
				+ "Country = ?,Course_Id = ?, Enrolement_Id = ?  where Email_Id = ?";
		
		jdbcTemplate.update(sql, new Object[] { customers.getFirst_Name(), customers.getLast_Name(),
				customers.getBirthday_day(), customers.getBirthday_Month(), 
				customers.getBirthday_Year(), 
				customers.getMobile_Number(), customers.getGender(),
				customers.getAddress(), customers.getCity(),
				customers.getPin_Code(), customers.getState(),
				customers.getCountry(), customers.getCourse_Id(),
				customers.getEnrolement_Id(),customers.getEmail_Id()});
	}

	/*First_Name varchar(50),
    Last_Name varchar(50),
    Birthday_day INTEGER(2),
    Birthday_Month varchar(10),
    Birthday_Year INTEGER(4),
    Email_Id varchar(100),
    Mobile_Number varchar(20),
    Gender char(1),
    Address varchar(100),
    City varchar(50),
    Pin_Code INTEGER(6),
    State varchar(100),
    Country varchar(100),
    Course_Id varchar(100),
    Enrolement_Id varchar(100)*/
	
	public void delete(String Email_Id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Customers where Email_Id=?";
		jdbcTemplate.update(sql, new Object[]{Email_Id});
	}

	public Students get(String Email_Id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Customers where Email_Id='" + Email_Id + "'";
	    return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Students.class));
	}

	public List<Students> list() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Customers";
		
		List<Students> customerslist = jdbcTemplate.query(sql, new ResultSetExtractor<List<Students>>(){

			public List<Students> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<Students> list = new ArrayList<Students>();
	                while (rs.next())
	                {
	                    Students customer = new Students();
	                    customer.setFirst_Name(rs.getString(1));
	                    customer.setLast_Name(rs.getString(2));
	                    customer.setEmail_Id(rs.getString(6));
	                    list.add(customer);
	                }
	                return list;
			}
        });
		
		return customerslist;
	}

	

}
