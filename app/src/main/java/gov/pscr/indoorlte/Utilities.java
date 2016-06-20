package gov.pscr.indoorlte;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;

/**
 * Created by parksjg on 5/18/16.
 */
public class Utilities {

    public static float getFloat(Resources resources, int resID) {
        TypedValue typedValue  = new TypedValue();
        resources.getValue(resID, typedValue , true);
        float flt = typedValue.getFloat();
        return flt;
    }

    public static Bitmap getViewLogo(Resources resources) {

        BitmapFactory.Options bfo = new BitmapFactory.Options();

        // We need to do this so 'decodeResource' returns bitmap in actual size
        // otherwise it returns a scaled image
        bfo.inScaled = false;
        Bitmap bmpOrigSize = BitmapFactory.decodeResource(resources, R.mipmap.pscr_logo, bfo);

        // Get original size of icon, then scale up by a factor
        int w = (int) (bmpOrigSize.getWidth() * 1.5f);
        int h = (int) (bmpOrigSize.getHeight() * 1.5f);

        Bitmap bmpLogo = Bitmap.createScaledBitmap(bmpOrigSize, w, h, false);
        return bmpLogo;
    }

}
