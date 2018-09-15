package creationalPatterns.builder;

class ClassicBurgerBuilder extends BurgerBuilder {
    public void buildBurgerRoll(){
        burger.setBurgerRoll("wheat");
        burger.setSauce("spicy");
        burger.setMeat("beef");
        burger.setExtraVegetables("lettuce");
    }


}
