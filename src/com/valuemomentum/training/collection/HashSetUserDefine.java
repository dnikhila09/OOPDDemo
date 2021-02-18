package com.valuemomentum.training.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefine {

	public static void main(String[] args) {
		
		Set<Emp> empset = new HashSet<Emp>();
		
//		Set<String> names = new HashSet<String>();
//		names.add("pinky");
		
		Emp e1=new Emp(100,"\tjohn",5000);
		Emp e2=new Emp(100,"\tmike",6000);
		Emp e3=new Emp(100,"\tnik",7000);
		Emp e4=new Emp(100,"\tjohn",5000);
		
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		empset.add(e4);
		
		for(Emp e:empset)
		{
			System.out.println(e.id+""+e.name+" "+e.sal);
		}
	}

}
