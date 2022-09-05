object CeasarCipher extends App{
    
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

    val text = scala.io.StdIn.readLine("Secret Message: ")

    def encrypt(message: String): String = {
        val encryptedMsg = message.map((c: Char) => {
            val x = alphabet.indexOf(c.toUpper)
            if (x == -1){
                c
            }else{
                alphabet((x + shift) % alphabet.size)
            }
        })

        return encryptedMsg
    }

    def decrypt(message: String): String = {
        val decryptedMsg = message.map((c: Char) => {
            val x = alphabet.indexOf(c.toUpper)
            if (x == -1){
                c
            }else{
                alphabet((x - shift + alphabet.size) % alphabet.size)
            }
        })

        return decryptedMsg
    }

    printf("Encrypted message: %s\n", encrypt(text))
    printf("Decrypted message: %s\n", decrypt(encrypt(text)))

}