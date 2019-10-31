public class Dragon extends Mammal {
    public Dragon(){
        this.energyLevel = 300;
    }
    
    public Dragon fly(){
        System.out.println("Tyrion: I hope Viserion comes back soon. He's my favorite dragon.");
        this.energyLevel -= 50;
        return this;
    }
    
    public Dragon eatHumans(){
        System.out.println("Little Lisa was last seen at Dragonstone playing with The Queen's dragons. We haven't seen her in weeks!");
        this.energyLevel +=25;
        return this;
    }

    public Dragon attackTown(){
        System.out.println("Laketown Boy: Is that Smaug flying this way? Cool!");
        this.energyLevel -= 100;
        return this;
    }
}