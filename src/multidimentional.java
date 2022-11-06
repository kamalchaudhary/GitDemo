
public class multidimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a[row][colum]
		
		int a[][] = new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
	//System.out.println(a[1][0]);	
		
		int b[][] = {{2,3,4},{4,5,6},{7,8,9}};
		
		for(int i=0;i<=2;i++) //row
		{
			for(int j=0;j<3;j++) //column
			{
				System.out.println(b[i][j]);
			}
		}
		
		
		
	}

}
