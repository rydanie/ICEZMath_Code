package OCRV2;

import java.io.File;
import net.sourceforge.tess4j.*;

public class OCRV2 
{
	public static String result;
	static StringManipulator sm;
    public static void main(String[] args) 
    {
    	
    	
        // ImageIO.scanForPlugins(); // for server environment
        File imageFile = new File("D:\\JAVA Programing\\Eclipse\\Projects\\ICEZMath\\Test Pictures\\x.jpg");
        ITesseract instance = new Tesseract(); // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        instance.setDatapath("D:\\JAVA Programing\\Eclipse\\Projects\\ICEZMath\\Tesseract\\Tess4J\\tessdata"); // replace <parentPath> with path to parent directory of tessdata
        instance.setLanguage("eng");

        try {
            result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) 
        {
            System.err.println(e.getMessage());
        }
        
        
        sm = new StringManipulator(result);
    }
}