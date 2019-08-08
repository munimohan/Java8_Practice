import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateTest {
	static List<Row> rowList = Arrays.asList();
	public static void main(String[] args) {
		Row row = new Row(11, "test1", "999");
		Row row1 = new Row(11, "test2", "777");
		Row row2 = new Row(11, "test4", "999");
		Row row3 = new Row(11, "test3", "555");
		Row row4 = new Row(11, "test5", "999");
		Row row5 = new Row(11, "test6", "555");
		Row row6 = new Row(11, "test7", "333");
		rowList.add(row);
		rowList.add(row1);
		rowList.add(row2);
		rowList.add(row3);
		rowList.add(row4);
		rowList.add(row5);
		rowList.add(row6);
		
		Map<Integer, List<Row>> groupByPriceMap = 
				rowList.stream().collect(Collectors.groupingBy(Row::getRowId));
		
		Map<Integer, List<String>> duplicateRowMap =
				rowList.stream().collect(
                        Collectors.groupingBy(Row::getRowId,
                                Collectors.mapping(Row::getRequestId, Collectors.toList())
                        )
                );
		}
}

class Row{
	private Integer rowId;
	private String name;
	private String requestId;
	public Row(int id, String name, String reqId) {
		this.rowId = id;
		this.name = name;
		this.requestId = reqId;
	}
	public int getRowId() {
		return rowId;
	}
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	@Override
	public String toString() {
		return "Row [rowId=" + rowId + ", name=" + name + ", requestId=" + requestId + "]";
	}
	
	
}
