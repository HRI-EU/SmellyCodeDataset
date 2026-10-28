/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Shop {
    private Chef chef;
    private Cashier cashier;
    private Pizza pizza;
    private boolean frequentCustomerDiscount;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Shop() {
        this.chef = new Chef();
        this.cashier = new Cashier(chef);
        this.frequentCustomerDiscount = false;
    }

    public void receiveOrder(String pizzaType) {
        System.out.println("Shop received order for " + pizzaType + " pizza.");
        this.pizza = createPizza(pizzaType);
        cashier.takeOrder(pizzaType);
    }

    public void orderPizza(String pizzaType) {
        System.out.println("Customer is placing an order for " + pizzaType + " pizza.");
        this.receiveOrder(pizzaType);
    }

    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("Cheese")) {
            return new CheesePizza();
        } else if (pizzaType.equals("Veggie")) {
            return new VeggiePizza();
        } else if (pizzaType.equals("Tuna")) {
            return new TunaPizza();
        } else if (pizzaType.equals("Pepperoni")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type");
        }
    }

    public Cashier getCashier() {
        return this.cashier;
    }

    public Chef getChef() {
        return this.chef;
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
            cashier.calmCustomerDown();
        } else if (complaint.equals("late delivery")) {
            cashier.calmCustomerDown();
        } else if (complaint.equals("wrong order")) {
            cashier.calmCustomerDown();
        } else {
            cashier.calmCustomerDown();
        }
    }

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");
    }

    public void anotherUnusedMethod() {
    }
}
