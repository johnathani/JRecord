package net.sf.JRecord.cbl2xml.zTest.example1;

/**
 * -------------------------------------------------------------------
 *
 *  Purpose:  Convert a Cobol Data file using Cobol Copybook to a Xml file       
 *   Author:  RecordEditor~CodeGen
 *        
 * *------------- Keep this notice in your final code ---------------
 * *   This code was generated by JRecord projects CodeGen program
 * *            on the: 20 Jun 2016 13:30:29 
 * *     from Copybook: DTAR020.cbl
 * *           Dialect: FMT_MAINFRAME
 * *          Template: javaCbl2Xml
 * *             Split: SPLIT_NONE   
 * * File Organization: IO_FIXED_LENGTH   
 * *              Font: cp037
 * *   
 * *    CodeGen Author: Bruce Martin
 * *-----------------------------------------------------------------
 *                           
 *   This program was generated by the RecordEditor/CodeGen.
 *   It uses JRecord's Cobol2Xml programs to do the conversion. 
 *
 *   See:    RecordEditor   https://sourceforge.net/projects/record-editor/
 *           JRecord        https://sourceforge.net/projects/jrecord/  
 *           CobolToXml     https://sourceforge.net/projects/coboltoxml/  
 *
 *   Good Luck
 *              Bruce
 *
 * ------------------------------------------------------------------
 * v01  CodeGen        20 Jun 2016  Initial version
 *     (Bruce Martin)
 *
 * ------------------------------------------------------------------ 
 **/

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import net.sf.JRecord.cbl2xml.Cobol2Xml;
import net.sf.JRecord.Option.JRecordConstantVars;
	
public class Dtar020ToXml {

   public static void main(String[] args)
   throws IOException, JAXBException, XMLStreamException {
  
       JRecordConstantVars constants = Cobol2Xml.JR_CONSTANTS;
	
       Cobol2Xml.newCobol2Xml("G:/Users/Bruce01/RecordEditor_HSQL/CopyBook/Cobol/DTAR020.cbl")

                                        // Cobol Options
                        .setFileOrganization(constants.IO_FIXED_LENGTH)
                        .setDialect(constants.FMT_MAINFRAME)               
                        .setSplitCopybook(constants.SPLIT_NONE)      
                        .setFont("cp037")

             .cobol2xml("G:/Users/Bruce01/RecordEditor_HSQL/SampleFiles/DTAR020.bin", 
                        "G:/Users/Bruce01/RecordEditor_HSQL/SampleFiles/DTAR020.bin.xml");
   }
}

