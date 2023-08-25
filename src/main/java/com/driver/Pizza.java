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

    private boolean isExtraCheseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAway = false;

    public Pizza(Boolean isVeg){
        if(isVeg){
            this.totalPrice += 300;
            bill = "Base Price Of The Pizza: "+vegPizza+"\n";
        }else{
            this.totalPrice += 400;
            bill = "Base Price Of The Pizza: "+400+"\n";
        }
        this.isVeg = isVeg;

    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        if(!isExtraCheseAdded){
            int pri = this.getPrice()+extraCheese;
            this.totalPrice = pri;
            this.isExtraCheseAdded = true;
             bill += "Extra Cheese Added: "+extraCheese+"\n";
        }
        // your code goes here

    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            if(this.isVeg){
                int pri = this.getPrice()+extraToppingsVeg;
                this.totalPrice = pri;
                bill+= "Extra Toppings Added: "+extraToppingsVeg+"\n";

            }else{
                int pri = this.getPrice()+extraToppingsNonVeg;
                this.totalPrice = pri;
                bill+= "Extra Toppings Added: "+extraToppingsNonVeg+"\n";
            }
            this.isExtraToppingsAdded = true;
        }

    }

    public void addTakeaway(){
        if(!isTakeAway){
            int pri = this.totalPrice +20;
            this.isTakeAway = true;
            totalPrice = pri;
            bill += "Paperbag Added: "+20+"\n";
        }

    }

    public String getBill(){

        bill += "Total Price: "+this.totalPrice+"\n";
        return this.bill;
    }
}
