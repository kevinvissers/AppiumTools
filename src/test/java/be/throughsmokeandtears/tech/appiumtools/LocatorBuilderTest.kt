package be.throughsmokeandtears.tech.appiumtools

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class LocatorBuilderTest {

    @Test
    fun `Can create instance of class`() {
        val locatorBuilder = LocatorBuilder()
        assertThat(locatorBuilder).isInstanceOf(LocatorBuilder::class.java)
    }
}