class Product {
String name; int unitPrice;
int gstPercentage;
int quantity;
public Product(String name, int unitPrice, int gstPercentage, int quantity) {
this.name = name;
this.unitPrice = unitPrice;
this.gstPercentage = gstPercentage;
this.quantity = quantity;
}
}
public class Shopping Cart {
public static void main(String[] args) {
Product leatherWallet = new Product("Leather wallet", 1100, 18, 1); Product cigarette = new Product("Cigarette", 200, 28, 3);
Product umbrella = new Product("Umbrella", 900, 12, 4);
Product honey = new Product("Honey", 100, 0, 2);
Product maxGstProduct = findMaxGstProduct(leatherWallet, umbrella, cigarette, honey); System.out.println("The product with maximum GST amount is " + maxGstProduct.name);
int totalAmount = calculateTotalAmount (leatherWallet, umbrella, cigarette, honey); System.out.println("The total amount to be paid to the shopkeeper is Rs. + totalAmount);
}
private static Product find MaxGstProduct (Product... products) { Product maxGstProduct = null; double maxGstAmount = 0;
for (Product product products) {
double gstAmount = (product.unitPrice * product.gstPercentage) / 100.0; if (gstAmount > maxGstAmount) {
maxGstAmount gstAmount;
maxGstProduct product;
}
}
return maxGstProduct;
}
private static int calculate TotalAmount (Product... products) { int totalAmount = 0;
for (Product product products) {
double gstAmount = (product.unitPrice * product.gstPercentage) / 100.0; double discountedPrice = product.unitPrice (product.unitPrice >= 500 ? 0.05 product.unitPrice: 0);
totalAmount += (discountedPrice + gstAmount) * product.quantity;
}
}
