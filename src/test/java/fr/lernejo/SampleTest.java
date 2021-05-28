package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void fact_negative_exception() {
        int number = -1;
        Assertions.assertThatIllegalArgumentException().isThrownBy(() -> Sample.fact(number));
    }

    @Test
    void fact_5_is_120() {
        int input = 5;
        int res = Sample.fact(5);
        Assertions.assertThat(res).as("facto of 5").isEqualTo(120);
    }

    @Test
    void add_9_10_is_19() {
        int addend1 = 9;
        int addend2 = 10;
        Sample.Operation operand = Sample.Operation.ADD;
        int sum = Sample.op(operand, addend1, addend2);
        Assertions.assertThat(sum).as("sum of 9 + 10").isEqualTo(19);
    }

    @Test
    void mult_3_7_is_21() {
        int res = Sample.op(Sample.Operation.MULT, 3, 7);
        Assertions.assertThat(res).as("product of 3 by 7").isEqualTo(21);
    }

    @Test
    void mult_by_0() {
        int multiplier = 21;
        int res = Sample.op(Sample.Operation.MULT, multiplier, 0);
        Assertions.assertThat(res).as("multiplication by 0").isZero();

        // can we add several asserts in one?
//        multiplier = 6;
//        res = Sample.op(Sample.Operation.MULT, multiplier, 0);
//        Assertions.assertThat(res).as("multiplication by 0").isZero();
    }

}
