package com.code.String;

public class AreStringRotations {

    public static boolean areRotations(String s1, String s2 )
    {
        return (s1.length()==s2.length())&&((s1 + s1).contains(s2));
    }
}
