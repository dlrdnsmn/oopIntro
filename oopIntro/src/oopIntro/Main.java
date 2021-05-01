//2.Ders
package oopIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1 = new Product(1,"LenovaV14",12000,"aaaaaa",10, 0); //örnek,referans,instance oluþturma deniyor
		
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
	
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar Kategorisi");
		
		Category category2 = new Category();
		category2.setId(2);;
		category2.setName("Elektronik Kategorisi");
		
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			
			System.out.println(category.name);
		}
		
	
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
	
	}

}
