package eg00220;

import java.sql.Connection;

public interface PdfReport {

	public abstract void generatePdfReport(Connection connection, String tableName);
}
