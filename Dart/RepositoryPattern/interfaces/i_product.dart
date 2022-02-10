// Interface here we define the methods name

import '../models/product.dart';

abstract class IProduct {
  bool addProduct(Product product);
  bool deleteProduct(Product product);
  List<Product> viewProducts();
  bool updateProduct(Product toBeUpdated, Product updatedProduct);
}
