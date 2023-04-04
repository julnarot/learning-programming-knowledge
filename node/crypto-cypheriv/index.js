const crypto = require('crypto');
 
const algorithm = 'aes-256-cbc'; 
const password = "@Julnarot";
const key = "12345678123456781234567812345678";
const iv = "1234567812345678";
const encoding = "hex";
 
function encrypt(text) {
    let cipher = crypto.createCipheriv(algorithm, key, iv);
    let encrypted = cipher.update(text);
    encrypted = Buffer.concat([encrypted, cipher.final()]);
    return encrypted.toString(encoding);
}

function decrypt(text) {
    let encryptedText = Buffer.from(text, encoding);
    let decipher = crypto.createDecipheriv(algorithm, key, iv);
    let decrypted = decipher.update(encryptedText);
    decrypted = Buffer.concat([decrypted, decipher.final()]);
 
    return decrypted.toString();
}
const passwordEncrypted = encrypt(password) 
console.log(decrypt(passwordEncrypted));
