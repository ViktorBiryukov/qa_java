import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestLionParameterized {

    private final String sex;
    private final boolean expected;

    Feline feline;

    public TestLionParameterized(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getMane(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeMaleAndFemalePositiveAndNegative() throws Exception {
        Lion lion = new Lion(sex,feline);
        boolean actual = lion.doesHaveMane();

        Assert.assertEquals(expected,actual);
    }


}