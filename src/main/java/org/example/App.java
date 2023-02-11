package org.example;

import org.example.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Person person = entityManager.find(Person.class, 1);
        System.out.println(person);

        Person person1 = new Person();
        person1.setName("TestJPA");
        person1.setAge(55);
        entityManager.getTransaction().begin();
        entityManager.persist(person1);
        entityManager.getTransaction().commit();
    }
}
