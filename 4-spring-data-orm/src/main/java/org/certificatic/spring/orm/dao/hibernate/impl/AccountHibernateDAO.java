package org.certificatic.spring.orm.dao.hibernate.impl;

import java.util.List;

import org.certificatic.spring.orm.dao.api.IAccountDAO;
import org.certificatic.spring.orm.dao.hibernate.GenericHibernateDAO;
import org.certificatic.spring.orm.domain.entities.Account;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

// Habilitar bean Repository 
@Repository
public class AccountHibernateDAO extends GenericHibernateDAO<Account, Long> implements IAccountDAO {

	public AccountHibernateDAO() {
		super(Account.class);
	}

	@Override
	public List<Account> findByCustomerId(Long id) {
		String hql = "FROM " + this.persistentClass.getName() + " WHERE customer = " + id;

		Session session = this.sessionFactory.getCurrentSession();

		Query query = session.createQuery(hql);

		List<Account> accounts = query.list();

		return accounts;
	}

}
