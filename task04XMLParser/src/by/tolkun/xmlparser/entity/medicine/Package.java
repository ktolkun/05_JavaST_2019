//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2019.04.02 at 08:11:49 PM MSK
//


package by.tolkun.xmlparser.entity.medicine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


/**
 * <p>Java class for Package complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="quantity"
 *         type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price"
 *         type="{http://www.tolkun.by/xmlparser}Price"/>
 *       &lt;/all>
 *       &lt;attribute name="type" use="required"
 *       type="{http://www.tolkun.by/xmlparser}PackageType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 * @author Kirill Tolkun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", propOrder = {

})
public class Package {

    /**
     * Logger of class {@code Package}.
     */
    private static final Logger LOGGER
            = LogManager.getLogger(Package.class);
    /**
     * Quantity of elements in package.
     */
    private int quantity;
    /**
     * Price of package.
     */
    @XmlElement(required = true)
    private Price price;
    /**
     * Type of package.
     */
    @XmlAttribute(name = "type", required = true)
    private PackageType type;

    /**
     * Default constructor.
     */
    public Package() {
        LOGGER.debug("Package created.");
    }

    /**
     * Gets the value of the quantity property.
     *
     * @return quantity elements in package
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     *
     * @param value the quantity of elements in package
     */
    public void setQuantity(final int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return possible object is
     * {@link Price }
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value allowed object is
     *              {@link Price }
     */
    public void setPrice(final Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link PackageType }
     */
    public PackageType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link PackageType }
     */
    public void setType(final PackageType value) {
        this.type = value;
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if the argument is not
     * {@code null} and is an {@code Package} object that
     * contains the same field values.
     *
     * @param o the object to compare with.
     * @return {@code true} if the objects are the same;
     * {@code false} otherwise.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Package aPackage = (Package) o;
        return quantity == aPackage.quantity
                && Objects.equals(price, aPackage.price)
                && type == aPackage.type;
    }

    /**
     * Returns a hash code for a {@code Package}.
     *
     * @return a hash code value for a {@code Package}.
     */
    @Override
    public int hashCode() {
        return Objects.hash(quantity, price, type);
    }

    /**
     * Returns a {@code String} object representing this
     * {@code Package}.
     *
     * @return a string representation of the information of this
     * object
     */
    @Override
    public String toString() {
        return "Package{"
                + "quantity=" + quantity
                + ", price=" + price
                + ", type=" + type
                + '}';
    }
}