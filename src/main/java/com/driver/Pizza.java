package com.driver;

public class Pizza {

    private int billPrice;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private  int toppingsPrice;

    private int paperBagPrice;

    private boolean isCheeseAdded;

    private boolean isToppingsAdded;
    private  boolean isPaperBagAdded;


    private boolean isBillGenerated;





    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.billPrice =300;
            this.toppingsPrice =70;

        }
        else{
            this.billPrice =400;
            this.toppingsPrice =120;
        }

        this.cheesePrice=80;
        this.paperBagPrice=20;
        this.bill="Base Price Of The Pizza: "+this.billPrice+"\n";

    }

    public int getBillPrice(){
        return this.billPrice;
    }

    public void addExtraCheese(){
        // your code goes here


        if(isCheeseAdded==false){
            billPrice = billPrice +cheesePrice;
            isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here

        if(isToppingsAdded ==false){
            billPrice = billPrice + toppingsPrice;
            isToppingsAdded =true;
        }
    }

    public void addTakeaway(){
        if(isPaperBagAdded==false){
            billPrice=billPrice+paperBagPrice;
            isPaperBagAdded=true;
        }
        // your code goes here

    }

    public String getBill(){

//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470
        if(isBillGenerated==false){
            if(isCheeseAdded){
                bill=bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingsAdded){
                bill=bill+"Extra Toppings Added: "+this.toppingsPrice +"\n";
            }
            if(isPaperBagAdded){
                bill=bill+"Paperbag Added: "+this.paperBagPrice+"\n";
            }
            bill=bill+"Total Price: "+billPrice+"\n";
            isBillGenerated=true;


        }
        // your code goes here
        return this.bill;
    }
}
