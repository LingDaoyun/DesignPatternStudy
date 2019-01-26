package org.yulang.filterPattern.impl;

import java.util.ArrayList;
import java.util.List;

import org.yulang.filterPattern.bean.Person;
import org.yulang.filterPattern.interPkg.Criteria;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for(Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
