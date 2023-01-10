import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {



    @Mock
    Lion lion;


@Test
    public void checkResultDoesHaveMane() throws Exception {
    Lion lionTest = new Lion("Самец", null);
    boolean actual = lionTest.doesHaveMane();
    assertEquals(actual,true);
}


@Test
public void checkChangeNubmersInGetKittens(){

    Mockito.when(lion.getKittens()).thenReturn(1000);
    int actual = lion.getKittens();
    int expected = 1000;
    System.out.println(lion.getKittens());
    assertEquals(actual,expected);
}

    @Test
    public void checkNubmersnGetKittens() throws Exception {
    Lion lion = new Lion("Самец",null);
    int actual = lion.getKittens();
    int expected = 1; ;
    assertEquals(actual,expected);
    }

@Test
    public void checkResultMokDoesHaveMane(){
    Mockito.when(lion.doesHaveMane()).thenReturn(false);
    System.out.println(lion.doesHaveMane());
}

@Test
    public void checkResultPrintGetFood() throws Exception {
    Lion lionTest = new Lion("Самец",null);
    List actual = lionTest.getFood();
    List expected = List.of("Животные", "Птицы", "Рыба");
    System.out.println(actual);
    assertEquals(actual,expected);
}

@Test
    public void checkExceptionGetFood(){
    Exception exception = null;

    try {
        Lion lionTest = new Lion("Жираф",null);
    } catch (Exception ex) {
        exception = ex;
    }
    assertNotNull(exception);
    assertEquals("Используйте допустимые значения пола животного - самей или самка",exception.getMessage());


}



}
