package org.sreekanth.ums.repositoty;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.spi.support.CollectionNonStrictReadWriteAccess;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sreekanth.ums.entity.RegisterEntity;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import javafx.print.Collation;

@Repository
public class RegisterRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<RegisterEntity> findAllUsers(){
		try {
			String hqlQuery="from RegisterEntity";
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hqlQuery);
			return query.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
		}
//		return Collection.EMPTY_LIST;
		return null;
	}
	
	public void saveUser(RegisterEntity registerEntity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registerEntity);
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
