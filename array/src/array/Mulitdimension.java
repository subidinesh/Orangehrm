package array;

public class Mulitdimension {
public static void main(String[] args) {
	int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
	int i=0;
	int j=10;
	
	do {
		for (j=0;j<3;j++) {
			System.out.println(a[i][j]);
			
		}
		i++;}
	
	while (i<3);
	
	}
}

