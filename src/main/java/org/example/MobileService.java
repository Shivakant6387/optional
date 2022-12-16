package org.example;

public class MobileService {
    public int getMobileScreenWidth(Mobile mobile){
        if (mobile!=null){
            DisplayFeatures displayFeatures=mobile.getDisplayFeatures();
            if (displayFeatures!=null){
                ScreenResolution screenResolution=displayFeatures.getResolution();
                if (screenResolution!=null){
                    return screenResolution.getWidth();
                }
            }
        }
        return 0;
    }
}
