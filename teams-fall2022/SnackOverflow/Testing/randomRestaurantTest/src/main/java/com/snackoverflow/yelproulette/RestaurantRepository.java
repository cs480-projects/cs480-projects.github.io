package com.snackoverflow.yelproulette;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findByName(String name);
    List<Restaurant> findByPrice(float price);
}