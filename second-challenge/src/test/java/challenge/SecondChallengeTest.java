package challenge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

import org.junit.Test;

public class SecondChallengeTest {

    @Test
    public void tupranToYubian() {
        Amount yubianAmount = new Amount(50.25, Unit.BARREL);
        Amount tupranAmount = yubianAmount.convertTo(Unit.COOMB);
        assertThat(yubianAmount.getValue(),
                closeTo(tupranAmount.convertTo(Unit.BARREL)
                        .getValue(), .001));
    }

    @Test(expected = IllegalConversionException.class)
    public void invalidConversion() {
        new Amount(1.0, Unit.STONE).convertTo(Unit.COOMB);
    }

}




