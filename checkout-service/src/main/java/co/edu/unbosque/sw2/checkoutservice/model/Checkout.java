package co.edu.unbosque.sw2.checkoutservice.model;

import java.util.ArrayList;

public class Checkout {

    String id;
    String url;
    int value;
    ArrayList<String> payments;

    public Checkout() {
    }

    public Checkout(String id, String url, int value, ArrayList<String> payments) {
        this.id = id;
        this.url = url;
        this.value = value;
        this.payments = payments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<String> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<String> payments) {
        this.payments = payments;
    }
}
