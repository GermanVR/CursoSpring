package org.certificatic.spring.jdbc.pratica25.dao.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.certificatic.spring.jdbc.pratica25.domain.entities.Customer;
import org.certificatic.spring.jdbc.pratica25.domain.entities.User;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();
		user.setId(rs.getLong("USER_ID"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setUsername(rs.getString("USERNAME"));
		user.setCustomer(new Customer());
		user.getCustomer().setId(rs.getLong("CUSTOMER_ID"));
		user.getCustomer().setName(rs.getString("NAME"));
		user.getCustomer().setLastName(rs.getString("LAST_NAME"));
		user.getCustomer().setUser(user);

		return user;

	}
}
