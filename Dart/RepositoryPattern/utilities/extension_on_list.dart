extension ListElementRemover<E> on List<E> {
  bool deleteItem(E obj) {
    int indexToBeRemoved = -1;
    for (int i = 0; i < this.length; i++) {
      if (this[i].toString() == obj.toString()) {
        indexToBeRemoved = i;
        break;
      }
    }
    if (indexToBeRemoved == -1) {
      return false;
    }
    this.removeAt(indexToBeRemoved);
    return true;
  }
}
