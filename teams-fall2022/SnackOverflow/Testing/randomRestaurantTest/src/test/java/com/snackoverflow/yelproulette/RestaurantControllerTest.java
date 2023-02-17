package com.snackoverflow.yelproulette;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RestaurantControllerTest {

    @Test
    public void testRandomRestaurant(){
        //Given
        RestaurantController restaurantController = new RestaurantController();

        //When
        String[] restaurantData = restaurantController.getRestaurants();
        String restaurant1 = restaurantController.randomRestaurant("Taco Bell");
        String restaurant2 = restaurantController.randomRestaurant();

        //Then
        assertEquals("Hardcode Test", "You landed on Taco Bell!", restaurant1);          //Hardcode Test
        assertEquals("Random Test (Restaurant should be different most times)", "You landed on Wendy's!", restaurant2);            //Random Test
    }
}
