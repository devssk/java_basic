package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("두부", 2000, 2);
        ProductOrder productOrder2 = createOrder("김치", 5000, 1);
        ProductOrder productOrder3 = createOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        printProductOrders(productOrders);

        int totalPrice = getTotalPrice(productOrders);
        System.out.println("총 결제 금액 : " + totalPrice);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printProductOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품 이름 : " + productOrder.productName + ", 가격 : " + productOrder.price + ", 수량 : " + productOrder.quantity);
        }
    }

    static int getTotalPrice(ProductOrder[] productOrders) {
        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            totalPrice += productOrder.price * productOrder.quantity;
        }
        return totalPrice;
    }
}
