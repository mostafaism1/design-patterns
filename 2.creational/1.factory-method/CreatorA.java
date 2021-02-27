public class CreatorA extends Creator {

    @Override
    public Product CreateProduct() {
        return new ProductA();
    }

}
