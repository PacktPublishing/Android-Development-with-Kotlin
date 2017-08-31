@file:Suppress("IllegalIdentifier")

package com.sample.marvelgallery

import com.sample.marvelgallery.data.network.providers.calculatedMd5
import org.junit.Assert.assertEquals
import org.junit.Test

class AuthParamTest {

    @Test
    fun `Example value is correct`() {
        val authParam = calculatedMd5("10000000PrivateKeyPublicKey")
        assertEquals("1746d867a61971a5f4a3f734401a95f8", authParam)
    }
}