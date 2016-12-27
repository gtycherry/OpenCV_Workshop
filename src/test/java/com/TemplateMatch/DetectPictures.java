package com.TemplateMatch;


import org.junit.Test;
import org.opencv.core.Core;

public class DetectPictures {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    Matching matching =new Matching();

    @Test
    public void FindRedPacket() throws Exception {
        int location[] = matching.getMatchingLocation1("screenshots/wechat.png", "temp/tem-wechat.png", "compare/recpacket_compared.png");
    }

    @Test
    public void FindLenaFace() throws Exception {
        int location[] = matching.getMatchingLocation1("screenshots/lena.png", "temp/temp_lena_face.png", "compare/lena_face.png");

        System.out.println("x= "+location[0]+",  y="+location[1]);
    }
}
