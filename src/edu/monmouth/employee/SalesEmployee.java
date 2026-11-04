package edu.monmouth.employee;

public class SalesEmployee implements Employee
{
	private int commission, yearlyBase;
	
	public SalesEmployee(int y)
	{
		yearlyBase = y;
	}
	
	public void setCommission(int s)
	{
		commission = s;
	}
	
	public int getMonthlySalary()
	{
		return yearlyBase/12;
	}
	
	@Override
	public String toString()
	{
		return "Employee Type: Sales\nYearly Base: $" + yearlyBase + "\nCommission: $" + commission;
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
		SalesEmployee s = (SalesEmployee) b;
		
		return commission == s.commission && yearlyBase == s.yearlyBase;
	}
}
