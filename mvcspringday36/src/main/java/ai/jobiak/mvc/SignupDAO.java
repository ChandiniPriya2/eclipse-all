package ai.jobiak.mvc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class SignupDAO {
	
	private JdbcTemplate mysqlTemplate;
	public JdbcTemplate getMysqlTemplate() {
		return mysqlTemplate;
	}
	public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}
	public Boolean insertRow(int id,String name,int salary) {
		String query="insert into customer values(?,?,?)";
		return mysqlTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
				public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException,DataAccessException{
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);
	return ps.execute();
			}
			});
	}
}
