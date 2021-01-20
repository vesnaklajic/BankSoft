package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Account;

@Repository
@Transactional
public class AccountDaoImpl implements EntityRepository<Account> {
	@PersistenceContext

	private EntityManager em;

	@Override
	public Account save(Account a) {
		em.persist(a);
		return a;
	}

	@Override
	public List<Account> findAll() {
		Query req = em.createQuery("SELECT a FROM Account a");
		return req.getResultList();
	}

	@Override
	public List<Account> findByName(String mc) {
		Query req = em.createQuery("select a from Account a where a.clientName like :x");
		req.setParameter("x", mc);
		return req.getResultList();
	}

	@Override
	public Account update(Account a) {
		em.merge(a);
		return a;
	}

	@Override
	public void delete(Long id) {
		Account a = em.find(Account.class, id);
		em.remove(a);

	}

	@Override
	public Account findById(String id) {
		Account a = em.find(Account.class, id);
		return a;
	}

}
