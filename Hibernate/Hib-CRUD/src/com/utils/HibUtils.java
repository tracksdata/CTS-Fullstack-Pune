package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtils {
	
	private static SessionFactory sf;
	private static Configuration cfg;
	
	public static SessionFactory getSessionFactory() {
	
	
		cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
		return sf;
	}

}
