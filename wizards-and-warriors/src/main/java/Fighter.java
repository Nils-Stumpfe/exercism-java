class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    public boolean isVulnerable() {
        return false;
    }

    public int getDamagePoints(Fighter fighter) {
        return (fighter.isVulnerable()) ? 10 : 6;
    }

    @Override
    public String toString() {
        return"Fighter is a Warrior";   
    }
}

class Wizard extends Fighter {

    private boolean spellPrepeared = false;

    public boolean isVulnerable() {
        return !spellPrepeared;
    }

    public int getDamagePoints(Fighter fighter) {
        return (spellPrepeared) ? 12 : 3;
    }

    public void prepareSpell() {
        spellPrepeared = true;
    }

    @Override
    public String toString() {
        return"Fighter is a Wizard";   
    }
}