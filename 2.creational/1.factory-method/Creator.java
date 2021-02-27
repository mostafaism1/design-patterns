public abstract class Creator {

    public abstract Product CreateProduct();

    public void printProductName() {
        Product product = CreateProduct();
        product.printName();
    }

}
