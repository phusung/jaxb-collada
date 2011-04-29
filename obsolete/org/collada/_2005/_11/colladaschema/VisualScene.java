//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.04 at 10:53:39 PM CST 
//


package org.collada._2005._11.colladaschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}node" maxOccurs="unbounded"/>
 *         &lt;element name="evaluate_scene" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="render" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="layer" type="{http://www.w3.org/2001/XMLSchema}NCName" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_effect" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="camera_node" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "nodes",
    "evaluateScenes",
    "extras"
})
@XmlRootElement(name = "visual_scene")
public class VisualScene {

    protected Asset asset;
    @XmlElement(name = "node", required = true)
    protected List<Node> nodes;
    @XmlElement(name = "evaluate_scene")
    protected List<VisualScene.EvaluateScene> evaluateScenes;
    @XmlElement(name = "extra")
    protected List<Extra> extras;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * 
     * 						The visual_scene element may contain an asset element.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    public Asset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    public void setAsset(Asset value) {
        this.asset = value;
    }

    /**
     * 
     * 						The visual_scene element must have at least one node element.
     * 						Gets the value of the nodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Node }
     * 
     * 
     */
    public List<Node> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }

    /**
     * Gets the value of the evaluateScenes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluateScenes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluateScenes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualScene.EvaluateScene }
     * 
     * 
     */
    public List<VisualScene.EvaluateScene> getEvaluateScenes() {
        if (evaluateScenes == null) {
            evaluateScenes = new ArrayList<VisualScene.EvaluateScene>();
        }
        return this.evaluateScenes;
    }

    /**
     * 
     * 						The extra element may appear any number of times.
     * 						Gets the value of the extras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extra }
     * 
     * 
     */
    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="render" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="layer" type="{http://www.w3.org/2001/XMLSchema}NCName" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_effect" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="camera_node" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "renders"
    })
    public static class EvaluateScene {

        @XmlElement(name = "render", required = true)
        protected List<VisualScene.EvaluateScene.Render> renders;
        @XmlAttribute(name = "name")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String name;

        /**
         * Gets the value of the renders property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the renders property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRenders().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VisualScene.EvaluateScene.Render }
         * 
         * 
         */
        public List<VisualScene.EvaluateScene.Render> getRenders() {
            if (renders == null) {
                renders = new ArrayList<VisualScene.EvaluateScene.Render>();
            }
            return this.renders;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="layer" type="{http://www.w3.org/2001/XMLSchema}NCName" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_effect" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="camera_node" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "layers",
            "instanceEffect"
        })
        public static class Render {

            @XmlElement(name = "layer")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected List<String> layers;
            @XmlElement(name = "instance_effect")
            protected InstanceEffect instanceEffect;
            @XmlAttribute(name = "camera_node", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String cameraNode;

            /**
             * Gets the value of the layers property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the layers property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLayers().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getLayers() {
                if (layers == null) {
                    layers = new ArrayList<String>();
                }
                return this.layers;
            }

            /**
             * 
             * 												The instance_effect element specifies which effect to render in this compositing step 
             * 												while evaluating the scene.
             * 												
             * 
             * @return
             *     possible object is
             *     {@link InstanceEffect }
             *     
             */
            public InstanceEffect getInstanceEffect() {
                return instanceEffect;
            }

            /**
             * Sets the value of the instanceEffect property.
             * 
             * @param value
             *     allowed object is
             *     {@link InstanceEffect }
             *     
             */
            public void setInstanceEffect(InstanceEffect value) {
                this.instanceEffect = value;
            }

            /**
             * Gets the value of the cameraNode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCameraNode() {
                return cameraNode;
            }

            /**
             * Sets the value of the cameraNode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCameraNode(String value) {
                this.cameraNode = value;
            }

        }

    }

}
