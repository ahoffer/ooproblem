package solution;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import challenge.Unit;

public class FirstChallengeTest {

    @Test
    public void tupranToYubian() {
        AmountImpl tupranAmount = new AmountImpl(27, Unit.STONE);
        AmountImpl yubianAmount = tupranAmount.convertTo(Unit.OKRA);
        assertThat(tupranAmount.getValue(),
                closeTo(yubianAmount.convertTo(Unit.STONE)
                        .getValue(), .001));
    }
}
