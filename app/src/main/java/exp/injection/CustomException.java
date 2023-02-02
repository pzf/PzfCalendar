package exp.injection;

import android.util.Log;
import android.view.View;


public class CustomException {
    public static final String TAG = CustomException.class.getSimpleName();

    public static void injectNullPointerException (View view){
        try {
            Log.i(TAG,"injectNullPointerException begin");
            view = view.getId() == 0 ? view:null;
            float y = view.getY();
        }  finally {
            Log.i(TAG,"injectNullPointerException after");
        }
    }
}
