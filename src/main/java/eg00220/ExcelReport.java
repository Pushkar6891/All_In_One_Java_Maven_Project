package eg00220;

import java.sql.Connection;

public interface ExcelReport {

	public abstract void generateExcelReport(Connection connection, String tableName);
}
