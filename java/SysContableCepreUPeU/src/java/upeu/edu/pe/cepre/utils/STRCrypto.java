package upeu.edu.pe.cepre.utils;
/*
 * @(#)STRCrypto.java
 *
 * Copyright (c) 2006 Submit Consulting, Inc., Lima-Per�. All Right Reserved.
 * Author: @ngel Sull�n Ma�alup� Created: 21.SEP.2000 Last Modify: 30.SEP.2005
 *
 * Important: Este software se proporciona sin garant�as de ning�n tipo de su
 * funcionamiento y en ning�n caso ser� el autor responsable de da�os o
 * perjuicios que deriven del mal uso o alteraci�n del programa.
 *
 * Process: En�r&pt@ un@ �@den@
 * Ultima Actualizacion: 09.APR.2013
 * Por Jose Manuel Limachi Chavez - Alias:josmarl - Tacna-Peru
 */

import java.security.Key;
import java.security.Security;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class STRCrypto {

    KeySpec keySpec;

    public SecretKey getKeyString() {
        String keyString = "ACED00057372001E636F6D2E73756E2E63727970746F2E70726F76696465722E4445534B65796B349C35DA1568980200015B00036B65797400025B427870757200025B42ACF317F8060854E00200007870000000086438D0196107EFF1";
        try {
            byte[] keyBytes = keyString.getBytes("UTF8");
            keySpec = new DESedeKeySpec(keyBytes);
            SecretKeyFactory keyFactory;
            keyFactory = SecretKeyFactory.getInstance("DESede");
            SecretKey key = keyFactory.generateSecret(keySpec);
            return key;
        } catch (Exception e) {
            System.out.println("could not read private key: " + e);
            return null;
        }
    }

    private static String bytesToString(byte[] bytes) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            stringBuffer.append((char) bytes[i]);
        }
        return stringBuffer.toString();
    }

    public String encrypt(String texto) throws Exception {
        try {
            Security.addProvider(new com.sun.crypto.provider.SunJCE());
            Key key = getKeyString();
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            BASE64Encoder encoder = new BASE64Encoder();
            byte[] cleartext = texto.getBytes("UTF8");
            byte[] ciphertext = cipher.doFinal(cleartext);

            return encoder.encode(ciphertext).toString();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public String decrypt(String texto) throws Exception {
        try {
            Security.addProvider(new com.sun.crypto.provider.SunJCE());
            Key key = getKeyString();
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.DECRYPT_MODE, key);

            BASE64Decoder decoder = new BASE64Decoder();
            byte[] cleartext = decoder.decodeBuffer(texto);
            byte[] ciphertext = cipher.doFinal(cleartext);

            return bytesToString(ciphertext);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void main(String[] args) {

        STRCrypto cryp = new STRCrypto();
        try {

            System.out.println(cryp.encrypt("jdbc:mysql://localhost:3306/db_sccu"));
            //SOQofoD1sZrWEg5izYvRpKhnfWnLLDKGjkm3K8Am/bWwT2NUr06vcA==
            System.out.println(cryp.encrypt("root"));
            //+39sDDNLz1g=
            System.out.println(cryp.encrypt("josmarl"));
            //QO3SoaWnsxk=
            System.out.println(cryp.encrypt(""));
            //f9ueMZnY2Rk=
            System.out.println(cryp.encrypt("select * from sca_usuario where username=? and password=?"));
            //N4Okey7OGypzLXA082d+uDgpHaFpD9f7wjdTp0BWa2m/7Q2c+pvE5AB2BX3V/oJuf8vJeGhzZSA=
            System.out.println(cryp.encrypt("jsp/Modulos/Seguridad/loginForm.jsp"));
            //SmvPMalc+lzPzjqnuUdS2ZoMfX3OAGudT1ngVa85wCN2tagt1b+GOg==
            System.out.println(cryp.encrypt("../../../LoginController?opt=2"));
            //MSew0dLRxMcFRwVH5DGSgpMVJ13BHo1gZ0m3fmtNDdA=
            System.out.println(cryp.encrypt("123456"));
            //LmAJembXM+g=
            System.out.println(cryp.decrypt("7w35uwnqfzaerugw"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
