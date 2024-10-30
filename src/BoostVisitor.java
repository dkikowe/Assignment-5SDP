public class BoostVisitor implements Visitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Applying boost effect to character.");
        character.setState(new PoweredUpState());
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("No damage applied by BoostVisitor.");
    }
}