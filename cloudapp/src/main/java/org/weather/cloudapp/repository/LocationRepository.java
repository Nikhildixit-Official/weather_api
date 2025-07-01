package org.weather.cloudapp.repository;

import java.lang.reflect.AccessFlag;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.weather.cloudapp.model.Location;

import jakarta.persistence.EntityManager;

import org.hibernate.Transaction;

import org.hibernate.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public class LocationRepository  {
 EntityManager entityManager;
 @Autowired
 private SessionFactory sessionFactory;

 public void save(Location location){
    Session session=sessionFactory.openSession();
    Transaction transaction=null;
    try {
        transaction=session.beginTransaction();
        session.persist(location);
        transaction.commit();
    } catch (Exception e) {
        if (transaction!=null){transaction.rollback();
        }throw e;
    }
    finally{session.close();}
 }

 public Location findById(Long id){
    Session session=sessionFactory.openSession();
    // Transaction transaction=null;
    try {
        // transaction=session.beginTransaction();
return session.get(Location.class, id);
        // transaction.commit();
    } finally {
        session.close();
    }
 }

 public List<Location> findAll(){
    Session session = sessionFactory.openSession();
    try {
      Query<Location> query = session.createQuery("from Location", Location.class);
      return query.getResultList();
    } finally {
      session.close();
    }
 }


 public Location update(Location location){
Session session=sessionFactory.openSession();
Transaction transaction=null;

try {
    transaction=session.beginTransaction();

    return location;
} 
 finally {
    session.close();
}
 }
 public void deleteById(Long id){
    Session session=sessionFactory.openSession();
    Transaction transaction=null;
    try {
        transaction=session.beginTransaction();
        session.remove(id);
        transaction.commit();
           
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
 }
    }
