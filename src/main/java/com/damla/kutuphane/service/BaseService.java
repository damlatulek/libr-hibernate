/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.damla.kutuphane.service;

import com.damla.kutuphane.framework.DBException;
import com.damla.kutuphane.hibernate.DHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.omg.CORBA.TRANSACTION_MODE;

/**
 *
 * @author vektorel
 */
public class BaseService implements IBaseService<Object> {

    public List<Object> getAll() {
        return null;
        
    }

    public Object getbyId(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object save(Object Obj) throws DBException {
        Session session = DHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(Obj);
        transaction.commit();
        session.close();
        return Obj;


    }

    public Boolean delete(Object Obj) throws DBException {
        return null;
    }

    public Object Update(Object Obj) throws DBException {
        Session session = DHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(Obj);
        transaction.commit();
        session.close();
        return Obj;
    }
}
