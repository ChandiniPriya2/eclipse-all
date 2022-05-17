package ai.jobiak.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ResultSetEmp {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Employee>getAll(){
		return jdbcTemplate.query("select * from employee",new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list=new ArrayList<Employee>();
				
				while(rs.next()) {
					Employee e=new Employee();
					e.setCompany(rs.getString(1));
					e.setId(rs.getInt(2));
					e.setName(rs.getString(3));
					e.setSalary(rs.getInt(4));
					list.add(e);
						}
				return list;
			}
			
			
			
		});
	}
	
}
