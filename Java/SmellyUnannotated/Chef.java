/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Chef {
    private Pizza pizza;
    private boolean busy;
    private int completedOrders;
    private int breaksTaken;
    private boolean kitchenClean;
    private boolean extraCheese;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Chef() {
        this.pizza = null;
        this.busy = false;
        this.completedOrders = 0;
        this.breaksTaken = 0;
        this.kitchenClean = true;
        this.extraCheese = false;
    }

    public void bakePizza(String pizzaType) {
        System.out.println("Chef is baking " + pizzaType + " pizza.");
        this.pizza = new Pizza("Unknown", "Unknown", pizzaType);
        cutPizzaAndPutInBox();
    }

    public void cutPizzaAndPutInBox() {
        System.out.println("Chef is cutting the " + pizza.getTopping() + " pizza and putting it in a box.");
        deliverPizza();
    }

    public void deliverPizza() {
        System.out.println("Chef is delivering the pizza to the cashier.");
    }

    public void hurryUp() {
        System.out.println("Chef is hurrying up.");
    }

    public void cleanKitchen() {
        System.out.println("Chef is cleaning the kitchen.");
        this.kitchenClean = true;
    }

    public boolean isBusy() {
        return this.busy;
    }

    public void updateContactInfo(String firstName, String lastName, String address, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void updateName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateAddress(String address) {
        this.address = address;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email) {
        this.email = email;
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

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");
    }

    public void anotherUnusedMethod() {
    }

    public void yetAnotherUnusedMethod() {
    }

    public void longMethod() {
        System.out.println("Chef is handling many tasks in a single method");
        this.bakePizza("Cheese");
        this.cutPizzaAndPutInBox();
        this.deliverPizza();
        this.hurryUp();
        this.cleanKitchen();
        this.updateContactInfo("John", "Doe", "123 Street", "555-5555", "john.doe@example.com");
        this.notifyForPromotion();
        this.notifyForDiscount();
        this.notifyForNewArrivals();
        this.applyDiscount();
        this.applyLoyaltyPoints();
        this.handleComplaint("cold pizza");
        this.askForReceipt();
        this.chainOfMethods();
        this.middlemanMethod();
        this.accessInternalDetails();
    }

    public void orderWithUnnecessaryDetails() {
        System.out.println("Placing a detailed order for pizza with extra cheese and discount code");
        this.bakePizza("Veggie");
        this.applyDiscount();
        this.applyLoyaltyPoints();
    }

    public void duplicateMethod() {
        System.out.println("Chef is making a duplicate order");
        this.bakePizza("Cheese");
        this.bakePizza("Cheese");
    }

    public void chainOfMethods() {
        System.out.println("Chef is initiating a message chain");
        this.cleanKitchen();
    }

    public void middlemanMethod() {
        System.out.println("Chef is calling a middleman method");
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
        System.out.println("Accessing internal details of Pizza: " + this.pizza.getTopping());
    }
    
}
