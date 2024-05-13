import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    private Feline feline = new Feline();
    private int kittensOne = 1;
    private int kittentsCount = 3;
    @Test
    public void eatMeatTestToReturnFelineFoodList() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyToBeFelineFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensToReturnOne() {
        Assert.assertEquals(kittensOne, feline.getKittens());
    }

    @Test
    public void getKittensToReturnSpecifiedAmount() {
        Assert.assertEquals(kittentsCount, feline.getKittens(3));
    }
}
