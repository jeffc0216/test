class Book{
	private double price;
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		assert price >= 0.0 : "書籍定價不可為負數";
		return price;
	}
}

class AssertEx{
	public static void main(String[] args){
		Book book = new Book();
		book.setPrice(-580.0);
		System.out.println(book.getPrice());
	}
}