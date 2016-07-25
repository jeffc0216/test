class BookException extends Exception{
	public BookException(String errMsg){
		super(errMsg);
	}
}
class Book{
	private double price;
	public void setPrice(double price) throws BookException{
		if(price < 0)
			throw new BookException("書籍定價不可為負數");
	}
	public static void divide(int x, int y){
		System.out.println(x/y);
	}
}

class ExceptRuntimeChecked{
	public static void main(String[] args){
		Book book = new Book();
		try{
			book.setPrice(-580.0);
			Book.divide(1, 0);
		}
		catch(BookException e){
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}