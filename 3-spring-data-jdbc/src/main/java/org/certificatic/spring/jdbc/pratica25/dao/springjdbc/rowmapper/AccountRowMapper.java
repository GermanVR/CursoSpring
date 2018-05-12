package org.certificatic.spring.jdbc.pratica25.dao.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.certificatic.spring.jdbc.pratica25.domain.entities.Account;
import org.certificatic.spring.jdbc.pratica25.domain.entities.Customer;
import org.certificatic.spring.jdbc.pratica25.domain.vo.CustomDate;
import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();

		// Implementar Account row mapper
		account.setCustomer(new Customer());
		account.getCustomer().setId(rs.getLong("FK_CUSTOMER_ID"));

		account.setId(rs.getLong("ACCOUNT_ID"));
		account.setAccountNumber(rs.getString("ACCOUNT_NUMBER"));
		account.setCreatedDate(new CustomDate(rs.getDate("CREATED_DATE").getTime()));
		account.setBalance(rs.getBigDecimal("BALANCE"));

		return account;
	}

}
