import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        VirtualPet virtualPet = new VirtualPet(enterPetName(), 20, 20,20,20,20);
        System.out.println(virtualPet.getName() + " created! Don't let its levels drop to 0! Good luck!");
        do {
            switch (virtualPet.displayLevels()) {
                case 1:
                    String food = virtualPet.getFood();
                    virtualPet.feed(food);
                    break;
                case 2:
                    virtualPet.water();
                    break;
                case 3:
                    virtualPet.bathroom();
                    break;
                case 4:
                    virtualPet.play();
                    break;
                case 5:
                    virtualPet.medicine();
                    break;
                case 6:
                    virtualPet.exitGame();
                    break;
                default:
                    virtualPet.ignoredPet();
            }
        }while(virtualPet.tick());
    }
    public static String enterPetName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pet name to create a pet: ");
        String name = scanner.nextLine();
        return name;
    }
}
