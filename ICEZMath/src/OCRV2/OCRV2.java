package OCRV2;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import net.sourceforge.tess4j.*;



public class OCRV2 
{
	static String result;
	static StringManipulator sm;
	static EquationSolver es;
	static ArrayList eList;
	
    public static void main(String[] args) 
    {
    	
    	Random rand = new Random();
    	File[] files = new File( "C:\\\\Users\\\\ryley\\\\OneDrive\\\\Documents\\\\GitHub\\\\ICEZMath_Code\\\\ICEZMath\\\\Test Pictures" ).listFiles();
    	File file = files[ rand.nextInt( files.length ) ];
    	
        // ImageIO.scanForPlugins(); // for server environment
        File imageFile = file;//new File("C:\\Users\\ryley\\OneDrive\\Documents\\GitHub\\ICEZMath_Code\\ICEZMath\\Test Pictures\\x.jpg");
        ITesseract instance = new Tesseract(); // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        instance.setDatapath("C:\\Users\\ryley\\OneDrive\\Documents\\GitHub\\ICEZMath_Code\\ICEZMath\\Tesseract\\Tess4J\\tessdata"); // replace <parentPath> with path to parent directory of tessdata
        instance.setLanguage("eng");

        try {
            result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) 
        {
            System.err.println(e.getMessage());
        }
        
        
        sm = new StringManipulator(result);
        eList = sm.getEquationList();
        Equation zero = (Equation) eList.get(0);
        es = new EquationSolver(zero);
    }
}