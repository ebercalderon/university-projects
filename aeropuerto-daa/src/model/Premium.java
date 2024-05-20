package model;

public class Premium extends Ticket {

    private Meal[] meals;

    /**
     * El método constructor de un objeto Ticket Premium
     */
    public Premium(Flight flight, Seat fligthSeat, int premiumPrice) {
        super(flight, fligthSeat, premiumPrice);
        meals = new Meal[2];
    }

    public Meal[] getMeals() {
        return this.meals;
    }

    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }

}
