package eg00220;

import java.sql.Connection;

public class HtmlReportImpl implements HtmlReport {

	@Override
	public void generateHtmlReport(Connection connection, String tableName) {
		System.out.println("HTML Report generation logic here...");
	}

}
