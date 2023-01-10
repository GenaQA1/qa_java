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
        };
    }


    @Test
    public void checkResultChoose1() throws Exception {
            Lion lionTest = new Lion(sex,null);
            boolean actual = lionTest.doesHaveMane();
            assertEquals(expected, actual);
            System.out.println(actual);




    }
}
