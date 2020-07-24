package eg00220;

import java.sql.Connection;

public class PdfReportImpl implements PdfReport {

	@Override
	public void generatePdfReport(Connection connection, String tableName) {
		System.out.println("PDF Report generation logic here...");
	}

}
