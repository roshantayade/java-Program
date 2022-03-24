class Largest_Value
{
	public static void main(String[]args)
	{
		int a=200,b=300,c=400,d=500;
		int z = a>b ? (a>c ? (a>d ? a :d): (c>d? c : d)): (b>c ? (b>d ? b:d):(c>d ? c:d));
		System.out.println("Largest value: "+z);
	}
}