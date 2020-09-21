package com.wipro.creditcard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CreditScoreController 
{	
	@RequestMapping(value="/", method = RequestMethod.GET)
	   public String redirect() {
	      return "redirect:/index.html";
	   }
   
   @RequestMapping(value="/index.html", method = RequestMethod.GET)
   public String home(ModelMap model) {
      return "index";
   }
 
   
   @RequestMapping(value="/checkEligibility", method = RequestMethod.POST)
   public String checkEligibility(@RequestParam("panNo") String pan_number) { 
	   
	   CreditScoreService css = new CreditScoreService();
	   String view = css.checkElgible(pan_number.toUpperCase());
	   
	   return view;
   }
}
