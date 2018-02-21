package draule;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FirstChallengeTest {


    @Test
    public void tupranToYubian() {

        AmountInterface tupranAmount = new Amount(27, Unit.STONE);
        assertThat(tupranAmount, notNullValue());

        AmountInterface yubianAmount = tupranAmount.convertTo(Unit.OKRA);
        assertThat(tupranAmount.getValue(), closeTo(yubianAmount.convertTo(Unit.STONE).getValue(), .001));
    }
}
