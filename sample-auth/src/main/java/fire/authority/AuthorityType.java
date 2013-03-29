package fire.authority;


/**
 */
public enum AuthorityType{

	SALES_ORDER_CREATE("创建订单", 0), 
	SALES_ORDER_FIND("查看订单", 1),
	SALES_ORDER_MODIFY("修改订单", 2),
	SALES_ORDER_DELETE("删除订单", 3),
	
	;
	private String name;
	private int index;

	private AuthorityType(String name, int index) {
		this.name = name;
		this.index = index;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
