// Class Here we deince the variables
class Product {
  String _name;
  double _price;
  int _quantity;
  Product(this._name, this._price, this._quantity);

  String get name => this._name;

  set name(String value) => this._name = value;

  get price => this._price;

  set price(value) => this._price = value;

  get quantity => this._quantity;

  set quantity(value) => this._quantity = value;

  @override
  String toString() {
    // TODO: implement toString
    return "Name: $_name, Price: $_price, Quantity: $_quantity";
  }
}
