import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Cat cat;



    @Test
    public void checkSaySoundCat(){
        Cat catTest = new Cat(null);
        String actual = catTest.getSound();
        assertEquals("Мяу",actual);

    }
}

