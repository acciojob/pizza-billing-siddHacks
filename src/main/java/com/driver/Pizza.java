package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private  int totalPrice = 0;

    private int vegPizza = 300;

    private final int extraCheese = 80;
    private final int extraToppingsVeg = 70;
    private final int extraToppingsNonVeg = 120;

    private boolean isExtraCheseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAway;
    private boolean isbillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            this.totalPrice += price;
        }else{
            this.price = 400;
            this.totalPrice += price;
        }
        isExtraCheseAdded = false;
        isExtraToppingsAdded = false;
        isTakeAway = false;
        isbillGenerated = false;
        bill = "";

    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        if(!isExtraCheseAdded){
            int pri = this.getPrice()+extraCheese;
            this.totalPrice = pri;
            this.isExtraCheseAdded = true;
        }
        // your code goes here

    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            if(this.isVeg){
                int pri = this.getPrice()+extraToppingsVeg;
                this.totalPrice = pri;
            }else{
                int pri = this.getPrice()+extraToppingsNonVeg;
                this.totalPrice = pri;
            }
            this.isExtraToppingsAdded = true;
        }

    }

    public void addTakeaway(){
        if(!isTakeAway){
            int pri = this.totalPrice +20;
            this.isTakeAway = true;
            totalPrice = pri;
        }

    }

    public String getBill(){
        if(!isbillGenerated) {
            bill += "Base Price Of The Pizza: " + price + "\n";
            if (isExtraCheseAdded) {
                bill += "Extra Cheese Added: " + extraCheese + "\n";
            }
            if (isExtraToppingsAdded && isVeg) {
                bill += "Extra Toppings Added: " + extraToppingsVeg + "\n";
            } else if (isExtraToppingsAdded && !isVeg) {
                bill += "Extra Toppings Added: " + extraToppingsNonVeg + "\n";
            }
            if (isTakeAway) {
                bill += "Paperbag Added: " + 20 + "\n";
            }
            bill += "Total Price: " + totalPrice + "\n";
        }
        return this.bill;
    }
}
