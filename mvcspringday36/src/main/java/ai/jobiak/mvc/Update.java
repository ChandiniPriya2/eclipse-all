package ai.jobiak.mvc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class Update {
	private JdbcTemplate mysqlTemplate;
	public JdbcTemplate getMysqlTemplate() {
		return mysqlTemplate;
	}
	public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}
	public Boolean updateRow( int salary,int id) {
		String query="update customer set balance=? where id=?";
		return mysqlTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException,DataAccessException{
			ps.setInt(1, salary);
					ps.setInt(2, id);
return ps.execute();
		}
		});
	}
	}
	
	

