// contact for further information : Dr. Gautam Ravindra Dange : gdage.uni-bremen.de


package xslt;
import java.io.File;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class tagreplacer {

	public static void main(String[] args) throws TransformerException {
		Source input  = new StreamSource("./item.xml");
		Source xsl    = new StreamSource("./skip_replace_tags.xsl");
		Result output = new StreamResult(new File("./tags_replaced.xml")); 
		TransformerFactory factory =new  net.sf.saxon.TransformerFactoryImpl();
		//TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer(xsl);
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(input, output);
		
	
		Source input1  = new StreamSource("./tags_replaced.xml");
		Source xsl1    = new StreamSource("./xml_to_json_converter.xsl");
		Result output1 = new StreamResult(new File("./products_in_json_format.json")); 
		TransformerFactory factory1 =new  net.sf.saxon.TransformerFactoryImpl();
		//TransformerFactory.newInstance();
		Transformer transformer1 = factory1.newTransformer(xsl1);
		transformer1.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer1.transform(input1, output1);
		
		
		

	}

}
