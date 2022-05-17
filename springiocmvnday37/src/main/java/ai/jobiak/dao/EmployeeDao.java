package ai.jobiak.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public int insertRow() {
	
	return jdbcTemplate.update("insert into employee values('google',765,'Victoria',8765)");
}
public int update() {
	
	return jdbcTemplate.update("update employee set salary=7765 where empId=765");
}
public int delete() {
	
	return jdbcTemplate.update("delete from employee where empId=765");
}
}
