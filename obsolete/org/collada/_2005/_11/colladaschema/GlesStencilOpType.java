//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.04 at 10:53:39 PM CST 
//


package org.collada._2005._11.colladaschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gles_stencil_op_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gles_stencil_op_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEEP"/>
 *     &lt;enumeration value="ZERO"/>
 *     &lt;enumeration value="REPLACE"/>
 *     &lt;enumeration value="INCR"/>
 *     &lt;enumeration value="DECR"/>
 *     &lt;enumeration value="INVERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gles_stencil_op_type")
@XmlEnum
public enum GlesStencilOpType {

    KEEP,
    ZERO,
    REPLACE,
    INCR,
    DECR,
    INVERT;

    public String value() {
        return name();
    }

    public static GlesStencilOpType fromValue(String v) {
        return valueOf(v);
    }

}
