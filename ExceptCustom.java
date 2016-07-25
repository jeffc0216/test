class BookException extends Exception{
	public BookException(String errMsg){
		super(errMsg);
	}
}
class Book{
	private double price;
	public void setPrice(double price){
		try{
			if(price < 0){
				throw new BookException("書籍定價不可為負數");
			}
		}
		catch(BookException e){
			e.printStackTrace();
		}
	}
}

class ExceptCustom{
	public static void main(String[] args){
		Book book = new Book();
		book.setPrice(-580.0);
	}
}