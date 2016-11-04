package com.hafdiserver.dao;

import com.hafdiserver.model.Schiffsname;
import com.hafdiserver.model.Status;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Birgit on 31.10.2016.
 */
public class HafdiDao {

    private SessionFactory hafdiSessionFactory;

    public void setHafdiSessionFactory(SessionFactory sessionFactory){
        this.hafdiSessionFactory = sessionFactory;
    }

    public SessionFactory getHafdiSessionFactory() {
        return hafdiSessionFactory;
    }

    public void saveSchiff(Schiffsname schiff) {
        Session session = this.hafdiSessionFactory.openSession();
        session.beginTransaction();
        session.save(schiff);
        session.getTransaction().commit();
        session.close();
    }

    public List<Status> selectStatusAll(){
        Session session= this.hafdiSessionFactory.openSession();
        session.beginTransaction();
        List<Status> allEntries = session.createCriteria(Status.class).list();
        session.getTransaction().commit();;
        session.close();
        return allEntries;
    }
}
