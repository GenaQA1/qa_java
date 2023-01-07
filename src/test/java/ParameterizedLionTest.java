import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {


    @Mock
    Lion lion;

    private final String sex; // текст, который передаётся в метод
    private final boolean expected;




    public ParameterizedLionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;



    }

    @Parameterized.Parameters
    public static Object[][] getAnimalKin1d() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Оно", true},
        };
    }


    @Test
    public void checkResultChoose1() throws Exception {


        Exception exception = null;
        try {
            Lion lionTest = new Lion(sex,null);
            boolean actual = lionTest.doesHaveMane();
            assertEquals(expected, actual);
            System.out.println(actual);

        }catch (Exception ex){
            exception = ex;
            assertEquals("Используйте допустимые значения пола животного - самей или самка",exception.getMessage());
        }


    }
}
