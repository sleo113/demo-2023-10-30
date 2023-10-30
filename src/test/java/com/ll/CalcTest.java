package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    @DisplayName("Calc에 run 메서드는 int를 리턴한다.")

    void t1(){
        int rs = Calc.run("");
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void t2(){
        int rs = Calc.run("10 + 10");

        assertThat(rs).isEqualTo(20);
    }
}
