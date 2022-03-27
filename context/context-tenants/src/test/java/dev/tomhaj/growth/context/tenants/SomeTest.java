package dev.tomhaj.growth.context.tenants;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SomeTest {

    @Test
    void some() {
        // given
        var a = 1;

        // when
        a = a + 1;

        // then
        assertThat(a).isEqualTo(3);
    }

}
