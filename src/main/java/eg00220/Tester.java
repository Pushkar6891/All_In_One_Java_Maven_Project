package eg00220;

import java.sql.Connection;

public class Tester {

	public static void main(String[] args) {

		Connection connection = null;
		String tableName = "employee_table";

		ExcelReport excelReport = new ExcelReportImpl();
		excelReport.generateExcelReport(connection, tableName);

		HtmlReport htmlReport = new HtmlReportImpl();
		htmlReport.generateHtmlReport(connection, tableName);

		PdfReport pdfReport = new PdfReportImpl();
		pdfReport.generatePdfReport(connection, tableName);

		System.out.println("=====================");

		// Usimg Facade Pattern to hide complexity of subsystem or system
		ReportFacade reportFacade = new ReportFacade();
		reportFacade.generateExcelReport(connection, tableName);
		reportFacade.generateHtmlReport(connection, tableName);
		reportFacade.generatePdfReport(connection, tableName);

		System.out.println("=====================");

	}

}
