public class Character {
    private State currentState;
    private Strategy currentStrategy;

    public Character(State initialState, Strategy initialStrategy) {
        this.currentState = initialState;
        this.currentStrategy = initialStrategy;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void setStrategy(Strategy strategy) {
        this.currentStrategy = strategy;
    }

    public void performAttack() {
        currentState.attack();
    }

    public void executeStrategy() {
        currentStrategy.fight();
    }
}
