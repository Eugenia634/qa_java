import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CatTest {
    Cat cat;

    @Before
    public void catData() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void getCorrectCatSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getCorrectCatFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}