package org.yulang.filterPattern.util;

import java.util.List;

import org.yulang.filterPattern.bean.Person;
import org.yulang.filterPattern.interPkg.Criteria;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria,Criteria otherCirteria) {
		this.criteria = criteria ;
		this.otherCriteria = otherCirteria;
	}
	
	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCirteria(persons);
		return otherCriteria.meetCirteria(firstCriteriaPersons);
	}

}
