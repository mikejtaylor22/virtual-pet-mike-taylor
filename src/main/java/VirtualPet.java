import java.util.Scanner;

public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int wasteLevel;
    private int boredomLevel;
    private int sicknessLevel;
    private int tickTime;
    private int age;

    public VirtualPet(String name, int hungerLevel, int thirstLevel, int wasteLevel, int boredomLevel, int sicknessLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.wasteLevel = wasteLevel;
        this.boredomLevel = boredomLevel;
        this.sicknessLevel = sicknessLevel;
        this.tickTime = 1;
        this.age = 40;
    }

    public boolean tick(){
        tickTime++;
        hungerLevel--;
        thirstLevel--;
        wasteLevel--;
        boredomLevel--;
        sicknessLevel--;

        if(tickTime > age){
            System.out.println("Your pet went to heaven, died of old age");
            return false;
        }
        if(hungerLevel <= 0){
            System.out.println(this.name + " has died of hunger");
            return false;
        }
        if(thirstLevel <=0){
            System.out.println(this.name + " has died of thirst");
            return false;
        }
        if(wasteLevel <=0){
            System.out.println(this.name + " your pet died of constipation");
            return false;
        }
        if(boredomLevel <= 0){
            System.out.println(this.name + " your pet died of boredom");
            return false;
        }
        if(sicknessLevel <= 0){
            System.out.println(this.name + " your pet died of sickness");
            return false;
        }
        return true;
    }

    public void water() {
        thirstLevel+=3;
        System.out.println("You have watered " + this.name);
    }
    public void feed(String food){
        if(food.toLowerCase().equals("apples")){
            System.out.println(food +" are " + name + "'s favorite food! They are much less hungry");
            hungerLevel+=12;
        } else {
            hungerLevel += 3;
            thirstLevel--;
            System.out.println("You have fed " + this.name + " " +food);
        }
    }

    public void bathroom() {
        wasteLevel +=3;
        System.out.println("You have taken " + this.name + " to the bathroom");
    }

    public void play() {
        boredomLevel+=3;
        sicknessLevel--;
        System.out.println("You have played with " + this.name);
    }

    public void medicine() {
        sicknessLevel+=3;
        System.out.println("You have given " + this.name + " medicine");
    }

    public int displayLevels(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(name);
        System.out.println("Age: " + tickTime);
        System.out.println("Hunger: " + hungerLevel);
        System.out.println("Thirst: " + thirstLevel);
        System.out.println("Waste: " + wasteLevel);
        System.out.println("Boredom: " + boredomLevel);
        System.out.println("Sickness: " + sicknessLevel);
        System.out.println();
        System.out.println("1. Feed " + name);
        System.out.println("2. Water " + name);
        System.out.println("3. Take  " + name + " to the bathroom");
        System.out.println("4.  Play With " + name);
        System.out.println("5. Give " + name + " medicine");
        System.out.println("6. Exit Game");
        System.out.println("Select an option: ");
        int choice = scanner.nextInt();
        return choice;
    }
    public String getFood(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a food name: ");
        String food = scanner.nextLine();
        return food;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getWasteLevel() {
        return wasteLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getSicknessLevel() {
        return sicknessLevel;
    }
    public int getTickTime(){
        return tickTime;
    }

    public void exitGame() {
        System.out.println("You have abandoned " + name + "!!");
        System.exit(0);
    }
}
