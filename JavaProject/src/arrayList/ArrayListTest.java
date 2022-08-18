package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥1", "조정래1"));
		library.add(new Book("태백산맥2", "조정래2"));
		library.add(new Book("태백산맥3", "조정래3"));
		
		for(Book b : library) {
			System.out.println("제목: " + b.getTitle());
			System.out.println("저자: " + b.getAuthor());
		}
		
	}

}
