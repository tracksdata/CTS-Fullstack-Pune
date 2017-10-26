package com;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bank.model.Account;
import com.service.BankSerive;

public class Test {

	public static void main(String[] args) {

		// Instantiate Spring Container:

		try {
			AbstractApplicationContext sc = null;
			sc = new ClassPathXmlApplicationContext("spring.xml");

			System.out.println("Spring Container Ready...");
			System.out.println();
			System.out.println("---------------------------");

			BankSerive bankSerive = null;
			bankSerive = (BankSerive) sc.getBean("bankService");

			Account account = new Account();
			
			//bankSerive.transfer(account);

			//System.out.println("----------");

			//bankSerive.deposit(account);

			//System.out.println("----------");
//
			//bankSerive.withdraw(account);

			//System.out.println("----------");

			bankSerive.withdraw2(account, "val3");

			System.out.println();
			System.out.println("------------------------------");

			sc.registerShutdownHook();

		} catch (Exception e) {
			System.err.println("Ex Handled..."+e);
		}

	}

}
