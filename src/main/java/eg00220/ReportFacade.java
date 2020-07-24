package eg00220;

import java.sql.Connection;

public class ReportFacade {

	// Code for interfaces than implementation
	private ExcelReport excelReport;
	private HtmlReport htmlReport;
	private PdfReport pdfReport;

	public ReportFacade() {
		excelReport = new ExcelReportImpl();
		htmlReport = new HtmlReportImpl();
		pdfReport = new PdfReportImpl();
	}

	public void generateExcelReport(Connection connection, String tableName) {
		excelReport.generateExcelReport(connection, tableName);
	}

	public void generateHtmlReport(Connection connection, String tableName) {
		htmlReport.generateHtmlReport(connection, tableName);
	}

	public void generatePdfReport(Connection connection, String tableName) {
		pdfReport.generatePdfReport(connection, tableName);
	}
}
