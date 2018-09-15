package creationalPatterns.builder;

abstract class BurgerBuilder {
    protected Burger burger;

    public Burger getBurger() {
        return burger;
    }
    public void createNewBurgerProduct(){
        burger = new Burger();
    }

    public abstract void buildBurgerRoll();
    public abstract void buildSauce();
    public abstract void buildMeat();
    public abstract void buildExtraVegetables();


}
