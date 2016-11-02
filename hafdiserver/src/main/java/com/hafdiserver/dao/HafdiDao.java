package com.hafdiserver.dao;

import com.hafdiserver.model.Schiffsname;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Birgit on 31.10.2016.
 */
public class HafdiDao {

    private SessionFactory hafdiSessionFactory;

    public void setHafdiSessionFactory(SessionFactory sessionFactory){
        this.hafdiSessionFactory = sessionFactory;
    }

    public void saveSchiff(Schiffsname schiff) {
        Session session = this.hafdiSessionFactory.openSession();
        session.beginTransaction();
        session.save(schiff);
        session.getTransaction().commit();
        session.close();
    }
}
