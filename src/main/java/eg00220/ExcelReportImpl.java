package eg00220;

import java.sql.Connection;

public class ExcelReportImpl implements ExcelReport {

	@Override
	public void generateExcelReport(Connection connection, String tableName) {
		System.out.println("EXCEL Report generation logic here...");
	}

}
