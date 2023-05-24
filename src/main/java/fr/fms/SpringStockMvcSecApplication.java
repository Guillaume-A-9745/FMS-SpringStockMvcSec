package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringStockMvcSecApplication implements CommandLineRunner {

	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStockMvcSecApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		generateData();   //Alimenter la base de donnée
		articleRepository.findAll().forEach(a -> System.out.println(a));
	}
	
	
	
	//Alimenter la base de donnée
	public void generateData() {  
		Category smartphone = categoryRepository.save(new Category(null,"Smartphone"));
		Category pc = categoryRepository.save(new Category(null,"Ordinateur"));
		Category tablet = categoryRepository.save(new Category(null,"Tablette"));
		Category printer = categoryRepository.save(new Category(null,"Imprimante"));
		Category camera = categoryRepository.save(new Category(null,"Camera"));
		Category tv = categoryRepository.save(new Category(null,"TV"));
		Category telescope = categoryRepository.save(new Category(null,"Telescope"));
		Category gps = categoryRepository.save(new Category(null,"Gps"));
		Category enceinte = categoryRepository.save(new Category(null,"Enceinte"));
		
		articleRepository.save(new Article(null,"Samsung","S8",250));
		articleRepository.save(new Article(null,"Samsung","S9", 300));
		articleRepository.save(new Article(null,"Iphone","10",500));		
		articleRepository.save(new Article(null,"Xiaomi","MI11",100));
		articleRepository.save(new Article(null,"OnePlus","9 Pro",200));
		articleRepository.save(new Article(null,"Google","Pixel 5",350));
		articleRepository.save(new Article(null,"Poco","F3",150));
		
		articleRepository.save(new Article(null,"Dell","810",550));
		articleRepository.save(new Article(null,"Asus","F756",600));
		articleRepository.save(new Article(null,"Asus","E80",700));
		articleRepository.save(new Article(null,"MacBook","Pro",1000));
		articleRepository.save(new Article(null,"MacBook","Air",1200));
		
		articleRepository.save(new Article(null,"IPad","XL 5",300));
		articleRepository.save(new Article(null,"IPad","XL 7",500));
		
		
		articleRepository.save(new Article(null,"Canon","MG30",50));
		articleRepository.save(new Article(null,"Canon","MG50",60));
		articleRepository.save(new Article(null,"HP","800",50));
		articleRepository.save(new Article(null,"Epson","3T",100));
		
		articleRepository.save(new Article(null,"GoPro","7",150));
		articleRepository.save(new Article(null,"GoPro","10",200));
		
		articleRepository.save(new Article(null,"Panasonic","HT",1500));
		articleRepository.save(new Article(null,"Philips","L43",450));	
	}
}
