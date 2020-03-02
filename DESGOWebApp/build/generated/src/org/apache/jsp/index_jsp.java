package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" class=\"no-js\">\r\n");
      out.write("    <head>\r\n");
      out.write("       \r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \r\n");
      out.write("        <title>DESGO Website</title>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Login/images/icons/Desgo.ico\"/>\r\n");
      out.write("        <meta name=\"description\" content=\"A sidebar menu as seen on the Google Nexus 7 website\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"google nexus 7 menu, css transitions, sidebar, side menu, slide out menu\" />\r\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\r\n");
      out.write("        <!--\t\t<link rel=\"shortcut icon\" href=\"../favicon.ico\">!-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Menu/css/normalize.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Menu/css/demo.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Menu/css/component.css\" />\r\n");
      out.write("        <script src=\"Menu/js/modernizr.custom.js\"></script>\r\n");
      out.write("        <link href=\"Index/css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--Contenedor general del tema del menu-->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <!--Permite hacer una lista en donde se encuentran todas las opciones del menu-->\r\n");
      out.write("            <ul id=\"gn-menu\" class=\"gn-menu-main\">\r\n");
      out.write("\r\n");
      out.write("                <li style=\"float: left\">\r\n");
      out.write("                    <h6 style=\"font-size: 150% \">&nbsp;DESGO</h6>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li >\r\n");
      out.write("                    <h6>&nbsp;</h6>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li style=\"float: left\">\r\n");
      out.write("                    <h6 style=\"font-size: 150% \">&nbsp;<button class=\"iniciar\" id=\"iniciar\" onclick=\"location.href = 'login.jsp'\">Iniciar Sesión</button></h6>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <header>\r\n");
      out.write("                <!--Spam o link de los trabajos a futuro que tendra la empresa-->\r\n");
      out.write("                <h1>DESGO Website<span>Futuros proyectos <a href=\"http://www.google.com/nexus/index.html\">DESGO</a>...</span></h1>\t\r\n");
      out.write("\r\n");
      out.write("            </header> \r\n");
      out.write("        </div><!-- Fin del container -->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    <footer style=\"width:100%; max-width:100%; margin: 0px auto; position: relative; text-align: justify; \">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-footer-all\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-body\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"colum1\">\r\n");
      out.write("                    <h1>Mas informacion de la compañia</h1>\r\n");
      out.write("\r\n");
      out.write("                    <p>La empresa DESGO es una iniciativa que realiza su actividad en el\r\n");
      out.write("                        ámbito del desarrollo de aplicaciones web y móviles integradas, \r\n");
      out.write("                        enfocados en las áreas geográfica, ambiental y social; así mismo \r\n");
      out.write("                        como explora en nuevas tecnologías aplicables a la elaboración de \r\n");
      out.write("                        geoportales y análisis de big data.\r\n");
      out.write("\r\n");
      out.write("                        DESGO brinda un espacio para la creación de nuevas ideas que \r\n");
      out.write("                        potencialice a la juventud con el objetivo de integrar grupos \r\n");
      out.write("                        multidisciplinarios que desarrollen productos para el beneficio\r\n");
      out.write("                        de la comunidad y el progreso del país\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"colum2\">\r\n");
      out.write("\r\n");
      out.write("                    <h1>Redes Sociales</h1>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\" >\r\n");
      out.write("                        <img src=\"Menu/icon/facebook.png\" >\r\n");
      out.write("                        <a href=\"https://www.facebook.com/\">\r\n");
      out.write("                            <label>Siguenos en Facebook</label>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <img src=\"Menu/icon/twitter.png\">\r\n");
      out.write("                        <a href=\"https://www.Twitter.com/\">\r\n");
      out.write("                            <label>Siguenos en Twitter</label>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <img src=\"Menu/icon/instagram.png\">\r\n");
      out.write("                        <a href=\"https://www.Instagram.com/\">\r\n");
      out.write("                            <label>Siguenos en Instagram</label>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <img src=\"Menu/icon/google-plus.png\">\r\n");
      out.write("                        <a href=\"https://www.Instagram.com/\">\r\n");
      out.write("                            <label>Siguenos en Google Plus</label>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <img src=\"Menu/icon/pinterest.png\">\r\n");
      out.write("                        <label>Siguenos en Pinteres</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"colum3\">\r\n");
      out.write("\r\n");
      out.write("                    <h1>Informacion Contactos</h1>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row2\">\r\n");
      out.write("                        <img src=\"Menu/icon/house.png\">\r\n");
      out.write("                        <label>Florinda de Alvear y \r\n");
      out.write("                            Joaquín Gallegos Lara E17-25</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row2\">\r\n");
      out.write("                        <img src=\"Menu/icon/smartphone.png\">\r\n");
      out.write("                        <label>0997589895</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row2\">\r\n");
      out.write("                        <img src=\"Menu/icon/contact.png\">\r\n");
      out.write("                        <label>desgoecuador@outlook.com</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-footer\">\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    © 2019 Todos los Derechos Reservados | <a href=\"\">DESGO</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"information\">\r\n");
      out.write("                    <a href=\"\">Informacion Compañia</a> | <a href=\"\">Privacion y Politica</a> | <a href=\"\">Terminos y Condiciones</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </footer>  \r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Menu/css/estilos.css\">    \r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
