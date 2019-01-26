package org.yulang.filterPattern.util;

import java.util.List;

import org.yulang.filterPattern.bean.Person;
import org.yulang.filterPattern.interPkg.Criteria;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria,Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCirteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCirteria(persons);
		for(Person person : otherCriteriaItems) {
			if(!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
