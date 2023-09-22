
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.denariuscorebanking_web package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MensajeEntradaBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "MensajeEntradaBase");
    private final static QName _Cabecera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "Cabecera");
    private final static QName _MensajeSalidaBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "MensajeSalidaBase");
    private final static QName _MEIdentificacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "MEIdentificacionCliente");
    private final static QName _MensajeSalidaBaseCodigoError_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "CodigoError");
    private final static QName _MensajeSalidaBaseMensajeError_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "MensajeError");
    private final static QName _MensajeSalidaBaseNumeroTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "NumeroTransaccion");
    private final static QName _MEIdentificacionClienteCodigoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "CodigoProducto");
    private final static QName _MEIdentificacionClienteEstadoCivil_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "EstadoCivil");
    private final static QName _MEIdentificacionClienteIdentificacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "IdentificacionCliente");
    private final static QName _MEIdentificacionClienteIdentificacionConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "IdentificacionConyuge");
    private final static QName _MEIdentificacionClienteNivelEstudios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "NivelEstudios");
    private final static QName _MEIdentificacionClienteNivelEstudiosConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "NivelEstudiosConyuge");
    private final static QName _MEIdentificacionClienteRolCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "RolCliente");
    private final static QName _MEIdentificacionClienteTipoVivienda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "TipoVivienda");
    private final static QName _CabeceraCanal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "Canal");
    private final static QName _CabeceraIpMaquina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "IpMaquina");
    private final static QName _CabeceraKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "Key");
    private final static QName _CabeceraOrganizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "Organizacion");
    private final static QName _CabeceraUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", "Usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.denariuscorebanking_web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MensajeEntradaBase }
     * 
     */
    public MensajeEntradaBase createMensajeEntradaBase() {
        return new MensajeEntradaBase();
    }

    /**
     * Create an instance of {@link Cabecera }
     * 
     */
    public Cabecera createCabecera() {
        return new Cabecera();
    }

    /**
     * Create an instance of {@link MensajeSalidaBase }
     * 
     */
    public MensajeSalidaBase createMensajeSalidaBase() {
        return new MensajeSalidaBase();
    }

    /**
     * Create an instance of {@link MEIdentificacionCliente }
     * 
     */
    public MEIdentificacionCliente createMEIdentificacionCliente() {
        return new MEIdentificacionCliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "MensajeEntradaBase")
    public JAXBElement<MensajeEntradaBase> createMensajeEntradaBase(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_MensajeEntradaBase_QNAME, MensajeEntradaBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "Cabecera")
    public JAXBElement<Cabecera> createCabecera(Cabecera value) {
        return new JAXBElement<Cabecera>(_Cabecera_QNAME, Cabecera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "MensajeSalidaBase")
    public JAXBElement<MensajeSalidaBase> createMensajeSalidaBase(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_MensajeSalidaBase_QNAME, MensajeSalidaBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "MEIdentificacionCliente")
    public JAXBElement<MEIdentificacionCliente> createMEIdentificacionCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_MEIdentificacionCliente_QNAME, MEIdentificacionCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "Cabecera", scope = MensajeEntradaBase.class)
    public JAXBElement<Cabecera> createMensajeEntradaBaseCabecera(Cabecera value) {
        return new JAXBElement<Cabecera>(_Cabecera_QNAME, Cabecera.class, MensajeEntradaBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "CodigoError", scope = MensajeSalidaBase.class)
    public JAXBElement<Integer> createMensajeSalidaBaseCodigoError(Integer value) {
        return new JAXBElement<Integer>(_MensajeSalidaBaseCodigoError_QNAME, Integer.class, MensajeSalidaBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "MensajeError", scope = MensajeSalidaBase.class)
    public JAXBElement<String> createMensajeSalidaBaseMensajeError(String value) {
        return new JAXBElement<String>(_MensajeSalidaBaseMensajeError_QNAME, String.class, MensajeSalidaBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "NumeroTransaccion", scope = MensajeSalidaBase.class)
    public JAXBElement<String> createMensajeSalidaBaseNumeroTransaccion(String value) {
        return new JAXBElement<String>(_MensajeSalidaBaseNumeroTransaccion_QNAME, String.class, MensajeSalidaBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "CodigoProducto", scope = MEIdentificacionCliente.class)
    public JAXBElement<String> createMEIdentificacionClienteCodigoProducto(String value) {
        return new JAXBElement<String>(_MEIdentificacionClienteCodigoProducto_QNAME, String.class, MEIdentificacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "EstadoCivil", scope = MEIdentificacionCliente.class)
    public JAXBElement<String> createMEIdentificacionClienteEstadoCivil(String value) {
        return new JAXBElement<String>(_MEIdentificacionClienteEstadoCivil_QNAME, String.class, MEIdentificacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "IdentificacionCliente", scope = MEIdentificacionCliente.class)
    public JAXBElement<String> createMEIdentificacionClienteIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MEIdentificacionClienteIdentificacionCliente_QNAME, String.class, MEIdentificacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "IdentificacionConyuge", scope = MEIdentificacionCliente.class)
    public JAXBElement<String> createMEIdentificacionClienteIdentificacionConyuge(String value) {
        return new JAXBElement<String>(_MEIdentificacionClienteIdentificacionConyuge_QNAME, String.class, MEIdentificacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "NivelEstudios", scope = MEIdentificacionCliente.class)
    public JAXBElement<String> createMEIdentificacionClienteNivelEstudios(String value) {
        return new JAXBElement<String>(_MEIdentificacionClienteNivelEstudios_QNAME, String.class, MEIdentificacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "NivelEstudiosConyuge", scope = MEIdentificacionCliente.class)
    public JAXBElement<String> createMEIdentificacionClienteNivelEstudiosConyuge(String value) {
        return new JAXBElement<String>(_MEIdentificacionClienteNivelEstudiosConyuge_QNAME, String.class, MEIdentificacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "RolCliente", scope = MEIdentificacionCliente.class)
    public JAXBElement<String> createMEIdentificacionClienteRolCliente(String value) {
        return new JAXBElement<String>(_MEIdentificacionClienteRolCliente_QNAME, String.class, MEIdentificacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "TipoVivienda", scope = MEIdentificacionCliente.class)
    public JAXBElement<String> createMEIdentificacionClienteTipoVivienda(String value) {
        return new JAXBElement<String>(_MEIdentificacionClienteTipoVivienda_QNAME, String.class, MEIdentificacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "Canal", scope = Cabecera.class)
    public JAXBElement<String> createCabeceraCanal(String value) {
        return new JAXBElement<String>(_CabeceraCanal_QNAME, String.class, Cabecera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "IpMaquina", scope = Cabecera.class)
    public JAXBElement<String> createCabeceraIpMaquina(String value) {
        return new JAXBElement<String>(_CabeceraIpMaquina_QNAME, String.class, Cabecera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "Key", scope = Cabecera.class)
    public JAXBElement<String> createCabeceraKey(String value) {
        return new JAXBElement<String>(_CabeceraKey_QNAME, String.class, Cabecera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "Organizacion", scope = Cabecera.class)
    public JAXBElement<String> createCabeceraOrganizacion(String value) {
        return new JAXBElement<String>(_CabeceraOrganizacion_QNAME, String.class, Cabecera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", name = "Usuario", scope = Cabecera.class)
    public JAXBElement<String> createCabeceraUsuario(String value) {
        return new JAXBElement<String>(_CabeceraUsuario_QNAME, String.class, Cabecera.class, value);
    }

}
