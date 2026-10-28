/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Pizza {
    private String size;
    private String doughType;
    private String topping;

    // Primitive Obsession
    private boolean extraCheese;

    // Data Clumps
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerEmail;

    // Temporary Fields
    private String tempDiscountCode;
    private String tempOrderNote;

    public Pizza(String size, String doughType, String topping) {
        this.size = size;
        this.doughType = doughType;
        this.topping = topping;
        this.extraCheese = false; // Primitive Obsession
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public String getDoughType() {
        return doughType;
    }

    public String getTopping() {
        return topping;
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
        System.out.println("Pizza is handling many tasks in a single method");
        this.setSize("Large");
        this.setDoughType("Thin Crust");
        this.setTopping("Pepperoni");
        this.updateCustomerInfo("John", "Doe", "123 Street", "555-5555", "john.doe@example.com");
        this.notifyForPromotion();
        this.notifyForDiscount();
        this.notifyForNewArrivals();
        this.applyDiscount();
        this.applyLoyaltyPoints();
        this.handleComplaint("cold pizza");
    }

    public void orderWithUnnecessaryDetails(String pizzaType, String size, String crustType, String toppings, boolean extraCheese, String discountCode) {
        // Long Parameter List (too many parameters in the method)
        System.out.println("Placing a detailed order for " + pizzaType + " pizza with " + size + ", " + crustType + ", " + toppings + ", extra cheese: " + extraCheese + ", discount code: " + discountCode);
        this.setSize(size);
        this.setDoughType(crustType);
        this.setTopping(toppings);
        this.applyDiscount();
    }

    public void duplicateMethod() {
        // Duplicate Code (repeating functionality)
        System.out.println("Customer is making a duplicate order");
        this.setTopping("Cheese");
        this.setTopping("Cheese");
    }

    public void chainOfMethods() {
        // Message Chain (calling methods on objects returned by another method)
        System.out.println("Pizza is initiating a message chain");
        this.updateCustomerAddress("123 Street");
    }

    public void middlemanMethod() {
        // Middle Man (methods that delegate to other methods)
        System.out.println("Pizza is calling a middleman method");
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
        System.out.println("Accessing internal details: " + this.size + ", " + this.doughType + ", " + this.topping);
    }

}

class CheesePizza extends Pizza {
    public CheesePizza() {
        super("Medium", "Regular", "Cheese");
    }

    @Override
    public void handleComplaint(String complaint) {
        // Switch Statements (using if-else to simulate switch)
        if (complaint.equals("too much cheese")) {
            System.out.println("Handling complaint: Too much cheese");
        } else {
            super.handleComplaint(complaint);
        }
    }
}

class VeggiePizza extends Pizza {
    public VeggiePizza() {
        super("Medium", "Whole Wheat", "Veggies");
    }
}

class TunaPizza extends Pizza {
    public TunaPizza() {
        super("Large", "Thin Crust", "Tuna");
    }
}

class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super("Large", "Regular", "Pepperoni");
    }
}
