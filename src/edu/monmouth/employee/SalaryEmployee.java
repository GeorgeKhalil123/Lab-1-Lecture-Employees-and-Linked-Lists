package edu.monmouth.employee;

public class SalaryEmployee implements Employee
{
	private int yearlySalary;
	
	public SalaryEmployee(int s)
	{
		yearlySalary = s;
	}
	
	public int getMonthlySalary()
	{
		return yearlySalary/12;
	}
	
	@Override
	public String toString()
	{
		return "Employee Type: Salary\nYearly Salary: $" + yearlySalary;
	}
	
	@Override
	public boolean equals(Object b)
	{
		if(this == b)
		{
			return true;
		}
		if (b == null || getClass() != b.getClass())
		{
			return false;
		}
		SalaryEmployee s = (SalaryEmployee) b;
		
		return yearlySalary == s.yearlySalary;
	}
}