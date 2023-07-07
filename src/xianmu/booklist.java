package xianmu;

import java.util.List;
import java.util.ArrayList;

public class booklist {
 private List<book> books= new ArrayList();



    public booklist(){
        books.add(new book("水浒传", "施耐庵", 25));
        books.add(new book("红楼梦", "曹雪芹", 30));
        books.add(new book("三国演义", "罗贯中", 28));
        books.add(new book("西游记", "吴承恩", 35));

    }
    public List getBooks() {
        return books;
    }

    public void setBooks(List books) {
        this.books = books;
    }

}
