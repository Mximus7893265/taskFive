package ru.task.five;

public class TaskFive {

	void showSquare(int size) throws Exception {
		if(size<2 || size%2==1)
			throw new Exception("Array size must be 2 or greater and size%2==0");
		int a[][]=new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++)
				a[i][j]=Math.max(Math.min(Math.abs(i-size/2), Math.abs(i-size/2+1)), Math.min(Math.abs(j-size/2), Math.abs(j-size/2+1)));
		}
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}
}
