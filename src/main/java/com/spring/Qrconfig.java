package com.spring;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class Qrconfig {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        config.setImg("d:/logo.jpg");
        Color foreColor = new Color(30, 2, 227);
        Color bgColor = new Color(225, 232, 252);

        int foreColorRGB = foreColor.getRGB();
        int bgColorRGB = bgColor.getRGB();
        config.setForeColor(foreColorRGB);
        config.setBackColor(bgColorRGB);
        QrCodeUtil.generate("https://www.jianshu.com/u/809c908db1c5", config, FileUtil.file("d:/Qr.jpg"));

    }
}
