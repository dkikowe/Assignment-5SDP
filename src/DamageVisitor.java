public class DamageVisitor implements Visitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("No boost applied by DamageVisitor.");
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("Applying damage effect to character.");
        character.setState(new DefeatedState());
    }
}