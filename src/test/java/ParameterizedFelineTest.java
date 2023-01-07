import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParameterizedFelineTest {

    @Mock
    Feline feline;


    private final String animalKind; // текст, который передаётся в метод
   private final List<String> expected;

    Feline felineTest = new Feline();

    public ParameterizedFelineTest(String animalKind, List<String> expected){
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalKind(){
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Молочник", List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник")},
        };
    }

@Test
    public void checkResultChoose() throws Exception {

    Exception exception = null;
   try {
       List <String> actual = felineTest.getFood(animalKind);
       assertEquals(expected,actual);
   } catch (Exception ex){
       exception = ex;
       assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",exception.getMessage());

    }


}
}
