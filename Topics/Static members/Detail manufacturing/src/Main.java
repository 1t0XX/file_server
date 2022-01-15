class ManufacturingController {

    private static int countProduct = 0;

    public static String requestProduct(String product) {
        // write your code here
        countProduct++;
        return String.format("%d. Requested %s", countProduct, product);
    }

    public static int getNumberOfProducts() {
        // write your code here
        return countProduct;
    }
}