/**
 * 
 */
package fr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * @author esapin
 *
 */
public class CSVlikeHandler {
	
	private int nb_rows;
	
	private int nb_columns;
	
	private String columnsName[];

	public int getNb_rows() {
		return nb_rows;
	}

	public void setNb_rows(int nb_rows) {
		this.nb_rows = nb_rows;
	}

	public int getNb_columns() {
		return nb_columns;
	}

	public void setNb_columns(int nb_columns) {
		this.nb_columns = nb_columns;
	}

	public String[] getColumnsName() {
		return columnsName;
	}

	public void setColumnsName(String columnsName[]) {
		this.columnsName = columnsName;
	}
	
	public void showColumnsNames()
	{
		for(int i = 0;i<this.getColumnsName().length; i++)
		{
			System.out.println("[" + (i+1) + "]" + " = " + this.getColumnsName()[i]);
		}
	}
	
	public void showProperties()
	{
		System.out.println("**************************************");
		System.out.println("** Showing properties of request... **");
		System.out.println("**************************************");
		this.showColumnsNames();
		System.out.println("Columns: " + this.getNb_columns());
		System.out.println("Rows: " + this.getNb_rows());
		System.out.println("**************************************");
		System.out.println("**         Display stopped.         **");
		System.out.println("**************************************");
	}
	
	public CSVlikeHandler(String plainText) {
		BufferedReader reader = new BufferedReader(new StringReader(plainText));
		try {
			this.columnsName = reader.readLine().split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.nb_columns = this.getColumnsName().length;
		this.nb_rows = 0;
		try {
			while(reader.readLine() != null)
			{
				this.nb_rows++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
