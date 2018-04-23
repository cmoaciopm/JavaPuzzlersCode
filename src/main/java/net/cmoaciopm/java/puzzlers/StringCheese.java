package net.cmoaciopm.java.puzzlers;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringCheese {
    public static void main(String args[]) {
        System.out.println("Defalt charset: " + Charset.defaultCharset());

        byte bytes[] = new byte[256];    
        for(int i = 0; i < 256; i++)
            bytes[i] = (byte)i;
        String str = new String(bytes);
        for(int i = 0, n = str.length(); i < n; i++)
            System.out.print((int)str.charAt(i) + " ");

        System.out.println();

		try {
            String str2 = new String(bytes, "ISO-8859-1");
            for(int i = 0, n = str2.length(); i < n; i++)
                System.out.print((int)str2.charAt(i) + " ");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
