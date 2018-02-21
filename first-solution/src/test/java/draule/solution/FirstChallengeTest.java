package draule.solution;

import draule.Unit;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FirstChallengeTest {


    @Test
    public void tupranToYubian() {
        Amount tupranAmount = new Amount(27, Unit.STONE);
        Amount yubianAmount = tupranAmount.convertTo(Unit.OKRA);
        assertThat(tupranAmount.getValue(), closeTo(yubianAmount.convertTo(Unit.STONE).getValue(), .001));
    }
}
