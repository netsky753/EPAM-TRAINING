package Coffee;


public class Coffee {


	private String condition;
	private String type;
	private Integer size;
	private Integer price;
	// это цена за 1 грамм
	final int price_ = 1;
	// это объём видов кофе
	final int grain_size = 3;
	final int ground_and_soluble_size = 2;
	final int pack_size = 1000;
	final int bag_size = 10;
	
	Coffee ()
	{	
	}
		
	void output () {
		System.out.println(this.condition + " " + this.size + " " +  this.price  + " " + this.type);
		
		}

	//public String getCondition() {
	//	return condition;
	//}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	//public String getType() {
	//	return type;
	//}

	public void setType(String type) {
		this.type = type;
	}

	//public Integer getSize() {
	//	return size;
	//}

	public void setSize(Integer size) {
		this.size = size;
	}

	//public Integer getPrice() {
	//	return price;
	//}

	public void setPrice(Integer price) {
		this.price = price;
	}
	}
	 
	