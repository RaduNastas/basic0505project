package javaPro.lesson14.order;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private String id;
    private LocalDate date;
    private double amount;
    private String status;

    public Order(String id, LocalDate date, double amount, String status) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("Order{id='%s', date=%s, amount=%.2f, status='%s'}", id, date, amount, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Double.compare(order.amount, amount) == 0 &&
                Objects.equals(id, order.id) &&
                Objects.equals(date, order.date) &&
                Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, amount, status);
    }

}