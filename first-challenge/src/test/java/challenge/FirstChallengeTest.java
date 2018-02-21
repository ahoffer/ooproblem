package challenge;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FirstChallengeTest {

    @Test
    public void tupranToYubian() {
        Amount tupranAmount = new Amount(27, Unit.STONE);
        assertThat(tupranAmount, notNullValue());
        assertThat(tupranAmount.getValue(), closeTo(27, 0.001));
        assertThat(tupranAmount.getUnit(), is(Unit.STONE));

        Amount yubianAmount = tupranAmount.convertTo(Unit.OKRA);
        assertThat(yubianAmount, notNullValue());
        assertThat(yubianAmount.getValue(), closeTo(135, 0.001));
        assertThat(yubianAmount.getUnit(), is(Unit.OKRA));

        assertThat(tupranAmount.getValue(),
                closeTo(yubianAmount.convertTo(Unit.STONE)
                        .getValue(), .001));
    }
}
