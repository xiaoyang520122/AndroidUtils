package com.library.androidutils.message;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class ToastUtil {
	private static Toast mToast;


	public static void showToastLong(Context paramContext, String paramString) {
		try {
			 if(mToast == null) {    
		            mToast = Toast.makeText(paramContext, paramString, Toast.LENGTH_LONG);
		        } else {
                 Tcancel();
                 mToast = Toast.makeText(paramContext, paramString, Toast.LENGTH_LONG);
				 mToast.setDuration(Toast.LENGTH_LONG);
		        }    
			 mToast.setGravity(Gravity.BOTTOM, 0, 100);
		        Tshow();   
			return;
		} catch (Exception localException) {
			localException.printStackTrace();
		}
	}

	public static void Tcancel(){
		if (mToast!=null){
			try {
				mToast.cancel();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Tshow(){
		if (mToast!=null){
			try {
				mToast.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void showToastShort(Context paramContext, String paramString) {
		try {
			 if(mToast == null) {
			 	mToast = Toast.makeText(paramContext, paramString, Toast.LENGTH_SHORT);
		        } else {
                 Tcancel();
                 mToast = Toast.makeText(paramContext, paramString, Toast.LENGTH_SHORT);
                 mToast.setDuration(Toast.LENGTH_SHORT);
		        } 
			 mToast.setGravity(Gravity.BOTTOM, 0, 100);
		        Tshow();   
			return;
		} catch (Exception localException) {
			localException.printStackTrace();
		}
	}
	
	private static Toast toast;

	public static void Ocancel(){
		if (toast!=null){
			try {
				toast.cancel();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Oshow(){
		if (toast!=null){
			try {
				toast.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
public static Toast showLongToast(Context context, String msg){
		
		if (toast==null) {
			toast= Toast.makeText(context, msg, Toast.LENGTH_LONG);
		}else {
            Ocancel();
            toast= Toast.makeText(context, msg, Toast.LENGTH_LONG);
			toast.setDuration(Toast.LENGTH_LONG);
		}
	try {
		Oshow();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return toast;
	}
	
}
