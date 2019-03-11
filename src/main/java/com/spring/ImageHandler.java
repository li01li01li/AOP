package com.spring;
import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Aspect
public class ImageHandler {
    private static final Logger logger = LoggerFactory.getLogger(ImageHandler.class);
    @Pointcut("execution(* com.spring.ImageCopy.copyImage())")
    public void handleImage(){

    }
    @Before(value = "handleImage()")
    public void pressTextOnImage(){
        logger.info("开始给图片添加水印");
        File srcFile = new File("D:/bg.jpg");
        File destFile = new File("D:/bg1.jpg");
        Color color =new Color(147, 25, 42);
        Font font = new Font("华文行楷",Font.BOLD,60);
        BufferedImage image = null;
        try {
            image = ImageIO.read(srcFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int width = image.getWidth();
        int height = image.getHeight();
        int size = 30;
        String text = "此水印来自风";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width-text.length()* size*2)/2,(height-size*2)/2,1.0f);
    }
    @AfterReturning("handleImage()")
    public void  grayImage(){
        logger.info("开始将图片转为黑白");
        File srcFile = new File("E:/bg1.jpg");
        File destFile = new File("E:/bg2.jpg");
        ImageUtil.gray(srcFile,destFile);
    }
}
