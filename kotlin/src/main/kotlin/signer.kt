package io.github.wulkanowy.signer

import java.io.ByteArrayInputStream
import java.security.KeyStore
import java.security.PrivateKey
import java.security.Signature
import java.util.*

fun signContent(password: String, certificate: String, content: String): String? {
    val keystore = KeyStore.getInstance("pkcs12").apply {
        load(ByteArrayInputStream(Base64.getDecoder().decode(certificate)), password.toCharArray())
    }
    val signature = Signature.getInstance("SHA1WithRSA").apply {
        initSign(keystore.getKey("LoginCert", password.toCharArray()) as PrivateKey)
        update(content.toByteArray())
    }
    return Base64.getEncoder().encodeToString(signature.sign())
}
