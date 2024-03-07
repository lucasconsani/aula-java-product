public class Product {

    public String name;
    public double price;
    public int qnty;

    public double totalValueInStock() {
        return price * qnty;
    }
    public void addProducts(int qnt){
        this.qnty += qnt;
    }
    public void removeProducts(int qnt){

        this.qnty -= qnt;
    }

    public void ShowResult(){
        System.out.println();
        System.out.printf("Product Name: %s%n", name);
        System.out.printf("Product price: %.2f%n", price);
        System.out.printf("Quantity in stock: %d%n", qnty);

    }


}
