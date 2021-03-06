package org.scalaxb.maven.it;

import org.junit.Test;

public class ITP06Blocking extends AbstractIT {

    private String[] expected = new String[] {
            "generated/stockquote.scala",
            "generated/stockquote_type1.scala",
            "generated/xmlprotocol.scala",
            "scalaxb/httpclients_dispatch.scala",
            "scalaxb/httpclients.scala",
            "scalaxb/scalaxb.scala",
            "scalaxb/soap12.scala",
            "soapenvelope12/soapenvelope12.scala",
            "soapenvelope12/soapenvelope12_xmlprotocol.scala"
    };

    @Test
    public void filesAreGeneratedInCorrectLocation() {
        assertFilesGenerated("itp06-blocking", expected);
    }
    
}
