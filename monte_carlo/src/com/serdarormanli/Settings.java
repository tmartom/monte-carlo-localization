/*******************************************************************************
 * Copyright (c) 2013 Serdar Ormanlı.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Serdar Ormanlı - initial API and implementation
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.28 at 09:21:59 PM EET 
//


package com.serdarormanli;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="defaultmap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="map" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="corner" maxOccurs="unbounded" minOccurs="3">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sensorrange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numofparticles" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="orientationnoise" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="movenoise" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sensornoise" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "defaultmap",
    "map",
    "sensorrange",
    "numofparticles",
    "orientationnoise",
    "movenoise",
    "sensornoise"
})
@XmlRootElement(name = "settings")
public class Settings {

    @XmlElement(required = true)
    protected String defaultmap;
    @XmlElement(required = true)
    protected List<Settings.Map> map;
    protected double sensorrange;
    protected short numofparticles;
    protected double orientationnoise;
    protected double movenoise;
    protected double sensornoise;

    /**
     * Gets the value of the defaultmap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultmap() {
        return defaultmap;
    }

    /**
     * Sets the value of the defaultmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultmap(String value) {
        this.defaultmap = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the map property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Settings.Map }
     * 
     * 
     */
    public List<Settings.Map> getMap() {
        if (map == null) {
            map = new ArrayList<Settings.Map>();
        }
        return this.map;
    }

    /**
     * Gets the value of the sensorrange property.
     * 
     */
    public double getSensorrange() {
        return sensorrange;
    }

    /**
     * Sets the value of the sensorrange property.
     * 
     */
    public void setSensorrange(double value) {
        this.sensorrange = value;
    }

    /**
     * Gets the value of the numofparticles property.
     * 
     */
    public short getNumofparticles() {
        return numofparticles;
    }

    /**
     * Sets the value of the numofparticles property.
     * 
     */
    public void setNumofparticles(short value) {
        this.numofparticles = value;
    }

    /**
     * Gets the value of the orientationnoise property.
     * 
     */
    public double getOrientationnoise() {
        return orientationnoise;
    }

    /**
     * Sets the value of the orientationnoise property.
     * 
     */
    public void setOrientationnoise(double value) {
        this.orientationnoise = value;
    }

    /**
     * Gets the value of the movenoise property.
     * 
     */
    public double getMovenoise() {
        return movenoise;
    }

    /**
     * Sets the value of the movenoise property.
     * 
     */
    public void setMovenoise(double value) {
        this.movenoise = value;
    }

    /**
     * Gets the value of the sensornoise property.
     * 
     */
    public double getSensornoise() {
        return sensornoise;
    }

    /**
     * Sets the value of the sensornoise property.
     * 
     */
    public void setSensornoise(double value) {
        this.sensornoise = value;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="corner" maxOccurs="unbounded" minOccurs="3">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "corner"
    })
    public static class Map {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected List<Settings.Map.Corner> corner;

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
         * Gets the value of the corner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the corner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Settings.Map.Corner }
         * 
         * 
         */
        public List<Settings.Map.Corner> getCorner() {
            if (corner == null) {
                corner = new ArrayList<Settings.Map.Corner>();
            }
            return this.corner;
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
         *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "x",
            "y"
        })
        public static class Corner {

            protected short x;
            protected short y;

            /**
             * Gets the value of the x property.
             * 
             */
            public short getX() {
                return x;
            }

            /**
             * Sets the value of the x property.
             * 
             */
            public void setX(short value) {
                this.x = value;
            }

            /**
             * Gets the value of the y property.
             * 
             */
            public short getY() {
                return y;
            }

            /**
             * Sets the value of the y property.
             * 
             */
            public void setY(short value) {
                this.y = value;
            }

        }

    }

}