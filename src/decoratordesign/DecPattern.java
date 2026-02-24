package decoratordesign;

interface Character{
    String getAbbilities();
}

class Mario implements Character{
    @Override
    public String getAbbilities(){
        return "Mario";
    }
}

abstract class Decorator implements Character{
    protected Character character;

    public Decorator(Character character){
        this.character = character;
    }
}

class HeightUp extends Decorator{
    public HeightUp(Character character){
        super(character);
    }

    @Override
    public String getAbbilities() {
        return character.getAbbilities()+"Height is Increased";
    }
}

class GunPower extends Decorator{
    public GunPower(Character character){
        super(character);
    }


    @Override
    public String getAbbilities() {
        return character.getAbbilities()+"Power is Increased";
    }
}

class StarPower extends Decorator{
    public StarPower(Character character){
        super(character);
    }

    @Override
    public String getAbbilities() {
        return character.getAbbilities()+"Power is Increased";
    }
}



public class DecPattern {

    public static void main(String[] args) {
        // Create a basic Mario character.
        Character mario = new Mario();
        System.out.println("Basic Character: " + mario.getAbbilities());

        // Decorate Mario with a HeightUp power-up.
        mario = new HeightUp(mario);
        System.out.println("After HeightUp: " + mario.getAbbilities());

        // Decorate Mario further with a GunPowerUp.
        mario = new GunPower(mario);
        System.out.println("After GunPowerUp: " + mario.getAbbilities());

        // Finally, add a StarPowerUp decoration.
        mario = new StarPower(mario);
        System.out.println("After StarPowerUp: " + mario.getAbbilities());
    }
}
