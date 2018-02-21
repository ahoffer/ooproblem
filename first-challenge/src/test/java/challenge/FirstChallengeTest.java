package challenge;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FirstChallengeTest {

    @Test
    public void tupranToYubian() {

        Amount tupranAmount = new AmountImpl(27, Unit.STONE);
        assertThat(tupranAmount, notNullValue());

        Amount yubianAmount = tupranAmount.convertTo(Unit.OKRA);
        assertThat(tupranAmount.getValue(),
                closeTo(yubianAmount.convertTo(Unit.STONE)
                        .getValue(), .001));
    }
}
