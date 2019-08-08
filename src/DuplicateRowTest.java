

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateRowTest {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("mohan", 10, "999"),
                new Item("mansi", 20, "1999"),
                new Item("amit", 30, "2999"),
                new Item("vinay", 40, "2999"),
                new Item("test1", 50, "999"),
                new Item("test4", 60, "999"),
                new Item("test2", 70, "1999"),
                new Item("aptest3ple", 80, "999")
                );

		  Map<String, Set<Integer>> duplicateRows = items.stream().collect(
                        Collectors.groupingBy(Item::getReqId,
                                Collectors.mapping(Item::getRowId, Collectors.toSet())
                        )
                );
        
		  System.out.println(duplicateRows);
        List<Set<Integer>> valueList = duplicateRows.values().stream().collect(Collectors.toList());
        System.out.println(valueList);
    }
}

class Item {

    private String name;
    private int rowId;
    private String reqId;
	public Item(String name, int qty, String price) {
		super();
		this.name = name;
		this.rowId = qty;
		this.reqId = price;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRowId() {
		return rowId;
	}


	public void setRowId(int rowId) {
		this.rowId = rowId;
	}


	public String getReqId() {
		return reqId;
	}


	public void setReqId(String reqId) {
		this.reqId = reqId;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", rowId=" + rowId + ", reqId=" + reqId + "]";
	} 
}

