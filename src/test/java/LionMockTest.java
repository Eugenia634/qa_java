import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    private static final String MALE = "Самец";
    @Mock
    Feline feline;

    @Test
    public void getKittensTestToReturnOne() throws Exception {
        Lion lion = new Lion(MALE, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
}