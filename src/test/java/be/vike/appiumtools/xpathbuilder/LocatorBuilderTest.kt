package be.vike.appiumtools.xpathbuilder

import org.junit.Test
import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage

class LocatorBuilderTest {

    @Test
    fun `Can create instance of class`() {
        val locatorBuilder = LocatorBuilder()
        assertThat(locatorBuilder).isInstanceOf(LocatorBuilder::class.java)
    }
}