package com.mxl.context;

import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EqualsShow {

	public static void main(String[] args) {
//		User u1 = new User("Tom" , 21);
//		
//		User u2 = new User("Tom" , 21);
//		
//		User u3 = new User("Tom" , 21);
//		
//		System.out.println(u1.equals(u3));
	
		new EqualsShow().testDateAndTimestamp();
	}
	
	public void testDateAndTimestamp(){
		Date d1 = new Date();
		Date d2 = d1;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		System.out.println(d1.equals(timestamp));//true
		System.out.println(timestamp.equals(d1));//false
		
		Set<Object> sets = new HashSet<Object>();
		
		sets.add(d1);
		sets.add(timestamp);
		
		System.out.println(sets.size());
	}
	
}
