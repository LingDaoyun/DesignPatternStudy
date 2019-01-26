package org.yulang.filterPattern.main;

import java.util.ArrayList;
import java.util.List;

import org.yulang.filterPattern.bean.Person;
import org.yulang.filterPattern.impl.CriteriaFemale;
import org.yulang.filterPattern.impl.CriteriaMale;
import org.yulang.filterPattern.impl.CriteriaSingle;
import org.yulang.filterPattern.interPkg.Criteria;
import org.yulang.filterPattern.util.AndCriteria;
import org.yulang.filterPattern.util.OrCriteria;

public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);

		System.out.print("Males: \n");
		printPersons(male.meetCirteria(persons));
		
		System.out.print("\n Females : \n");
		printPersons(female.meetCirteria(persons));
		
		System.out.print("\n Single and Male: \n");
		printPersons(singleMale.meetCirteria(persons));
		
		System.out.print("\n Single or Female \n");
		printPersons(singleOrFemale.meetCirteria(persons));
	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}
