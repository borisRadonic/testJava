package ch.fhnw.mas.tarbo.ch;

public class MathUtils
{
	public int faculty( int n )
	{
		int res = 1;
		for( int i = 2; i <= n; i++ )
		{
			res = res * i;
		}
		return res;
	}
}
