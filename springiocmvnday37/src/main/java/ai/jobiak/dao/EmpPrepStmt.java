package ai.jobiak.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmpPrepStmt {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public Boolean insert(final Employee e) {
	String q1="insert into employee values(?,?,?,?)";
	return jdbcTemplate.execute(q1, new PreparedStatementCallback<Boolean>() {
		public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException,DataAccessException{
			ps.setString(1, e.getCompany());
			ps.setInt(2, e.getId());
			ps.setString(3, e.getName());
			ps.setInt(4, e.getSalary());
			return ps.execute();
		}
	});
	}
	public Boolean update(final Employee2 employee2) {
		String q2="update employee set salary=? where empId=?";
		return jdbcTemplate.execute(q2, new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException,DataAccessException{
				ps.setInt(1, employee2.getSalary());
				ps.setInt(2, employee2.getId());
				return ps.execute();
			}
		});
		}
	public Boolean delete(final Employee2 employee2) {
		String q3="delete from employee where empId=?";
		return jdbcTemplate.execute(q3, new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException,DataAccessException{
				ps.setInt(1, employee2.getId());
				return ps.execute();
			}
		});
		}

}
