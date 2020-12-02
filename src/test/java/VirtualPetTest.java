import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

    @Test
    public void shouldReturnCorrectName(){
        VirtualPet virtualPet = new VirtualPet("Jim", 20, 20,20,20,20);
        String result = virtualPet.getName();
        Assert.assertEquals("Jim",result);
    }
    @Test
    public void shouldReturnHungerLevelOfTwenty(){
        VirtualPet virtualPet = new VirtualPet("Jim", 20, 20,20,20,20);
        int result = virtualPet.getHungerLevel();
        Assert.assertEquals(20,result);
    }
    @Test
    public void shouldReturnThirstLevelOfTwenty(){
        VirtualPet virtualPet = new VirtualPet("Jim", 20, 20,20,20,20);
        int result = virtualPet.getThirstLevel();
        Assert.assertEquals(20,result);
    }
    @Test
    public void shouldReturnWasteLevelOfTwenty(){
        VirtualPet virtualPet = new VirtualPet("Jim", 20, 20,20,20,20);
        int result = virtualPet.getWasteLevel();
        Assert.assertEquals(20,result);
    }
    @Test
    public void shouldReturnBoredomLevelOfTwenty(){
        VirtualPet virtualPet = new VirtualPet("Jim", 20, 20,20,20,20);
        int result = virtualPet.getBoredomLevel();
        Assert.assertEquals(20,result);
    }
    @Test
    public void shouldReturnSicknessLevelOfTwenty(){
        VirtualPet virtualPet = new VirtualPet("Jim", 20, 20,20,20,20);
        int result = virtualPet.getSicknessLevel();
        Assert.assertEquals(20,result);
    }
//    @Test
//    public String shouldReturnCorrectFood(){
//        VirtualPet virtualPet = new VirtualPet("Jim", 20, 20,20,20,20);
//        String result = virtualPet.feed("apples");
//        Assert.assertEquals("apples",result);
//    }
}
