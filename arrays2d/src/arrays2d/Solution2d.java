package arrays2d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution2d {
	public static void findLargest(int mat[][]){
		//Your code goes here
		int max=0;
		int index=0;
		boolean isRow=true;
		for(int i=0;i<mat.length;i++){
			int sum=0;
			for(int j=0;j<mat[i].length;j++){
			sum =sum+mat[i][j];
			}
			if (max<sum){
				max=sum;
				index=i;
			}
		}
for(int j=0;j<mat[j].length;j++){
	int sum =0;
	for(int i=0;i<mat.length;i++){

sum =sum+mat[i][j];
	}
	if(max<sum){
		max=sum;
		index=j;
		isRow=false;
	}
}
if(isRow){
	System.out.println("row"+ index+" "+max);
}else{
	System.out.println("column"+index+" "+max);
}

	}



static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public static int[][] take2DInput() throws IOException {
    String[] strRowsCols = br.readLine().trim().split("\\s");
    int n_rows = Integer.parseInt(strRowsCols[0]);
    int m_cols = Integer.parseInt(strRowsCols[1]);

    if (n_rows == 0) {
        return new int[0][0];
    }


    int[][] mat = new int[n_rows][m_cols];

    for (int row = 0; row < n_rows; row++) {
        String[] strNums; 
        strNums = br.readLine().trim().split("\\s");
        
        for (int col = 0; col < m_cols; col++) {
            mat[row][col] = Integer.parseInt(strNums[col]);
        }
    }

    return mat;
}


public static void main(String[] args) throws NumberFormatException, IOException {
    int t = Integer.parseInt(br.readLine().trim());

    while(t > 0) {

        int[][] mat = take2DInput();

        Solution2d.findLargest(mat);
        System.out.println();

        t -= 1;
    }
}
}
