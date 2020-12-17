package ua.khpi.oop.demianenko03;

import java.util.Arrays;

public final class UtilityClass {

    // Private constructor to prevent instantiation
    private UtilityClass() {
        throw new UnsupportedOperationException();
    }

    //public static methods here
    
    public static String FormatText(String incomingText) {
    	StringBuilder str = new StringBuilder();
    	String[] strArr = UtilityClass.Split(incomingText);
    	for(int i = 0; i < strArr.length; i++) {
    		if((strArr[i].length() % 4 != 0) || !isConsonant (strArr[i])) {
    			str.append(strArr[i]).append(" ");
    		}
    	}
    	String outText = str.toString().trim();
    	return outText;
    	
    	
    }
    
    private static String[] Split(String incomingText) {
    	String[] strArr1 = new String[16];
    	String Text = incomingText.trim().concat(" ");

    	int count = 0;
    	int a = 0;
    	int j = 0;
    	
    	for(int i = 0; i < Text.length(); i++) {
    		if(Text.charAt(i) != ' ') {
    			count++;
    		}
    			else {
    		    char[] str = new char[count];
    		    for(j = 0, i -= count; j < count; j++, i++) {
    		    	str[j] = Text.charAt(i);
    		    }
    			strArr1[a] = String.valueOf(str);
    			str = null;
    			count = 0;
    			a++;
    			}
    		}
    	
    	String[] strArr2 = new String[a];
    	for(int i = 0; i < a; i++) {
        	strArr2[i] = strArr1[i];
    	}
		return strArr2;
    }
    public static boolean isConsonant (String incomingText) {
    	switch ((char)Character.toLowerCase(incomingText.charAt(0))) {
    	case 'b':
    	case 'c':
    	case 'd':
    	case 'f':
    	case 'g':
    	case 'h':
    	case 'j':
    	case 'k':
    	case 'l':
    	case 'm':
    	case 'n':
    	case 'p':
    	case 'q':
    	case 'r':
    	case 's':
    	case 't':
    	case 'v':
    	case 'w':
    	case 'x':
    	case 'y':
    	case 'z':
    	return true;
    	default:
    		return false;
    	}
    }
}
