package br.com.luiz.pontointeligente.utils;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtilTest {

    private static final String SENHA = "123456";
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Test
    public void testSenhaNula() throws Exception{
        Assert.assertNull(PasswordUtil.gerarBCrypt(null));
    }

    @Test
    public void testGerarHashSenha() throws Exception{
        String hash = PasswordUtil.gerarBCrypt(SENHA);

        Assert.assertTrue(bCryptPasswordEncoder.matches(SENHA, hash));
    }
}
