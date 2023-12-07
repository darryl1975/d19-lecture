package sg.edu.nus.sg.d19lecture.model;

import org.springframework.stereotype.Component;

@Component("backpack")
public class Backpack extends Bag {

    @Override
    public void showBagType() {
        System.out.println("You are carrying a backpack.");
    }
    
}
