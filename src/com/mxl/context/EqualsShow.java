package com.mxl.context;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 在重写euqal方法的时候需要遵循以下原则
 * 1、若x.equal(y)为true，则y.equal(x)也要返回true
 * 2、若x.equal(y)为true，y.equal(z)为true，则x.equal(z)也为true
 */
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

		System.out.println("first : " + sets.add(d1));
		sets.add(timestamp);

		System.out.println("twice : " + sets.add(d1));
		System.out.println(sets.size());
	}

}
