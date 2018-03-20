package net.sduhsd.royr6099.scratch;

public class Matrix<E> {
	private Object[][] mat;
	private E element;
	
	/**
	 * Creates a new empty Matrix object.
	 * 
	 * @param n The number of rows
	 * @param m The number of columns
	 */
	public Matrix(int n, int m) {
		mat = new Object[n][m];
	}
	
	/**
	 * Creates a new matrix object that is a copy of a two-dimensional array.
	 * 
	 * @param mat The original two-dimensional array.
	 */
	public Matrix(E[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				this.mat[i][j] = mat[i][j];
			}
		}
	}
	
	public E[] getRow(int row) {
		if (row >= 0 && row < mat.length) {
			return cast(mat[row]);
		}
		else {
			return null;
		}
	}
	
	public void setRow(int row, E[] array) {
		if (row >= 0 && row < mat.length) {
			mat[row] = array;
		}
	}
	
	private E[] cast(Object[] arr) {
		return (E[]) arr;
	}
	
	private boolean isE(Object[] arr) {
		for (Object o : arr) {
			if ((E)o == null) {
				return false;
			}
		}
		
		return true;
	}
}
