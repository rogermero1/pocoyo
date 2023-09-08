
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAccionistaAdministrador;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEActivo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECertificadoRelacionesComerciales;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaCelular;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaClientesCondiciones;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreacionCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreacionClienteResumido;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosCodigoSeguridad;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosContacto;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosEspecificosCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDireccion;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEEmpleo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEFormularioOrigenFondos;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEFuncionario;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEIdentificacion;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInformacionFinancieraCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInformacionMicroempresa;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEPasivo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEPasivos;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEReferenciasPersonales;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERelacion;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERelacionCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERubroEmpleo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METelefono;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEUsoDatosPersonales;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEVinculado;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MeDatosCliente;


/**
 * <p>Clase Java para MensajeEntradaBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MensajeEntradaBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}Cabecera" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensajeEntradaBase", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    MECreacionCliente.class,
    MEConsultasCliente.class,
    MEDireccion.class,
    METelefono.class,
    MEConsultaCelular.class,
    MEConsultaClientesCondiciones.class,
    MeDatosCliente.class,
    MEDatosCodigoSeguridad.class,
    MEEmpleo.class,
    MEReferenciasPersonales.class,
    MEInformacionFinancieraCliente.class,
    MEDatosContacto.class,
    MEDatosEspecificosCliente.class,
    MECreacionClienteResumido.class,
    MEIdentificacion.class,
    MEFormularioOrigenFondos.class,
    MEActivo.class,
    MERubroEmpleo.class,
    MEInformacionMicroempresa.class,
    MEPasivo.class,
    MEPasivos.class,
    MERelacion.class,
    MECertificadoRelacionesComerciales.class,
    MEFuncionario.class,
    MEVinculado.class,
    MERelacionCliente.class,
    MEAccionistaAdministrador.class,
    MEUsoDatosPersonales.class,
    MEIdentificacionCliente.class
})
public class MensajeEntradaBase {

    @XmlElementRef(name = "Cabecera", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Cabecera> cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     *     
     */
    public JAXBElement<Cabecera> getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     *     
     */
    public void setCabecera(JAXBElement<Cabecera> value) {
        this.cabecera = value;
    }

}
