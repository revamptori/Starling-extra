/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Error
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.InvalidKeyException
 *  java.security.Key
 *  java.security.KeyFactory
 *  java.security.KeyPair
 *  java.security.KeyPairGenerator
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.security.PrivateKey
 *  java.security.PublicKey
 *  java.security.spec.AlgorithmParameterSpec
 *  java.security.spec.InvalidKeySpecException
 *  java.security.spec.KeySpec
 *  java.security.spec.X509EncodedKeySpec
 *  javax.crypto.BadPaddingException
 *  javax.crypto.Cipher
 *  javax.crypto.IllegalBlockSizeException
 *  javax.crypto.KeyGenerator
 *  javax.crypto.NoSuchPaddingException
 *  javax.crypto.SecretKey
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ng {
    private static final Logger a = LogManager.getLogger();

    public static SecretKey a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance((String)"AES");
            keyGenerator.init(128);
            return keyGenerator.generateKey();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error((Throwable)noSuchAlgorithmException);
        }
    }

    public static KeyPair b() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance((String)"RSA");
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            a.error("Key pair generation failed!");
            return null;
        }
    }

    public static byte[] a(String string, PublicKey publicKey, SecretKey secretKey) {
        try {
            return ng.a("SHA-1", string.getBytes("ISO_8859_1"), secretKey.getEncoded(), publicKey.getEncoded());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }

    private static byte[] a(String string, byte[] ... byArray) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance((String)string);
            for (byte[] byArray2 : byArray) {
                messageDigest.update(byArray2);
            }
            return messageDigest.digest();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
    }

    public static PublicKey a(byte[] byArray) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
            KeyFactory \u26032 = KeyFactory.getInstance((String)"RSA");
            return \u26032.generatePublic((KeySpec)x509EncodedKeySpec);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            // empty catch block
        }
        a.error("Public key reconstitute failed!");
        return null;
    }

    public static SecretKey a(PrivateKey privateKey, byte[] byArray) {
        return new SecretKeySpec(ng.b((Key)privateKey, byArray), "AES");
    }

    public static byte[] a(Key key, byte[] byArray) {
        return ng.a(1, key, byArray);
    }

    public static byte[] b(Key key, byte[] byArray) {
        return ng.a(2, key, byArray);
    }

    private static byte[] a(int n, Key key, byte[] byArray) {
        try {
            return ng.a(n, key.getAlgorithm(), key).doFinal(byArray);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
        a.error("Cipher data failed!");
        return null;
    }

    private static Cipher a(int n, String string, Key key) {
        try {
            Cipher cipher = Cipher.getInstance((String)string);
            cipher.init(n, key);
            return cipher;
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        a.error("Cipher creation failed!");
        return null;
    }

    public static Cipher a(int n, Key key) {
        try {
            Cipher cipher = Cipher.getInstance((String)"AES/CFB8/NoPadding");
            cipher.init(n, key, (AlgorithmParameterSpec)new IvParameterSpec(key.getEncoded()));
            return cipher;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException((Throwable)generalSecurityException);
        }
    }
}
