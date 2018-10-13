<?php

namespace Wulkanowy\UonetRequestSigner;

function signContent(string $password, string $certificate, string $content)
{
    openssl_pkcs12_read(base64_decode($certificate), $keystore, $password);

    if (null === $keystore) {
        throw new \RuntimeException('Invalid password');
    }

    $privateKey = openssl_pkey_get_private($keystore['pkey'], $password);

    openssl_sign($content, $signature, $privateKey, OPENSSL_ALGO_SHA1);

    return base64_encode($signature);
}
