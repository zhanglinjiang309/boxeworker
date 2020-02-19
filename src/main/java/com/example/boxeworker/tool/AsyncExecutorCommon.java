package com.example.boxeworker.tool;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Component
public class AsyncExecutorCommon {
    @Async("asyncServiceExecutor")
    public void pictureUpload(MultipartFile file,String path){
        System.out.println("1");
        long startTime = System.currentTimeMillis();
        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File("D:\\touxiang\\" + path + ".jpg")));//保存图片到目录下
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间："+(endTime-startTime)+"ms");
    }
}
