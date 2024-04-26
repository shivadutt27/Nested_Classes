package dev.duttech.domain;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(List.of(
				new Employee(1001,"Jim",2012),
				new Employee(1002,"Alis",2023),
				new Employee(1003,"StuXj",2021),
				new Employee(1000,"Carry",2014)
				));
		
		//System.out.println(employees);
		
		//var comparator = new EmployeeComparator<>();
		//employees.sort(comparator);
		
		employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
		
		for(Employee e: employees) {
			//System.out.println(e);
		}
		
		
		//System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019,
                        "Target"),
            new StoreEmployee(10515, "Joe", 2021,
                    "Walmart"),
            new StoreEmployee(10105, "Tom", 2020,
                    "Macys"),
            new StoreEmployee(10215, "Marty", 2018,
                    "Walmart"),
            new StoreEmployee(10322, "Bud", 2016,
                    "Target")));
        
        //System.out.println(storeEmployees);
        
        storeEmployees.sort(new StoreEmployee().new StoreComparator<>());
        
        for(StoreEmployee e : storeEmployees) {
        	//System.out.println(e);
        }
        
        addPigLatinWord(employees);

	}
	
	static void addPigLatinWord(List<? extends Employee> list) {
		
		for(var employee: list) {
			
			//var firstChar = employee.getName().charAt(0); System.out.println("first char is"+ firstChar);
			var remainingName = employee.getName().substring(0); System.out.println("remainigName is"+ remainingName);
			var pigLatinWord = remainingName+"ay";
			
			System.out.println(employee.getName()+" pigLatinName is: "+pigLatinWord);
		}
	}

}
