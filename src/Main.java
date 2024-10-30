public class Main {
    public static void main(String[] args) {
        Character character = new Character(new NormalState(), new MeleeStrategy());

        character.performAttack();
        character.executeStrategy();

        character.setStrategy(new RangedStrategy());
        character.executeStrategy();

        GameAction attackAction = new AttackAction();
        attackAction.executeAction();

        GameAction defendAction = new DefendAction();
        defendAction.executeAction();

        GameAction healAction = new HealAction();
        healAction.executeAction();

        Visitor boostVisitor = new BoostVisitor();
        Visitor damageVisitor = new DamageVisitor();

        boostVisitor.applyBoost(character);
        character.performAttack();

        damageVisitor.applyDamage(character);
        character.performAttack();
    }
}
