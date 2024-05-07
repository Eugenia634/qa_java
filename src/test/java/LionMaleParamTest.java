import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class LionMaleParamTest {
    private final String sex;
    private final Boolean expectedMane;

    public LionMaleParamTest(String sex, Boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] ifHasMane() {
        return new Object[][]{
                {"Самец", Boolean.TRUE},
                {"Самка", Boolean.FALSE},
        };
    }

    @Test
    public void testToReturnIfLionHasMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        Assert.assertEquals(expectedMane, lion.doesHaveMane());
    }
}

