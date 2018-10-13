# Uonet+ request signer for PHP

[![Total Downloads](https://poser.pugx.org/wulkanowy/uonet-request-signer/downloads?format=flat-square)](https://packagist.org/packages/wulkanowy/uonet-request-signer)

## Instalation

```bash
$ composer require wulkanowy/uonet-request-signer dev-master
```

## Usage

```php
<?php

use function Wulkanowy\UonetRequestSigner\signContent;

require 'vendor/autoload.php';

$signed = signContent($password, $certificate, $content);
```

## Tests

```bash
$ composer test
```
