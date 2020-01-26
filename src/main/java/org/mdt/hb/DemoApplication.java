package org.mdt.hb;

import java.util.Date;

import javax.transaction.Transactional;

import org.mdt.hb.model.library.Book;
import org.mdt.hb.model.library.BookPublisher;
import org.mdt.hb.model.library.Publisher;
import org.mdt.hb.model.products.Product;
import org.mdt.hb.model.products.ProductVendor;
import org.mdt.hb.model.products.Vendor;
import org.mdt.hb.repository.library.BookRepository;
import org.mdt.hb.repository.library.PublisherRepository;
import org.mdt.hb.repository.products.ProductRepository;
import org.mdt.hb.repository.products.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  @Autowired
  private BookRepository bookRepository;

  @Autowired
  private PublisherRepository publisherRepository;

  @Autowired
  private ProductRepository productRepository;

  @Autowired
  private VendorRepository vendorRepository;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  @Transactional
  public void run(String... args) throws Exception {
    libTest();
    prodTest();
  }

  public void prodTest() {

    Product prodA = new Product("Maggi Atta Noodles", "Nestle", "Foods", "An awesome product by maggi", 20.0,
        "imageUrl");

    Vendor vendor1 = new Vendor("name1", "desc1", "url1");
    Vendor vendor2 = new Vendor("name2", "desc2", "url2");

    ProductVendor prodVendX = new ProductVendor();
    prodVendX.setProduct(prodA);
    prodVendX.setVendor(vendor1);
    prodVendX.setVendorSpecificPrice(20.0);

    prodA.getProductVendors().add(prodVendX);

    ProductVendor prodVendY = new ProductVendor();
    prodVendY.setProduct(prodA);
    prodVendY.setVendor(vendor2);
    prodVendY.setVendorSpecificPrice(110.0);

    prodA.getProductVendors().add(prodVendY);

    vendorRepository.save(vendor1);
    vendorRepository.save(vendor2);
    productRepository.save(prodA);

  }

  public void libTest() {
    // create new
    Book bookA = new Book("Book A");
    Publisher publisherA = new Publisher("Publisher A");

    BookPublisher bookPublisher = new BookPublisher();
    bookPublisher.setBook(bookA);
    bookPublisher.setPublisher(publisherA);
    bookPublisher.setPublishedDate(new Date());

    bookA.getBookPublishers().add(bookPublisher);

    publisherRepository.save(publisherA);
    bookRepository.save(bookA);
  }
}
