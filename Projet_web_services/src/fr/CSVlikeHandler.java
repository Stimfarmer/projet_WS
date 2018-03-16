/**
 * 
 */
package fr;

/**
 * @author esapin
 *
 */
public class CSVlikeHandler {
	
	private int nb_rows;
	
	private int nb_columns;

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

	public CSVlikeHandler(int nb_rows, int nb_columns) {
		this.nb_rows = nb_rows;
		this.nb_columns = nb_columns;
	}

}
