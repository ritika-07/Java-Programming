import java.util.*;
class q15
{
	public static void main( String[] args)
	{
		
		int i,j,k,l;
		Scanner sc= new Scanner(System.in);
		String genome= sc.nextLine();
		String[] g1=genome.split("ATG");
		for (i=0;i<g1.length;i++)
		{
			if (g1[i].length()>=3)
			{
				String[] g2= g1[i].split("TAG");
				for (j=0;j<g2.length;j++)
				{
					if (g2[j].length()>=3)
					{
						String[] g3= g2[j].split("TAA");
						for (k=0;k<g3.length;k++)
						{
							if (g3[k].length()>=3)
							{
								String[] g4= g3[k].split("TGA");
								for( l=0; l<g4.length;l++)
								{
									System.out.println(g4[l]);
								}
							}
						}
					}
				}
			}
		}

	}
}
