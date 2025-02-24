/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Customer {
    private Shop pizzaShop;

    // Primitive Obsession
    private boolean frequentCustomerDiscount;

    // Data Clumps
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;

    // Temporary Fields
    private String tempDiscountCode;
    private String tempOrderNote;

    public Customer(Shop pizzaShop) {
        this.pizzaShop = pizzaShop; // Dependency Injection (Control Coupling)
        this.frequentCustomerDiscount = false; // Primitive Obsession
    }

    public void orderPizza(String pizzaType) {
        System.out.println("Customer is placing an order for " + pizzaType + " pizza.");
        this.pizzaShop.receiveOrder(pizzaType); // Feature Envy (refers to another class to do its work)
    }

    public void complain(String complaint) {
        System.out.println("Customer is complaining: " + complaint);
        this.pizzaShop.getCashier().calmCustomerDown(); // Inappropriate Intimacy (accessing another object's internal details)
    }

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");  // Speculative Generality (unused method)
    }

    public void anotherUnusedMethod() {
        // Dead Code (method is never called)
    }

    public void longComplaintMethod() {
        // Long Method (too many complaints handled in one method)
        System.out.println("Customer is complaining about many things");
        this.complain("Pizza is cold");
        this.complain("Pizza is late");
        this.complain("Wrong pizza delivered");
        this.complain("Pizza is burnt");
        this.complain("Too little cheese");
        this.complain("Pizza is undercooked");
        this.askForReceipt();
    }

    public void orderWithUnnecessaryDetails(String pizzaType, String size, String crustType, String toppings, boolean extraCheese, String discountCode) {
        // Long Parameter List (too many parameters in the method)
        System.out.println("Placing a detailed order for " + pizzaType + " pizza with " + size + ", " + crustType + ", " + toppings + ", extra cheese: " + extraCheese + ", discount code: " + discountCode);
        this.orderPizza(pizzaType);
    }

    public void duplicateComplaint() {
        // Duplicate Code (repeating complaint functionality)
        System.out.println("Customer is complaining about duplicate issues");
        this.complain("Pizza is cold");
        this.complain("Pizza is cold");
        this.complain("Pizza is late");
        this.complain("Pizza is late");
    }

    public void chainOfMethods() {
        // Message Chain (calling methods on objects returned by another method)
        System.out.println("Customer is initiating a message chain");
        this.pizzaShop.getCashier().getChef().cleanKitchen();
    }

    public void middlemanMethod() {
        // Middle Man (methods that delegate to other methods)
        System.out.println("Customer is calling a middleman method");
        this.middleMethod();
    }

    public void middleMethod() {
        System.out.println("Middleman method delegating to another method");
        this.realMethod();
    }

    public void realMethod() {
        System.out.println("Real method doing the actual work");
    }

    public void updateContactInfo(String firstName, String lastName, String address, String phoneNumber, String email) {
        // Shotgun Surgery (changing multiple methods to update contact info)
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void updateName(String firstName, String lastName) {
        // Shotgun Surgery (separate method to update name)
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateAddress(String address) {
        // Shotgun Surgery (separate method to update address)
        this.address = address;
    }

    public void updatePhoneNumber(String phoneNumber) {
        // Shotgun Surgery (separate method to update phone number)
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email) {
        // Shotgun Surgery (separate method to update email)
        this.email = email;
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
        if (complaint.equals("cold pizza")) {
            System.out.println("Handling complaint: Pizza is cold");
        } else if (complaint.equals("late delivery")) {
            System.out.println("Handling complaint: Pizza is late");
        } else if (complaint.equals("wrong order")) {
            System.out.println("Handling complaint: Wrong pizza delivered");
        } else {
            System.out.println("Handling complaint: General complaint");
        }
    }

    public void refusedBequest() {
        // Refused Bequest (method that should be inherited but is empty)
    }

    public void accessInternalDetails() {
        // Inappropriate Intimacy (accessing internal details of another class)
        System.out.println("Accessing internal details of PizzaShop: " + pizzaShop.getCashier().getChef().isBusy());
    }
}
