import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {


    @Mock
    Feline feline;
    Feline felineTest = new Feline();

    @Test
    public void checkGetKittensInt() throws Exception {

        feline.getKittens(2);
        Mockito.verify(feline).getKittens(2);
    }


    @Test
    public void checkGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List acutal = feline.getFood("Хищник");
        List expected = List.of("Животные", "Птицы", "Рыба");
        System.out.println(acutal);
        assertEquals(acutal, expected);
    }

    @Test
    public void checkGetFamily(){
        String actual =  felineTest.getFamily();
        String expected = "Кошачьи";
        assertEquals(actual,expected);
    }

    @Test
    public void checkGetKittens(){
        int actual = felineTest.getKittens();
        int expected = 1;
        assertEquals(actual,expected);
    }

}
