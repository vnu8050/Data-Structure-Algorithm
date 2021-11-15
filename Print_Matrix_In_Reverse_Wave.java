package DataStructure;

public class Print_Matrix_In_Reverse_Wave {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int top = 0, bottom = 3, left = 0, right = 3;
		int direction = 0;
		while(right>=left) {
			if(direction == 0) {
				for(int i=bottom; i>=top; i--) {
					System.out.print(arr[i][right]+" ");
				}
				right--;
			}else if(direction == 1) {
				for(int i=top; i<=bottom; i++) {
					System.out.print(arr[i][right]+" ");
				}
				right--;
			}
			direction = (direction+1)%2;
		}
	}
}
