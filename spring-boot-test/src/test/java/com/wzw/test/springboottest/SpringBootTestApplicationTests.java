package com.wzw.test.springboottest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Test
    void contextLoads() {
        String picIsBase64 = "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";
        String picPath = "c:/temp/";
        String property = System.getProperty("user.dir");
        System.out.println(property);
        byte[] decode = Base64.getDecoder().decode(picIsBase64.getBytes(StandardCharsets.UTF_8));
        for (int i=0 ; i < decode.length;i++){
            if (decode[i] < 0){
                decode[i] += 256;
            }
        }

        File tempFile = new File(picPath+"1.jpg");
        if (!tempFile.getParentFile().exists()) {
            boolean mkdirs = tempFile.getParentFile().mkdirs();
        }

        try(
                OutputStream out = new FileOutputStream(tempFile);
        ) {
            out.write(decode);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path = tempFile.getAbsolutePath();
        System.out.println(path);
    }
    }

