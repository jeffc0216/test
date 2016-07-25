class BookException extends Exception{
	public BookException(String errMsg){
		super(errMsg);
	}
}
//假設Book類別由Ron撰寫
class Book{
	private double price;
	public void setPrice(double price) throws BookException{
		if(price < 0)
			throw new BookException("書籍定價不可為負數");
	}
}

//假設Propagate類別由Ken撰寫
class Propagate{
	public static void main(String[] args){
		Book book = new Book();
		try{book.setPrice(-580.0);}
		catch(BookException e){
			System.out.print("BookException");
		}
	}
}