package technifutur.java.order_dispatch.model.entity;

public class StockResponse {

    private String productId;
    private int quantity;


    public StockResponse(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}