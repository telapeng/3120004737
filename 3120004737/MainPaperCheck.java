package com.azhu.main;

import com.azhu.utils.HammingUtils;
import com.azhu.utils.SimHashUtils;
import com.azhu.utils.TxtIOUtils;

public class MainPaperCheck {

    public static void main(String[] args) {

        String str0 = TxtIOUtils.readTxt(args[0]);
        String str1 = TxtIOUtils.readTxt(args[1]);
        String resultFileName = args[2];
        String simHash0 = SimHashUtils.getSimHash(str0);
        String simHash1 = SimHashUtils.getSimHash(str1);
        double similarity = HammingUtils.getSimilarity(simHash0, simHash1);
        TxtIOUtils.writeTxt(similarity, resultFileName)
        System.exit(0);
    }

}