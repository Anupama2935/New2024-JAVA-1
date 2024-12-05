package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class log_Capture {
	
	public static void takeLog (String logmessage, String ClassName)
	{
		DOMConfigurator.configure("../Youtube_TestNG_pomXML/layout.xml");
		Logger L = Logger.getLogger(ClassName);
		L.info(logmessage);
	}

}
