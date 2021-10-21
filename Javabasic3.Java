public class JavaBasic3
{
	public static void main(String args[])
	{
        System.out.println("");
        System.out.println("********* LOOPING *********");
    
    //Segitiga
		int i,j,k,l;
		for(i=1;i<=8;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=8;k>=i;k--)
			{
				System.out.print("*");
			}
			for(l=7;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println("");

		}
}
}