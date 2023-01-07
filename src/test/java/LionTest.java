import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
public void test1() throws Exception {
   Mockito.when(lion.getKittens()).thenReturn(2);
    Lion lionTest = new Lion("Самец", null);
    int acutal = lion.getKittens();
    int expected = 2;
    assertEquals(acutal,expected);
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
    public void checkResultMokDoesHaveMane(){
    Mockito.when(lion.doesHaveMane()).thenReturn(false);
    System.out.println(lion.doesHaveMane());
}

@Test
    public void checkResultPrintGetFood() throws Exception {
    Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    List actual = lion.getFood();
    List expected = List.of("Животные", "Птицы", "Рыба");
    System.out.println(actual);
    assertEquals(actual,expected);

}



}
