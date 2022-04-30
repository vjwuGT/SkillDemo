import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SkillDemoTest {
    
    @Test
    public void test1(){
        SkillDemo sd = new SkillDemo();
        int[] array = {1,2,3,4};
        assertEquals(10, sd.sum(array));
    }
}
