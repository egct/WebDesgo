
package ec.com.desgo.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.com.desgo.servicios package. 
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

    private final static QName _AddEconomia_QNAME = new QName("http://servicios.desgo.com.ec/", "addEconomia");
    private final static QName _AddEconomiaResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "addEconomiaResponse");
    private final static QName _AsigUserFormulario_QNAME = new QName("http://servicios.desgo.com.ec/", "asigUserFormulario");
    private final static QName _AsigUserFormularioResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "asigUserFormularioResponse");
    private final static QName _BuscarCodigoFormulario_QNAME = new QName("http://servicios.desgo.com.ec/", "buscarCodigoFormulario");
    private final static QName _BuscarCodigoFormularioResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "buscarCodigoFormularioResponse");
    private final static QName _CambiopruebaAWS_QNAME = new QName("http://servicios.desgo.com.ec/", "cambiopruebaAWS");
    private final static QName _CambiopruebaAWSResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "cambiopruebaAWSResponse");
    private final static QName _Editarformulario_QNAME = new QName("http://servicios.desgo.com.ec/", "editarformulario");
    private final static QName _EditarformularioResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "editarformularioResponse");
    private final static QName _EliminarFormulario_QNAME = new QName("http://servicios.desgo.com.ec/", "eliminarFormulario");
    private final static QName _EliminarFormularioResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "eliminarFormularioResponse");
    private final static QName _Hello_QNAME = new QName("http://servicios.desgo.com.ec/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "helloResponse");
    private final static QName _InsertarDDescriptivosPredioIULote_QNAME = new QName("http://servicios.desgo.com.ec/", "insertarDDescriptivosPredio_IULote");
    private final static QName _InsertarDDescriptivosPredioIULoteResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "insertarDDescriptivosPredio_IULoteResponse");
    private final static QName _InsertarDireccionDDPLote_QNAME = new QName("http://servicios.desgo.com.ec/", "insertarDireccion_DDPLote");
    private final static QName _InsertarDireccionDDPLoteResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "insertarDireccion_DDPLoteResponse");
    private final static QName _InsertarIdentificacionUF_QNAME = new QName("http://servicios.desgo.com.ec/", "insertarIdentificacionU_F");
    private final static QName _InsertarIdentificacionUFResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "insertarIdentificacionU_FResponse");
    private final static QName _ListTodosFormIds_QNAME = new QName("http://servicios.desgo.com.ec/", "listTodosFormIds");
    private final static QName _ListTodosFormIdsResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "listTodosFormIdsResponse");
    private final static QName _ListarFormulario_QNAME = new QName("http://servicios.desgo.com.ec/", "listarFormulario");
    private final static QName _ListarFormularioInt_QNAME = new QName("http://servicios.desgo.com.ec/", "listarFormularioInt");
    private final static QName _ListarFormularioIntResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "listarFormularioIntResponse");
    private final static QName _ListarFormularioResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "listarFormularioResponse");
    private final static QName _ListarFormularios_QNAME = new QName("http://servicios.desgo.com.ec/", "listarFormularios");
    private final static QName _ListarFormulariosId_QNAME = new QName("http://servicios.desgo.com.ec/", "listarFormulariosId");
    private final static QName _ListarFormulariosIdResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "listarFormulariosIdResponse");
    private final static QName _ListarFormulariosResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "listarFormulariosResponse");
    private final static QName _ListarTodosFormulariosExp_QNAME = new QName("http://servicios.desgo.com.ec/", "listarTodosFormulariosExp");
    private final static QName _ListarTodosFormulariosExpResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "listarTodosFormulariosExpResponse");
    private final static QName _RegistarFormulario_QNAME = new QName("http://servicios.desgo.com.ec/", "registarFormulario");
    private final static QName _RegistarFormularioResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "registarFormularioResponse");
    private final static QName _TesterAcabados_QNAME = new QName("http://servicios.desgo.com.ec/", "testerAcabados");
    private final static QName _TesterAcabadosResponse_QNAME = new QName("http://servicios.desgo.com.ec/", "testerAcabadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.com.desgo.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEconomia }
     * 
     */
    public AddEconomia createAddEconomia() {
        return new AddEconomia();
    }

    /**
     * Create an instance of {@link AddEconomiaResponse }
     * 
     */
    public AddEconomiaResponse createAddEconomiaResponse() {
        return new AddEconomiaResponse();
    }

    /**
     * Create an instance of {@link AsigUserFormulario }
     * 
     */
    public AsigUserFormulario createAsigUserFormulario() {
        return new AsigUserFormulario();
    }

    /**
     * Create an instance of {@link AsigUserFormularioResponse }
     * 
     */
    public AsigUserFormularioResponse createAsigUserFormularioResponse() {
        return new AsigUserFormularioResponse();
    }

    /**
     * Create an instance of {@link BuscarCodigoFormulario }
     * 
     */
    public BuscarCodigoFormulario createBuscarCodigoFormulario() {
        return new BuscarCodigoFormulario();
    }

    /**
     * Create an instance of {@link BuscarCodigoFormularioResponse }
     * 
     */
    public BuscarCodigoFormularioResponse createBuscarCodigoFormularioResponse() {
        return new BuscarCodigoFormularioResponse();
    }

    /**
     * Create an instance of {@link CambiopruebaAWS }
     * 
     */
    public CambiopruebaAWS createCambiopruebaAWS() {
        return new CambiopruebaAWS();
    }

    /**
     * Create an instance of {@link CambiopruebaAWSResponse }
     * 
     */
    public CambiopruebaAWSResponse createCambiopruebaAWSResponse() {
        return new CambiopruebaAWSResponse();
    }

    /**
     * Create an instance of {@link Editarformulario }
     * 
     */
    public Editarformulario createEditarformulario() {
        return new Editarformulario();
    }

    /**
     * Create an instance of {@link EditarformularioResponse }
     * 
     */
    public EditarformularioResponse createEditarformularioResponse() {
        return new EditarformularioResponse();
    }

    /**
     * Create an instance of {@link EliminarFormulario }
     * 
     */
    public EliminarFormulario createEliminarFormulario() {
        return new EliminarFormulario();
    }

    /**
     * Create an instance of {@link EliminarFormularioResponse }
     * 
     */
    public EliminarFormularioResponse createEliminarFormularioResponse() {
        return new EliminarFormularioResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link InsertarDDescriptivosPredioIULote }
     * 
     */
    public InsertarDDescriptivosPredioIULote createInsertarDDescriptivosPredioIULote() {
        return new InsertarDDescriptivosPredioIULote();
    }

    /**
     * Create an instance of {@link InsertarDDescriptivosPredioIULoteResponse }
     * 
     */
    public InsertarDDescriptivosPredioIULoteResponse createInsertarDDescriptivosPredioIULoteResponse() {
        return new InsertarDDescriptivosPredioIULoteResponse();
    }

    /**
     * Create an instance of {@link InsertarDireccionDDPLote }
     * 
     */
    public InsertarDireccionDDPLote createInsertarDireccionDDPLote() {
        return new InsertarDireccionDDPLote();
    }

    /**
     * Create an instance of {@link InsertarDireccionDDPLoteResponse }
     * 
     */
    public InsertarDireccionDDPLoteResponse createInsertarDireccionDDPLoteResponse() {
        return new InsertarDireccionDDPLoteResponse();
    }

    /**
     * Create an instance of {@link InsertarIdentificacionUF }
     * 
     */
    public InsertarIdentificacionUF createInsertarIdentificacionUF() {
        return new InsertarIdentificacionUF();
    }

    /**
     * Create an instance of {@link InsertarIdentificacionUFResponse }
     * 
     */
    public InsertarIdentificacionUFResponse createInsertarIdentificacionUFResponse() {
        return new InsertarIdentificacionUFResponse();
    }

    /**
     * Create an instance of {@link ListTodosFormIds }
     * 
     */
    public ListTodosFormIds createListTodosFormIds() {
        return new ListTodosFormIds();
    }

    /**
     * Create an instance of {@link ListTodosFormIdsResponse }
     * 
     */
    public ListTodosFormIdsResponse createListTodosFormIdsResponse() {
        return new ListTodosFormIdsResponse();
    }

    /**
     * Create an instance of {@link ListarFormulario }
     * 
     */
    public ListarFormulario createListarFormulario() {
        return new ListarFormulario();
    }

    /**
     * Create an instance of {@link ListarFormularioInt }
     * 
     */
    public ListarFormularioInt createListarFormularioInt() {
        return new ListarFormularioInt();
    }

    /**
     * Create an instance of {@link ListarFormularioIntResponse }
     * 
     */
    public ListarFormularioIntResponse createListarFormularioIntResponse() {
        return new ListarFormularioIntResponse();
    }

    /**
     * Create an instance of {@link ListarFormularioResponse }
     * 
     */
    public ListarFormularioResponse createListarFormularioResponse() {
        return new ListarFormularioResponse();
    }

    /**
     * Create an instance of {@link ListarFormularios }
     * 
     */
    public ListarFormularios createListarFormularios() {
        return new ListarFormularios();
    }

    /**
     * Create an instance of {@link ListarFormulariosId }
     * 
     */
    public ListarFormulariosId createListarFormulariosId() {
        return new ListarFormulariosId();
    }

    /**
     * Create an instance of {@link ListarFormulariosIdResponse }
     * 
     */
    public ListarFormulariosIdResponse createListarFormulariosIdResponse() {
        return new ListarFormulariosIdResponse();
    }

    /**
     * Create an instance of {@link ListarFormulariosResponse }
     * 
     */
    public ListarFormulariosResponse createListarFormulariosResponse() {
        return new ListarFormulariosResponse();
    }

    /**
     * Create an instance of {@link ListarTodosFormulariosExp }
     * 
     */
    public ListarTodosFormulariosExp createListarTodosFormulariosExp() {
        return new ListarTodosFormulariosExp();
    }

    /**
     * Create an instance of {@link ListarTodosFormulariosExpResponse }
     * 
     */
    public ListarTodosFormulariosExpResponse createListarTodosFormulariosExpResponse() {
        return new ListarTodosFormulariosExpResponse();
    }

    /**
     * Create an instance of {@link RegistarFormulario }
     * 
     */
    public RegistarFormulario createRegistarFormulario() {
        return new RegistarFormulario();
    }

    /**
     * Create an instance of {@link RegistarFormularioResponse }
     * 
     */
    public RegistarFormularioResponse createRegistarFormularioResponse() {
        return new RegistarFormularioResponse();
    }

    /**
     * Create an instance of {@link TesterAcabados }
     * 
     */
    public TesterAcabados createTesterAcabados() {
        return new TesterAcabados();
    }

    /**
     * Create an instance of {@link TesterAcabadosResponse }
     * 
     */
    public TesterAcabadosResponse createTesterAcabadosResponse() {
        return new TesterAcabadosResponse();
    }

    /**
     * Create an instance of {@link Formulario }
     * 
     */
    public Formulario createFormulario() {
        return new Formulario();
    }

    /**
     * Create an instance of {@link CaracterizacionCF }
     * 
     */
    public CaracterizacionCF createCaracterizacionCF() {
        return new CaracterizacionCF();
    }

    /**
     * Create an instance of {@link CaracterizacionLF }
     * 
     */
    public CaracterizacionLF createCaracterizacionLF() {
        return new CaracterizacionLF();
    }

    /**
     * Create an instance of {@link EconomicaF }
     * 
     */
    public EconomicaF createEconomicaF() {
        return new EconomicaF();
    }

    /**
     * Create an instance of {@link ElementosCF }
     * 
     */
    public ElementosCF createElementosCF() {
        return new ElementosCF();
    }

    /**
     * Create an instance of {@link GraficosPF }
     * 
     */
    public GraficosPF createGraficosPF() {
        return new GraficosPF();
    }

    /**
     * Create an instance of {@link IdentificacionLF }
     * 
     */
    public IdentificacionLF createIdentificacionLF() {
        return new IdentificacionLF();
    }

    /**
     * Create an instance of {@link IdentificacionUF }
     * 
     */
    public IdentificacionUF createIdentificacionUF() {
        return new IdentificacionUF();
    }

    /**
     * Create an instance of {@link DDescriptivosPredioIULote }
     * 
     */
    public DDescriptivosPredioIULote createDDescriptivosPredioIULote() {
        return new DDescriptivosPredioIULote();
    }

    /**
     * Create an instance of {@link DireccionDDPLote }
     * 
     */
    public DireccionDDPLote createDireccionDDPLote() {
        return new DireccionDDPLote();
    }

    /**
     * Create an instance of {@link LimitesF }
     * 
     */
    public LimitesF createLimitesF() {
        return new LimitesF();
    }

    /**
     * Create an instance of {@link MapaF }
     * 
     */
    public MapaF createMapaF() {
        return new MapaF();
    }

    /**
     * Create an instance of {@link MejoraF }
     * 
     */
    public MejoraF createMejoraF() {
        return new MejoraF();
    }

    /**
     * Create an instance of {@link ResponsablesF }
     * 
     */
    public ResponsablesF createResponsablesF() {
        return new ResponsablesF();
    }

    /**
     * Create an instance of {@link ViviendaF }
     * 
     */
    public ViviendaF createViviendaF() {
        return new ViviendaF();
    }

    /**
     * Create an instance of {@link FormularioIds }
     * 
     */
    public FormularioIds createFormularioIds() {
        return new FormularioIds();
    }

    /**
     * Create an instance of {@link EconomiaLote }
     * 
     */
    public EconomiaLote createEconomiaLote() {
        return new EconomiaLote();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link TipoUsuario }
     * 
     */
    public TipoUsuario createTipoUsuario() {
        return new TipoUsuario();
    }

    /**
     * Create an instance of {@link AcabadosEC }
     * 
     */
    public AcabadosEC createAcabadosEC() {
        return new AcabadosEC();
    }

    /**
     * Create an instance of {@link PruebaAws }
     * 
     */
    public PruebaAws createPruebaAws() {
        return new PruebaAws();
    }

    /**
     * Create an instance of {@link HashMapClassForm }
     * 
     */
    public HashMapClassForm createHashMapClassForm() {
        return new HashMapClassForm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEconomia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "addEconomia")
    public JAXBElement<AddEconomia> createAddEconomia(AddEconomia value) {
        return new JAXBElement<AddEconomia>(_AddEconomia_QNAME, AddEconomia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEconomiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "addEconomiaResponse")
    public JAXBElement<AddEconomiaResponse> createAddEconomiaResponse(AddEconomiaResponse value) {
        return new JAXBElement<AddEconomiaResponse>(_AddEconomiaResponse_QNAME, AddEconomiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsigUserFormulario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "asigUserFormulario")
    public JAXBElement<AsigUserFormulario> createAsigUserFormulario(AsigUserFormulario value) {
        return new JAXBElement<AsigUserFormulario>(_AsigUserFormulario_QNAME, AsigUserFormulario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsigUserFormularioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "asigUserFormularioResponse")
    public JAXBElement<AsigUserFormularioResponse> createAsigUserFormularioResponse(AsigUserFormularioResponse value) {
        return new JAXBElement<AsigUserFormularioResponse>(_AsigUserFormularioResponse_QNAME, AsigUserFormularioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCodigoFormulario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "buscarCodigoFormulario")
    public JAXBElement<BuscarCodigoFormulario> createBuscarCodigoFormulario(BuscarCodigoFormulario value) {
        return new JAXBElement<BuscarCodigoFormulario>(_BuscarCodigoFormulario_QNAME, BuscarCodigoFormulario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCodigoFormularioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "buscarCodigoFormularioResponse")
    public JAXBElement<BuscarCodigoFormularioResponse> createBuscarCodigoFormularioResponse(BuscarCodigoFormularioResponse value) {
        return new JAXBElement<BuscarCodigoFormularioResponse>(_BuscarCodigoFormularioResponse_QNAME, BuscarCodigoFormularioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiopruebaAWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "cambiopruebaAWS")
    public JAXBElement<CambiopruebaAWS> createCambiopruebaAWS(CambiopruebaAWS value) {
        return new JAXBElement<CambiopruebaAWS>(_CambiopruebaAWS_QNAME, CambiopruebaAWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiopruebaAWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "cambiopruebaAWSResponse")
    public JAXBElement<CambiopruebaAWSResponse> createCambiopruebaAWSResponse(CambiopruebaAWSResponse value) {
        return new JAXBElement<CambiopruebaAWSResponse>(_CambiopruebaAWSResponse_QNAME, CambiopruebaAWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editarformulario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "editarformulario")
    public JAXBElement<Editarformulario> createEditarformulario(Editarformulario value) {
        return new JAXBElement<Editarformulario>(_Editarformulario_QNAME, Editarformulario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarformularioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "editarformularioResponse")
    public JAXBElement<EditarformularioResponse> createEditarformularioResponse(EditarformularioResponse value) {
        return new JAXBElement<EditarformularioResponse>(_EditarformularioResponse_QNAME, EditarformularioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarFormulario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "eliminarFormulario")
    public JAXBElement<EliminarFormulario> createEliminarFormulario(EliminarFormulario value) {
        return new JAXBElement<EliminarFormulario>(_EliminarFormulario_QNAME, EliminarFormulario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarFormularioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "eliminarFormularioResponse")
    public JAXBElement<EliminarFormularioResponse> createEliminarFormularioResponse(EliminarFormularioResponse value) {
        return new JAXBElement<EliminarFormularioResponse>(_EliminarFormularioResponse_QNAME, EliminarFormularioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDDescriptivosPredioIULote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "insertarDDescriptivosPredio_IULote")
    public JAXBElement<InsertarDDescriptivosPredioIULote> createInsertarDDescriptivosPredioIULote(InsertarDDescriptivosPredioIULote value) {
        return new JAXBElement<InsertarDDescriptivosPredioIULote>(_InsertarDDescriptivosPredioIULote_QNAME, InsertarDDescriptivosPredioIULote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDDescriptivosPredioIULoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "insertarDDescriptivosPredio_IULoteResponse")
    public JAXBElement<InsertarDDescriptivosPredioIULoteResponse> createInsertarDDescriptivosPredioIULoteResponse(InsertarDDescriptivosPredioIULoteResponse value) {
        return new JAXBElement<InsertarDDescriptivosPredioIULoteResponse>(_InsertarDDescriptivosPredioIULoteResponse_QNAME, InsertarDDescriptivosPredioIULoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDireccionDDPLote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "insertarDireccion_DDPLote")
    public JAXBElement<InsertarDireccionDDPLote> createInsertarDireccionDDPLote(InsertarDireccionDDPLote value) {
        return new JAXBElement<InsertarDireccionDDPLote>(_InsertarDireccionDDPLote_QNAME, InsertarDireccionDDPLote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDireccionDDPLoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "insertarDireccion_DDPLoteResponse")
    public JAXBElement<InsertarDireccionDDPLoteResponse> createInsertarDireccionDDPLoteResponse(InsertarDireccionDDPLoteResponse value) {
        return new JAXBElement<InsertarDireccionDDPLoteResponse>(_InsertarDireccionDDPLoteResponse_QNAME, InsertarDireccionDDPLoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarIdentificacionUF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "insertarIdentificacionU_F")
    public JAXBElement<InsertarIdentificacionUF> createInsertarIdentificacionUF(InsertarIdentificacionUF value) {
        return new JAXBElement<InsertarIdentificacionUF>(_InsertarIdentificacionUF_QNAME, InsertarIdentificacionUF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarIdentificacionUFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "insertarIdentificacionU_FResponse")
    public JAXBElement<InsertarIdentificacionUFResponse> createInsertarIdentificacionUFResponse(InsertarIdentificacionUFResponse value) {
        return new JAXBElement<InsertarIdentificacionUFResponse>(_InsertarIdentificacionUFResponse_QNAME, InsertarIdentificacionUFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTodosFormIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listTodosFormIds")
    public JAXBElement<ListTodosFormIds> createListTodosFormIds(ListTodosFormIds value) {
        return new JAXBElement<ListTodosFormIds>(_ListTodosFormIds_QNAME, ListTodosFormIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTodosFormIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listTodosFormIdsResponse")
    public JAXBElement<ListTodosFormIdsResponse> createListTodosFormIdsResponse(ListTodosFormIdsResponse value) {
        return new JAXBElement<ListTodosFormIdsResponse>(_ListTodosFormIdsResponse_QNAME, ListTodosFormIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormulario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarFormulario")
    public JAXBElement<ListarFormulario> createListarFormulario(ListarFormulario value) {
        return new JAXBElement<ListarFormulario>(_ListarFormulario_QNAME, ListarFormulario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormularioInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarFormularioInt")
    public JAXBElement<ListarFormularioInt> createListarFormularioInt(ListarFormularioInt value) {
        return new JAXBElement<ListarFormularioInt>(_ListarFormularioInt_QNAME, ListarFormularioInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormularioIntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarFormularioIntResponse")
    public JAXBElement<ListarFormularioIntResponse> createListarFormularioIntResponse(ListarFormularioIntResponse value) {
        return new JAXBElement<ListarFormularioIntResponse>(_ListarFormularioIntResponse_QNAME, ListarFormularioIntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormularioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarFormularioResponse")
    public JAXBElement<ListarFormularioResponse> createListarFormularioResponse(ListarFormularioResponse value) {
        return new JAXBElement<ListarFormularioResponse>(_ListarFormularioResponse_QNAME, ListarFormularioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormularios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarFormularios")
    public JAXBElement<ListarFormularios> createListarFormularios(ListarFormularios value) {
        return new JAXBElement<ListarFormularios>(_ListarFormularios_QNAME, ListarFormularios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormulariosId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarFormulariosId")
    public JAXBElement<ListarFormulariosId> createListarFormulariosId(ListarFormulariosId value) {
        return new JAXBElement<ListarFormulariosId>(_ListarFormulariosId_QNAME, ListarFormulariosId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormulariosIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarFormulariosIdResponse")
    public JAXBElement<ListarFormulariosIdResponse> createListarFormulariosIdResponse(ListarFormulariosIdResponse value) {
        return new JAXBElement<ListarFormulariosIdResponse>(_ListarFormulariosIdResponse_QNAME, ListarFormulariosIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormulariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarFormulariosResponse")
    public JAXBElement<ListarFormulariosResponse> createListarFormulariosResponse(ListarFormulariosResponse value) {
        return new JAXBElement<ListarFormulariosResponse>(_ListarFormulariosResponse_QNAME, ListarFormulariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodosFormulariosExp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarTodosFormulariosExp")
    public JAXBElement<ListarTodosFormulariosExp> createListarTodosFormulariosExp(ListarTodosFormulariosExp value) {
        return new JAXBElement<ListarTodosFormulariosExp>(_ListarTodosFormulariosExp_QNAME, ListarTodosFormulariosExp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodosFormulariosExpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "listarTodosFormulariosExpResponse")
    public JAXBElement<ListarTodosFormulariosExpResponse> createListarTodosFormulariosExpResponse(ListarTodosFormulariosExpResponse value) {
        return new JAXBElement<ListarTodosFormulariosExpResponse>(_ListarTodosFormulariosExpResponse_QNAME, ListarTodosFormulariosExpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistarFormulario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "registarFormulario")
    public JAXBElement<RegistarFormulario> createRegistarFormulario(RegistarFormulario value) {
        return new JAXBElement<RegistarFormulario>(_RegistarFormulario_QNAME, RegistarFormulario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistarFormularioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "registarFormularioResponse")
    public JAXBElement<RegistarFormularioResponse> createRegistarFormularioResponse(RegistarFormularioResponse value) {
        return new JAXBElement<RegistarFormularioResponse>(_RegistarFormularioResponse_QNAME, RegistarFormularioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TesterAcabados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "testerAcabados")
    public JAXBElement<TesterAcabados> createTesterAcabados(TesterAcabados value) {
        return new JAXBElement<TesterAcabados>(_TesterAcabados_QNAME, TesterAcabados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TesterAcabadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.desgo.com.ec/", name = "testerAcabadosResponse")
    public JAXBElement<TesterAcabadosResponse> createTesterAcabadosResponse(TesterAcabadosResponse value) {
        return new JAXBElement<TesterAcabadosResponse>(_TesterAcabadosResponse_QNAME, TesterAcabadosResponse.class, null, value);
    }

}
