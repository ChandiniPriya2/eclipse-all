package ai.jobiak.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAO {
private JdbcTemplate mysqlTemplate;
public JdbcTemplate getMysqlTemplate() {
	return mysqlTemplate;
}
public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
	this.mysqlTemplate = mysqlTemplate;
}
public int insertRow() {
	return mysqlTemplate.update("insert into customer values(199,'abc',4000)");
}

}
