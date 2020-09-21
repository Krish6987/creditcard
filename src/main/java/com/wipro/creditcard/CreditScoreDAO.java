package com.wipro.creditcard;

import org.springframework.orm.hibernate4.HibernateTemplate;


public class CreditScoreDAO {
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}   
	
	public void saveCS(CreditScore cs){
	    template.save(cs);
	} 
	
	public CreditScore getDBData(String pan_number){
		CreditScore cs=(CreditScore)template.get(CreditScore.class,pan_number);
	    return cs;  
	} 
}
