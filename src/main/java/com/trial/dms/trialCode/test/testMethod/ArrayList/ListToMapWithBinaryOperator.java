package com.trial.dms.trialCode.test.testMethod.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapWithBinaryOperator {
	//我们将把BinaryOperator作为合并函数传递。当toMap()方法找到重复的键时，这些值将被合并，并且不会引发异常
	//toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction)
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(100, "Mohan"));
		list.add(new Person(100, "Sohan"));
		list.add(new Person(300, "Mahesh"));
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(Person::getId, Person::getName, (x, y) -> x+", "+ y));
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	}
}
