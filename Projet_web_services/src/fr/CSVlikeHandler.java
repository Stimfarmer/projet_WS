/**
 * 
 */
package fr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author esapin
 *
 */
public class CSVlikeHandler {
	
	private int nb_rows;
	
	private int nb_columns;
	
	private InputStream filePath;
	
	private String fileName;

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
	
	public void showProperties()
	{
		System.out.println("**************************************");
		System.out.println("** Showing properties of request... **");
		System.out.println("**************************************");
		System.out.println("Columns: " + this.getNb_columns());
		System.out.println("Rows: " + this.getNb_rows());
		System.out.println("**************************************");
		System.out.println("**         Display stopped.         **");
		System.out.println("**************************************");
	}
	
	public CSVlikeHandler(String filePath) 
	{
		this.setFileName(filePath);
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filePath)));
			this.nb_columns = reader.readLine().split(",").length;
			this.filePath = getClass().getResourceAsStream(filePath);
			this.nb_rows = 1;
			while(reader.readLine() != null)
			{
				this.nb_rows++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public InputStream getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = getClass().getResourceAsStream(filePath);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
