public class Book {
  String title;
  String category;
  String author;
  String publisher;
  int year;
  static final String[] CATEGORIES = {"Teknik", "Manajemen", "Fiksi", "Lainnya"};

  public Book(String title, String category, String author, String publisher, int year){
    this.title = title;
    this.category = category;
    this.author = author;
    this.publisher = publisher;
    this.year = year;
  }
}
