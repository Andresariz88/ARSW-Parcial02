package edu.eci.arsw.myrestaurant;

import edu.eci.arsw.myrestaurant.services.OrderServicesException;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServices;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServicesStub;

import java.util.Set;

public class Main {
    public static void main(String[] args) throws OrderServicesException {
        RestaurantOrderServices restaurantOrderServices = new RestaurantOrderServicesStub();
        Set<Integer> tableWOrders = restaurantOrderServices.getTablesWithOrders();
        System.out.println(tableWOrders);
        for (Integer it : tableWOrders) {
            System.out.println("Mesa: " + it + " Total: " + restaurantOrderServices.calculateTableBill(it));
            System.out.println("Table order: " + restaurantOrderServices.getTableOrder(it));
        }
    }
}
