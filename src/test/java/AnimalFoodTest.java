import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalFoodTest {
    //family animals
    private final String animalType;

    //what eat
    private final List<String> expectedFood;

    public AnimalFoodTest(String animalKindType, List<String> expectedFood) {
        this.animalType = animalKindType;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalFoodGroup() {
        return new Object[][]{
                {"Травоядное",
                        List.of("Трава", "Различные растения")},
                {"Хищник",
                        List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodToMatchAnimal() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(expectedFood, animal.getFood(animalType));
    }
}

