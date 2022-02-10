// Here we Implement all the Methods Here
import '../interfaces/i_product.dart';
import '../models/product.dart';
import '../Data/product.dart';
import '../utilities/extension_on_list.dart';

class ProductRepository implements IProduct {
  List<Product> _products = ProductData.products;
  @override
  bool addProduct(Product product) {
    _products.add(product);
    return _products.contains(product);
  }

  @override
  bool deleteProduct(Product product) {
    return _products.deleteItem(product);
  }

  @override
  bool updateProduct(Product toBeUpdated, Product updatedProduct) {
    deleteProduct(toBeUpdated);
    addProduct(updatedProduct);
    return _products.contains(updatedProduct);
  }

  @override
  List<Product> viewProducts() {
    return _products;
  }
}
