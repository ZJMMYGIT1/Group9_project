package group9.domain;

public class Order {
	private int id;
	private String order_key;
	private String order_item;
	private String order_custom;
	private double order_cost;
	private String order_time;
	private String order_state;

	public Order() {

	}

	public Order(int id, String order_key, String order_item, String order_custom, double order_cost, String order_time,
			String order_state) {
		super();
		this.id = id;
		this.order_key = order_key;
		this.order_item = order_item;
		this.order_custom = order_custom;
		this.order_cost = order_cost;
		this.order_time = order_time;
		this.order_state = order_state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrder_key() {
		return order_key;
	}

	public void setOrder_key(String order_key) {
		this.order_key = order_key;
	}

	public String getOrder_item() {
		return order_item;
	}

	public void setOrder_item(String order_item) {
		this.order_item = order_item;
	}

	public String getOrder_custom() {
		return order_custom;
	}

	public void setOrder_custom(String order_custom) {
		this.order_custom = order_custom;
	}

	public double getOrder_cost() {
		return order_cost;
	}

	public void setOrder_cost(double order_cost) {
		this.order_cost = order_cost;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public String getOrder_state() {
		return order_state;
	}

	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", order_key=" + order_key + ", order_item=" + order_item + ", order_custom="
				+ order_custom + ", order_cost=" + order_cost + ", order_time=" + order_time + ", order_state="
				+ order_state + "]";
	}
}
