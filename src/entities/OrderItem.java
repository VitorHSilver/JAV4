package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Prod prod;

    public OrderItem() {
    }
    

    public OrderItem(Integer quantity, Double price, Prod prod) {
        this.quantity = quantity;
        this.price = price;
        this.prod = prod;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }


    public Prod getProd() {
        return prod;
    }


    public void setProd(Prod prod) {
        this.prod = prod;
    }


    public Double subtotal(Integer quantity, Double price) {
        return price * quantity;
    }

}
