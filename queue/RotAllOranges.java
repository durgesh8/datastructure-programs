package queue;

import java.util.LinkedList;
import java.util.Queue;

public class RotAllOranges {
	
	public static void main(String[] args) {
		int[][] arr= { {2,1,0,2,1},
				{1,0,1,2,1},
				{0,0,0,2,1}};
		System.out.println(daysToRot(arr, 0));
	}

	static int daysToRot(int[][] oranges, int days) {
		days= days+1;
		Queue<String> queue = new LinkedList<>();
		int count = 0;
		for (int i = 0; i < oranges.length; i++) {
			for (int j = 0; j < oranges[0].length; j++) {
				if (oranges[i][j] == 1)
					count++;
				if (oranges[i][j] == 2) {
					if (i == 0 && j == 0) {
						if (oranges[i + 1][j] == 1) {
							String pos = (i + 1) + "," + j;
							queue.add(pos);
						}
						if (oranges[i][j + 1] == 1) {
							String pos = i + "," + (j + 1);
							queue.add(pos);
						}

					} else if (i == 0 && j != 0) {
						if (oranges[i + 1][j] == 1) {
							String pos = (i + 1) + "," + j;
							queue.add(pos);
						}
						if (j!=oranges[0].length-1 && oranges[i][j + 1] == 1) {
							String pos = i + "," + (j + 1);
							queue.add(pos);
						}
						if (oranges[i][j - 1] == 1) {
							String pos = i + "," + (j - 1);
							queue.add(pos);
						}
					}

					else if (i != 0 && j == 0) {
						if (i!=oranges.length-1 && oranges[i + 1][j] == 1) {
							String pos = (i + 1) + "," + j;
							queue.add(pos);
						}
						if (oranges[i][j + 1] == 1) {
							String pos = i + "," + (j + 1);
							queue.add(pos);
						}
						if (oranges[i - 1][j] == 1) {
							String pos = (i - 1) + "," + j;
							queue.add(pos);
						}

					}
					else {
						if (i!=oranges.length-1 && oranges[i + 1][j] == 1) {
							String pos = (i + 1) + "," + j;
							queue.add(pos);
						}
						if (j!=oranges[0].length-1 &&  oranges[i][j + 1] == 1) {
							String pos = i + "," + (j + 1);
							queue.add(pos);
						}
						if (oranges[i - 1][j] == 1) {
							String pos = (i - 1) + "," + j;
							queue.add(pos);
						}
						if (oranges[i][j - 1] == 1) {
							String pos = i + "," + (j - 1);
							queue.add(pos);
						}
					}

				}
			}
		}
		
		if(count==1 && queue.size()==0)
			return -1;
		
			
             if(count !=0 && count > queue.size()) {
            	 while(!queue.isEmpty()) {
            		 String pos=queue.poll();
            		 String[] posArray=pos.split(",");
            		 int r=Integer.valueOf(posArray[0]);
            		 int c=Integer.valueOf(posArray[1]);
            		 oranges[r][c]=2;
            	 }
            	days=daysToRot(oranges, days);
            	 
             }
			if (count == 0)
				return -1;
			
			return days;
		
	}
}
