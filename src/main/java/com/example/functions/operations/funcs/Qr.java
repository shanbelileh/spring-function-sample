package com.example.functions.operations.funcs;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.function.Function;

/**
 * @author : mohammad
 * @since : 10/9/2021 9:43 PM , Sat
 * net
 **/
public class Qr implements Function<String, String>
{
    @Override
    public String apply(String barcodeText)
    {
        try {
            QRCodeWriter barcodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = barcodeWriter.encode(barcodeText, BarcodeFormat.QR_CODE, 300, 150);

            final ByteArrayOutputStream os = new ByteArrayOutputStream();
            BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);
            ImageIO.write(image, "png", os);
            return Base64.getEncoder().encodeToString(os.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}
