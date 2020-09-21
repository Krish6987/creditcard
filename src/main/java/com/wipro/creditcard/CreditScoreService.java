package com.wipro.creditcard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CreditScoreService {
	public String checkElgible(String panNO) {
		
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        CreditScoreDAO dao = context.getBean("creditScoreDAO", CreditScoreDAO.class);
        
        CreditScore dbData = dao.getDBData(panNO.toUpperCase());
        
        ((ConfigurableApplicationContext) context).close();
        if (dbData != null) {
            Double score = dbData.getCredit_score();
            if(score >= 5)
            	return "Eligible";
            else
            	return "NotEligible";
        }
        return "Invalid";
    }
}
