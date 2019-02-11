package org.thoughts.on.java.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestInitialScript {

	
	private EntityManagerFactory emf;
    @Before
    public void init() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    @After
    public void close() {
    
        emf.close();
    }
    
    @Test
    public void test() {
    	
    }
}
