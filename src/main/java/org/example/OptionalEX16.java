package org.example;
public class OptionalEX16 {
    public static void main(String[] args) {
ScreenResolution screenResolution=new ScreenResolution(750,1334);
DisplayFeatures displayFeatures=new DisplayFeatures("4.7",screenResolution);
Mobile mobile=new Mobile(2015001,"Apple","iPhone 6s",displayFeatures);
MobileService mobileService=new MobileService();
int mobileWidth=mobileService.getMobileScreenWidth(mobile);
        System.out.println("Apple iphone 6s screen width"+mobileWidth);



        ScreenResolution screenResolution1=new ScreenResolution(0,0);
        DisplayFeatures displayFeatures1=new DisplayFeatures("0",screenResolution1);
        Mobile mobile1=new Mobile(2015001,"Apple","iphone 6s",displayFeatures1);
        int mobileWidth1=mobileService.getMobileScreenWidth(mobile1);
        System.out.println("Apple iphone 16s screen width"+mobileWidth1);
    }
}
