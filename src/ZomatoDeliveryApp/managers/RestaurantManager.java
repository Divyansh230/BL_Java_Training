package ZomatoDeliveryApp.managers;

import ZomatoDeliveryApp.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> resturants=new ArrayList<>();
    private static RestaurantManager instance=null;

    private RestaurantManager() {
        //private Constructor
    }

    public static RestaurantManager getInstance() {
        if(instance==null) {
            instance=new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant restaurant) {
        this.resturants.add(restaurant);
    }

    public List<Restaurant> searchByLocation(String location) {
        List<Restaurant> restaurants=new ArrayList<>();
        for(Restaurant r:this.resturants) {
            if(r.getLocation().equals(location)) {
                restaurants.add(r);
            }
        }
        return restaurants;
    }


}
