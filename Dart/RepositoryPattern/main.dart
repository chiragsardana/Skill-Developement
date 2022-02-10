import 'models/product.dart';
import 'repository/product_repo.dart';

void main() {
  print("Hello To CRUD using Dart!");
  ProductRepository productRepo = new ProductRepository();
  // View Products
  List<Product> products = productRepo.viewProducts();
  print(products);
  // Delete Product
  Product deleteProduct = new Product("Apple Iphone 6", 12121.3, 2);
  print(deleteProduct);
  print("The Product is Deleted or not ");
  print(productRepo.deleteProduct(deleteProduct));
  // Product List After Deletion
  // products = productRepo.viewProducts();
  print(products);
  // Add Product
  Product addProduct = new Product("Apple Iphone 6+", 12121.3, 2);
  productRepo.addProduct(addProduct);
  print(addProduct);
  print(products);
  // Updated Products
  Product updatedProduct = new Product("Apple Iphone 8", 108.71, 9);
  productRepo.updateProduct(
      new Product("Apple Iphone 8", 14121.3, 4), updatedProduct);
  print(products);
  // all crud done
}
