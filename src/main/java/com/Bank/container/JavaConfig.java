package com.Bank.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Bank.service.Account;
import com.Bank.service.Balance;

@Configuration
public class JavaConfig {
	
	@Bean
	public Account acc() {
		Account ac = new Account();
		return ac;
	}
	
	@Bean
	public Balance bal() {
		Balance b = new Balance();
		return b;
	}

}
