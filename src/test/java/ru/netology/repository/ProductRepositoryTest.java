package ru.netology.repository;


import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
  private ProductRepository repository = new ProductRepository();
  private Book firstBook = new Book(1, "The Old Man and the Sea", 750, "Ernest Hemingway");
  private Book secondBook = new Book(2, "The Sun also Rises", 400, "Ernest Hemingway");

  @Test
  public void shouldRemoveByID() {
    repository.save(firstBook);
    repository.save(secondBook);
    Product[] expected = new Product[]{secondBook};
    repository.removeById(1);
    Product[] actual = repository.findAll();
    assertArrayEquals(expected, actual);
  }
}
