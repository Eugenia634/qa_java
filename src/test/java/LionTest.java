import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    private static final String MALE = "Самец";
    private static final String UNSUPPORTED_SEX = "unsupported sex";
    private static final String TEXT_EXCEPTION = "Используйте допустимые значения пола животного - самец или самка";

    Lion lion;
    @Mock
    private Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        lion = new Lion(MALE, feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testIfHasManeException() {

        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion(UNSUPPORTED_SEX, feline));
        Assert.assertEquals(TEXT_EXCEPTION, exception.getMessage());
    }

    @Test
    public void testGetFood() throws Exception {
        lion = new Lion(MALE, feline);

        lion.getFood();
        Mockito.verify(feline).getFood(Mockito.anyString());
    }
}