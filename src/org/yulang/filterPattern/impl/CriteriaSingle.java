package org.yulang.filterPattern.impl;

import java.util.ArrayList;
import java.util.List;

import org.yulang.filterPattern.bean.Person;
import org.yulang.filterPattern.interPkg.Criteria;

public class CriteriaSingle  implements Criteria{

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for(Person person : persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
