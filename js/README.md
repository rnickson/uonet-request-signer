# Uonet+ request signer for Node.js

## Instalation

```bash
$ npm install uonet-request-signer
```

[Browser demo](https://wulkanowy.github.io/uonet-request-signer/)

## Usage

In browser:

```html
<script src="signer-browser.js"></script>
<script>
    const signed = signer.signContent(password, certificate, content);
</script>
```

In Node.js:

```js
const signer = require("uonet-request-signer/signer-node");

const signed = signer.signContent(password, certificate, content);
```

## Tests

```bash
$ npm run test
```
