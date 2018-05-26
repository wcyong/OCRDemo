package org.wcy.ocr;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * @author wcyong
 *
 * https://github.com/tesseract-ocr/tessdata
 */
public class ORCDemo {
    public static void main(String[] args) throws TesseractException {
        ITesseract instance = new Tesseract();
        instance.setLanguage("chi_sim");
        // 指定识别图片
        File imgDir = new File("G:/test/8.png");
        long startTime = System.currentTimeMillis();
        String ocrResult = instance.doOCR(imgDir);
        // 输出识别结果
        System.out.println("OCR Result: \n" + ocrResult + "\n 耗时：" + (System.currentTimeMillis() - startTime) + "ms");
    }
}
