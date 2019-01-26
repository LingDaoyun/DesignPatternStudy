package org.yulang.filterPattern.impl;

import java.util.ArrayList;
import java.util.List;

import org.yulang.filterPattern.bean.Person;
import org.yulang.filterPattern.interPkg.Criteria;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> malePersons  = new ArrayList<Person>();
		for(Person person : persons) {
			if(person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
