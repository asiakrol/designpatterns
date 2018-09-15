package creationalPatterns.builder;

/*This is waht we want*/
public class Burger {

    private String burgerRoll = "";
    private String sauce = "";
    private String meat = "";
    private String extraVegetables = "";

    public void setBurgerRoll(String burgerRoll) {
        this.burgerRoll = burgerRoll;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setExtraVegetables(String extraVegetables) {
        this.extraVegetables = extraVegetables;
    }
}
