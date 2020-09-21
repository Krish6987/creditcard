package com.wipro.creditcard;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CreditScore")
public class CreditScore {

	@Id
	String pan_number;
	double credit_score;
	
	public String getPan_number() {
		return pan_number;
	}
	
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	
	public double getCredit_score() {
		return credit_score;
	}
	
	public void setCredit_score(double credit_score) {
		this.credit_score = credit_score;
	}
}
