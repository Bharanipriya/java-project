import javax.persistence.Column;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		flavourDetails fd = new flavourDetails();
		fd.setFlavour_name("chocolate");
		fd.setFlavour_price(1000);
		fd.setFlavour_rating(45);
		
		cakesWithoutEgg cwe= new cakesWithoutEgg();
		cwe.setProduct_name("birthday cakes");
		cwe.setProduct_id(34);
		cwe.setProduct_price(90);
		cwe.setProduct_rating(7);
		
		eggCakeDetails ec= new eggCakeDetails();
		ec.setProduct_name("birthday cakes");
		ec.setProduct_id(34);
		ec.setProduct_price(90);
		ec.setProduct_rating(7);
		
		dealerDetails dd=new dealerDetails();
		dd.setDealer_username("janu");
		dd.setDealer_name("janani");
		dd.setDealer_id(34);
		dd.setDealer_mailid("janu@gmail.com");
		dd.setDealer_phonum("7890345767");
		dd.setDealer_pincode("678904");
		
		branchDetails bd=new branchDetails();
		bd.setBranch_id(56);
		bd.setBranch_name("heaven on earth cbe");
		bd.setBranch_address("coimbatore");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(fd);
		session.update(fd);
		
		session.save(cwe);
		session.update(cwe);
		
		session.save(ec);
		session.update(ec);
		
		session.save(bd);
		session.update(bd);
		
		session.save(dd);
		session.update(dd);
		
		session.getTransaction().commit();
		session.close();
	}

}





