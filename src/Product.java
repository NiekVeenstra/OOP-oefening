
public class Product {
	public String name;
	public boolean soldOut;
	public int price;

	public void increasePrice(int price) {
		this.price = this.price + price;
	}

	public boolean isCheap() {
		return price < 20;
	}

	public Product() {
		System.out.println("in constructor");
		price = 100;
		soldOut = false;
	}

	public Product(int price) {
		this.price = price;
	}
}
