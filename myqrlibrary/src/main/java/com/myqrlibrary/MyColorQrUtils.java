package com.myqrlibrary;

import android.app.Activity;
import android.widget.ImageView;

/**
 * @author : 繁华 .
 * @fileName : MyColorQrUtils
 * @data : 2017/10/31;14:56
 * @motto : 人生的烦恼，多在于知道的太多，而做的太少。
 * @explain :
 */

public class MyColorQrUtils {

    public static void MyColorQrUtils1(ImageView imageView, String string) {
        imageView.setImageBitmap(QRCode.createQRCode(string));
    }
    public static void MyColorQrUtils2(Activity act, ImageView ivQR, String string, int id) {
        ivQR.setImageBitmap(QRCode.createQRCodeWithLogo2(string, 500,QRCode.drawableToBitmap(act.getResources().getDrawable(id))));
    }
    public static void MyColorQrUtils3(Activity act, ImageView ivQR, String string, int id) {
        ivQR.setImageBitmap(QRCode.createQRCodeWithLogo3(string, 500,QRCode.drawableToBitmap(act.getResources().getDrawable(id))));
    }
    public static void MyColorQrUtils4(Activity act, ImageView ivQR, String string, int id) {
        ivQR.setImageBitmap(QRCode.createQRCodeWithLogo3(string, 500,QRCode.drawableToBitmap(act.getResources().getDrawable(id))));
    }
    public static void MyColorQrUtils5(Activity act, ImageView ivQR, String string, int id) {
        ivQR.setImageBitmap(QRCode.createQRCodeWithLogo3(string, 500,QRCode.drawableToBitmap(act.getResources().getDrawable(id))));
    }
    public static void MyColorQrUtils6(Activity act, ImageView ivQR, String string, int id) {
        ivQR.setImageBitmap(QRCode.createQRCodeWithLogo3(string, 500,QRCode.drawableToBitmap(act.getResources().getDrawable(id))));

    }
}
