package com.example.productservice;

import com.example.productservice.Models.Category;
import com.example.productservice.Models.Price;
import com.example.productservice.Models.Product;
import com.example.productservice.inheritancerelations.tableperclass.Mentor;
import com.example.productservice.inheritancerelations.tableperclass.MentorRepository;
import com.example.productservice.repository.PriceRepository;
import com.example.productservice.repository.categoryRepository;
import com.example.productservice.repository.productRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

    private final com.example.productservice.repository.categoryRepository categoryRepository;
    private final com.example.productservice.repository.productRepository productRepository;
    private final PriceRepository priceRepository;

    public ProductServiceApplication(categoryRepository categoryRepository,
                                     productRepository productRepository,
                                     PriceRepository priceRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.priceRepository = priceRepository;
    }
    //private MentorRepository mentorRepository;

    //ProductServiceApplication(@Qualifier("tpc_mentorRepository") MentorRepository mentorRepository){
    //this.mentorRepository=mentorRepository;
    //}
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Mentor mentor = new Mentor();
//        mentor.setName("Priya");
//        mentor.setEmail("priyas5693@hgamil.com");
//        mentor.setAvgRating(9.5);
//
//        mentorRepository.save(mentor);
//        Category category = new Category();
//        category.setName("Apple Devices");
//        Category savedcategory=categoryRepository.save(category);

//*******************************************************************************************************************
        // **** This is optional category ****
//        Optional<Category> optionalCategory=categoryRepository.findById(UUID.fromString("abdb0f33-ef2d-4776-ad7d-39cd021746bb"));
//         // Get optional category to Category
//        if(optionalCategory.isEmpty()){
//           throw new Exception("Category not found");
//        }
//        Category category= optionalCategory.get();
//        //get all the products with category= Apple Devices
//        List<Product> product= category.getProducts();
//        for(Product products:product){
//            System.out.println(products.getTitle());
//        }
//*******************************************************************************************************************
//        Product product=new Product();
//        product.setTitle("Iphone 15 max pro");
//        product.setDescription("Latest Iphone model ");
//        product.setCategory(category.get());
//        Product savedproduct= productRepository.save(product);

//*********************************************************************************************************************
//        Price price = new Price();
//        price.setCurrency("INR");
//        price.setValue(50000);
//        Price savedprice = priceRepository.save(price);
//
//        Category category = new Category();
//        category.setName("Apple Devices");
//        Category savedcategory = categoryRepository.save(category);
//
//        Product product = new Product();
//        product.setTitle("Iphone 15 pro max");
//        product.setDescription("Latest Iphone 2023");
//        product.setCategory(savedcategory);
//        product.setPrice(savedprice);
//        Product savedproduct = productRepository.save(product);
         productRepository.deleteById(UUID.fromString("688a20ff-76ee-4db8-92ee-397646763de8"));
    }
}
