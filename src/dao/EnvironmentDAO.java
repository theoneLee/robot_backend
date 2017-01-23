package dao;

import bean.Environment;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Lee on 2017/1/23 0023.
 */
@Component
public class EnvironmentDAO {

    public List<Environment> getAllList() {
        Session s= HibernateUtil.getSession();
        Transaction tx=s.beginTransaction();
        Query query=s.createQuery("from Environment");
        List<Environment> list=query.list();
        tx.commit();
        return list;
    }
}
