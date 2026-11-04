package edu.monmouth.employee;

public class PieceEmployee implements Employee
{
	private int ratePerPiece, piecesMade;
	
	public PieceEmployee(int r)
	{
		ratePerPiece = r;
	}
	
	public int getMonthlySalary()
	{
		return ratePerPiece * piecesMade;
	}
	
	public void setPiecesMade(int p)
	{
		piecesMade = p;
	}
	
	@Override
	public String toString()
	{
		return "Employee Type: Piece\nRate Per Piece: $" + ratePerPiece + "\nPieces Made: " + piecesMade;
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
		PieceEmployee s = (PieceEmployee) b;
		
		return ratePerPiece == s.ratePerPiece && piecesMade == s.piecesMade;
	}
}
