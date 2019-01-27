package com.marcospaulo.persistenciaJPA;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import com.marcospaulo.model.Computer;
import com.marcospaulo.model.HibernateSession;
import com.marcospaulo.model.User;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateSession.getSessionFactory().openSession();  
    	//session.getTransaction().begin();
    	
		/*
		 * 
		 * Atualizando 
		 * Product product = session.find(Product.class, 4);
		 * 
		 * if(product != null) { product.setName("Products Edited 3");
		 * product.setPrice(20.00); session.saveOrUpdate(product); }
		 * session.getTransaction().commit();
		 */
    	
    	
		/*
		 * Salvando com o método save
		 * Product product=new Product(); product.setName("P 1"); product.setPrice(8.4);
		 * //session.save(product);
		 */
    	
    	
    	/*
    	 * Buscando
    	 * 
		 * // List<Product> products=
		 * session.createQuery("from Product").getResultList();
		 * //System.out.println(products);
		 * 
		 * Product p1 = session.find(Product.class, 4);
		 * 
		 * System.out.println(p1.getName());
		 * 
		 * 
		 * 
		 */
    	
    	
		/*
		 * Removendo o Produto
		 * 
		 * session.getTransaction().begin();
		 * 
		 * Product delProduct = session.find(Product.class, 4);
		 * 
		 * if(delProduct!=null) { session.remove(product); }
		 * session.getTransaction().commit();
		 */
    	
    	Computer comp = new Computer();
    	comp.setName("INTEL");
    	session.save(comp);
    	
    	session.getTransaction().begin();
    	User user=new User();
    	user.setName("Marcos");
    	
    	
    	
    	List<Computer> computer = new ArrayList<Computer>();
    	computer.add(comp);    	
    	user.setComputers(computer);    	
    	session.save(user);    	
    	session.getTransaction().commit();
    	
    	
    	
    	
    	
    	


    }
}
