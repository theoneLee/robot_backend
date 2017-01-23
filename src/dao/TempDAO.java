package dao;

import bean.Environment;
import bean.Temp;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import util.HibernateUtil;

import java.util.Date;

/**
 * Created by Lee on 2017/1/23 0023.
 */
@Component
public class TempDAO {
    public int save(Temp temp) {
        Session s= HibernateUtil.getSession();
        Transaction tx=s.beginTransaction();
        try {
            Environment ee=transfer(temp);
            s.save(ee);
            int id=ee.getId();
            tx.commit();
            return id;
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
            return -1;
        }

    }

    private Environment transfer(Temp temp) {
        Environment e=new Environment();
        e.setWairen(intToBool(temp.getWairen()));
        e.setMinghuo(intToBool(temp.getMinghuo()));
        e.setNongdu(temp.getNongdu()+"%");
        e.setShidu(temp.getShidu()+"%");
        e.setWendu(temp.getWendu()+"℃");
        e.setDate(new Date());
        return e;
    }

    private String intToBool(String i){
        if (i.equals("1")){
            return "YES";
        }
        if (i.equals("0")){
            return "NO";
        }
        return "null";
    }
}
