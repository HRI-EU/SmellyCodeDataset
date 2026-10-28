/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Drink {
    private String drinkType;

    // Primitive Obsession
    private boolean isLargeSize;

    // Data Clumps
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerEmail;

    // Temporary Fields
    private String tempDiscountCode;
    private String tempOrderNote;

    public Drink() {
        this.drinkType = null;
        this.isLargeSize = false; // Primitive Obsession
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
        // Shotgun Surgery (changing multiple methods to update contact info)
        this.customerFirstName = firstName;
        this.customerLastName = lastName;
        this.customerAddress = address;
        this.customerPhoneNumber = phoneNumber;
        this.customerEmail = email;
    }

    public void updateCustomerName(String firstName, String lastName) {
        // Shotgun Surgery (separate method to update name)
        this.customerFirstName = firstName;
        this.customerLastName = lastName;
    }

    public void updateCustomerAddress(String address) {
        // Shotgun Surgery (separate method to update address)
        this.customerAddress = address;
    }

    public void updateCustomerPhoneNumber(String phoneNumber) {
        // Shotgun Surgery (separate method to update phone number)
        this.customerPhoneNumber = phoneNumber;
    }

    public void updateCustomerEmail(String email) {
        // Shotgun Surgery (separate method to update email)
        this.customerEmail = email;
    }

    public void notifyForPromotion() {
        // Divergent Change (method to notify for promotion)
        System.out.println("Notifying customer for promotion");
    }

    public void notifyForDiscount() {
        // Divergent Change (method to notify for discount)
        System.out.println("Notifying customer for discount");
    }

    public void notifyForNewArrivals() {
        // Divergent Change (method to notify for new arrivals)
        System.out.println("Notifying customer for new arrivals");
    }

    public void applyDiscount() {
        // Parallel Inheritance Hierarchies (method to apply discount)
        System.out.println("Applying discount for customer");
    }

    public void applyLoyaltyPoints() {
        // Parallel Inheritance Hierarchies (method to apply loyalty points)
        System.out.println("Applying loyalty points for customer");
    }

    public void handleComplaint(String complaint) {
        // Switch Statements (using if-else to simulate switch)
        if (complaint.equals("cold drink")) {
            System.out.println("Handling complaint: Drink is cold");
        } else if (complaint.equals("wrong drink")) {
            System.out.println("Handling complaint: Wrong drink delivered");
        } else {
            System.out.println("Handling complaint: General complaint");
        }
    }

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");  // Speculative Generality (unused method)
    }

    public void anotherUnusedMethod() {
        // Dead Code (method is never called)
    }

    public void yetAnotherUnusedMethod() {
        // More Dead Code
    }

    public void longMethod() {
        // Long Method (too many tasks in a single method)
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
        // Duplicate Code (repeating functionality)
        this.createOrder("Cola");
        this.createOrder("Cola");
    }

    public void chainOfMethods() {
        // Message Chain (calling methods on objects returned by another method)
        System.out.println("Drink is initiating a message chain");
        this.updateCustomerAddress("456 Avenue");
    }

    public void middlemanMethod() {
        // Middle Man (methods that delegate to other methods)
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
        // Inappropriate Intimacy (accessing internal details of another class)
        System.out.println("Accessing internal details: " + this.drinkType);
    }
}
