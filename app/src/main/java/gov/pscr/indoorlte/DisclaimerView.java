package gov.pscr.indoorlte;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class DisclaimerView extends LinearLayout {

    private final int CLR_APP_BACKGROUND = getResources().getColor(R.color.app_background);
    private final int CLR_SIDEBAR        = getResources().getColor(R.color.app_sidebar);

    private static final String TAG = DisclaimerView.class.getSimpleName();

    private float  pixelDensity;
    private Paint  paintLine = new Paint();
    private Bitmap bmpLogo;

    public DisclaimerView(Context context) {
        super(context);

        pixelDensity = getResources().getDisplayMetrics().density;

        // Dynamically load the layout for this view
        View view = inflate(context, R.layout.activity_disclaimer, null);
        addView(view);

        init(context);

        final Button btnAccept = (Button)findViewById(R.id.btnaccept);
        GradientDrawable gd = (GradientDrawable)(btnAccept.getBackground());
        gd.setColor(getResources().getColor(R.color.button_accept));

        // This is required to get our onDraw() to get called
        setWillNotDraw(false);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Log.d(TAG, "view.onDraw: getWidth: " + getWidth() + "; getHeight: " + getHeight());
        Log.d(TAG, "view.onDraw: pixel density: "+pixelDensity);

        // Fill background with color
        canvas.drawColor(CLR_APP_BACKGROUND);

        float x, y;

        x = 30f * pixelDensity;
        canvas.drawLine(x, 0, x, getHeight(), paintLine);

        x = 10f * pixelDensity;
        y = 20f * pixelDensity;
        canvas.drawBitmap(bmpLogo, x, y, null);
    }

    private void init(Context context) {
        Log.d(TAG, "----------------- init called");

        paintLine = new Paint();
        paintLine.setColor(CLR_SIDEBAR); // orangish
        paintLine.setStrokeWidth(
                Utilities.getFloat(getResources(), R.dimen.width_app_sidebar) * pixelDensity);
        paintLine.setStyle(Paint.Style.FILL);

        bmpLogo = Utilities.getViewLogo(getResources());
    }

}
