package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];
        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명 : ");
            String productName = scanner.nextLine();
            System.out.println("가격 : ");
            int productPrice = scanner.nextInt();
            System.out.println("수량 : ");
            int productQuantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName, productPrice, productQuantity);
        }

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
