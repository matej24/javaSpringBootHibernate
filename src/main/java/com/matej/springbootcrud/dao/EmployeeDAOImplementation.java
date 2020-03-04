package com.matej.springbootcrud.dao;

import com.matej.springbootcrud.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> get() {
       Session currentSession =  entityManager.unwrap(Session.class);
       Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
       List<Employee> list = query.getResultList();
       return list;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public void save(Employee employee) {
        Session currentSession =  entityManager.unwrap(Session.class);
        currentSession.save(employee);
    }

    @Override
    public void delete(int id) {

    }
}
