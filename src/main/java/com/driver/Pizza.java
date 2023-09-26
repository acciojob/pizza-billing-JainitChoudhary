package com.driver;

public class Pizza {
    private int billPrice;
    private boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private boolean isCheeseAdded;
    private boolean isPaperBagAdded;
    private boolean isToppingAdded;
    private boolean isBillGenerated;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;

        if (isVeg) {
            this.billPrice = 300;
            this.toppingPrice = 70;
        } else {
            this.billPrice = 400;
            this.toppingPrice = 120;
        }

        this.cheesePrice = 80;
        this.paperBagPrice = 20;
        this.bill = "Base Price Of The Pizza: " + this.billPrice + "\n";
    }

    public int getBillPrice() {
        return this.billPrice;
    }

    public void addExtraCheese() {
        if (!this.isCheeseAdded) {
            this.billPrice += this.cheesePrice;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!this.isToppingAdded) {
            this.billPrice += this.toppingPrice;
            this.isToppingAdded = true;
        }
    }

    public void addTakeaway() {
        if (!this.isPaperBagAdded) {
            this.billPrice += this.paperBagPrice;
            this.isPaperBagAdded = true;
        }
    }

    public String getBill() {
        if (!this.isBillGenerated) {
            if (this.isCheeseAdded) {
                this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
            }

            if (this.isToppingAdded) {
                this.bill = this.bill + "Extra Toppings Added: " + this.toppingPrice + "\n";
            }

            if (this.isPaperBagAdded) {
                this.bill = this.bill + "Paperbag Added: " + this.paperBagPrice + "\n";
            }

            this.bill = this.bill + "Total Price: " + this.billPrice + "\n";
            this.isBillGenerated = true;
        }

        return this.bill;
    }
}