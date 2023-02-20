package com.kodilla.good.patterns.challenges;

public class EmailInformationService implements InformationService{
    public void inform(User user, double totalCost){
        System.out.println("Hello, "+user.getName() + " " + user.getSurname()+
                "! \nThank you for making an order.\nYour total price to pay is: " + totalCost + "$");
    }
}
