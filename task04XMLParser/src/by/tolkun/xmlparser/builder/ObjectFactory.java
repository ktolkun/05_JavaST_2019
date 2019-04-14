//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2019.04.02 at 08:11:49 PM MSK
//


package by.tolkun.xmlparser.builder;

import by.tolkun.xmlparser.entity.medicine.Certificate;
import by.tolkun.xmlparser.entity.medicine.CertificateCompany;
import by.tolkun.xmlparser.entity.medicine.Company;
import by.tolkun.xmlparser.entity.medicine.Dosage;
import by.tolkun.xmlparser.entity.medicine.Medicine;
import by.tolkun.xmlparser.entity.medicine.Medicines;
import by.tolkun.xmlparser.entity.medicine.Package;
import by.tolkun.xmlparser.entity.medicine.Period;
import by.tolkun.xmlparser.entity.medicine.Price;
import by.tolkun.xmlparser.entity.medicine.Version;
import by.tolkun.xmlparser.entity.medicine.Versions;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the by.tolkun.xmlparser package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 * @author Kirill Tolkun
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: by.tolkun.xmlparser.
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Medicines}.
     *
     * @return object of class {@link Medicines}
     */
    public Medicines createMedicines() {
        return new Medicines();
    }

    /**
     * Create an instance of {@link Medicine}.
     *
     * @return object of class {@link Medicine}
     */
    public Medicine createMedicine() {
        return new Medicine();
    }

    /**
     * Create an instance of {@link Company}.
     *
     * @return object of class {@link Company}
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Period}.
     *
     * @return object of class {@link Period}
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link Dosage}.
     *
     * @return object of class {@link Dosage}
     */
    public Dosage createDosage() {
        return new Dosage();
    }

    /**
     * Create an instance of {@link Versions}.
     *
     * @return object of class {@link Versions}
     */
    public Versions createVersions() {
        return new Versions();
    }

    /**
     * Create an instance of {@link Version}.
     *
     * @return object of class {@link Version}
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link Price}.
     *
     * @return object of class {@link Price}
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link Package}.
     *
     * @return object of class {@link Package}
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link CertificateCompany}.
     *
     * @return object of class {@link CertificateCompany}
     */
    public CertificateCompany createCertificateCompany() {
        return new CertificateCompany();
    }

    /**
     * Create an instance of {@link Certificate}.
     *
     * @return object of class {@link Certificate}
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

}
