/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Drink {
    private String drinkType;
    private boolean isLargeSize;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerEmail;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Drink() {
        this.drinkType = null;
        this.isLargeSize = false;
    }

    public void createOrder(String drinkType) {
        this.drinkType = drinkType;
        System.out.println("Creating order for " + drinkType + " drink.");
    }

    public void addToOrder() {
        System.out.println("Adding " + this.drinkType + " to the order.");
    }

    public void confirmOrder() {
        System.out.println("Order for " + this.drinkType + " confirmed.");
    }

    public void updateCustomerInfo(String firstName, String lastName, String address, String phoneNumber, String email) {
        this.customerFirstName = firstName;
        this.customerLastName = lastName;
        this.customerAddress = address;
        this.customerPhoneNumber = phoneNumber;
        this.customerEmail = email;
    }

    public void updateCustomerName(String firstName, String lastName) {
        this.customerFirstName = firstName;
        this.customerLastName = lastName;
    }

    public void updateCustomerAddress(String address) {
        this.customerAddress = address;
    }

    public void updateCustomerPhoneNumber(String phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }

    public void updateCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public void notifyForPromotion() {
        System.out.println("Notifying customer for promotion");
    }

    public void notifyForDiscount() {
        System.out.println("Notifying customer for discount");
    }

    public void notifyForNewArrivals() {
        System.out.println("Notifying customer for new arrivals");
    }

    public void applyDiscount() {
        System.out.println("Applying discount for customer");
    }

    public void applyLoyaltyPoints() {
        System.out.println("Applying loyalty points for customer");
    }

    public void handleComplaint(String complaint) {
        if (complaint.equals("cold drink")) {
            System.out.println("Handling complaint: Drink is cold");
        } else if (complaint.equals("wrong drink")) {
            System.out.println("Handling complaint: Wrong drink delivered");
        } else {
            System.out.println("Handling complaint: General complaint");
        }
    }

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");
    }

    public void anotherUnusedMethod() {
    }

    public void yetAnotherUnusedMethod() {
    }

    public void longMethod() {
        System.out.println("Drink is handling many tasks in a single method");
        this.createOrder("Cola");
        this.addToOrder();
        this.confirmOrder();
        this.updateCustomerInfo("Jane", "Doe", "456 Avenue", "555-6666", "jane.doe@example.com");
        this.notifyForPromotion();
        this.notifyForDiscount();
        this.notifyForNewArrivals();
        this.applyDiscount();
        this.applyLoyaltyPoints();
        this.handleComplaint("cold drink");
    }

    public void duplicateMethod() {
        this.createOrder("Cola");
        this.createOrder("Cola");
    }

    public void chainOfMethods() {
        System.out.println("Drink is initiating a message chain");
        this.updateCustomerAddress("456 Avenue");
    }

    public void middlemanMethod() {
        System.out.println("Drink is calling a middleman method");
        this.middleMethod();
    }

    public void middleMethod() {
        System.out.println("Middleman method delegating to another method");
        this.realMethod();
    }

    public void realMethod() {
        System.out.println("Real method doing the actual work");
    }

    public void accessInternalDetails() {
        System.out.println("Accessing internal details: " + this.drinkType);
    }
}
