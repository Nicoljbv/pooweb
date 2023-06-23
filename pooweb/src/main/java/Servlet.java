import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import figuras.Circulo;
import figuras.Hexagono;
import figuras.Rectangulo;
import figuras.Triangulo;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ingrese al servlet");
        String control = req.getParameter("control");

        switch (control) {
            case "circulo":
                req.getRequestDispatcher("Figuras/circulo.jsp").forward(req, resp);
                break;
            case "triangulo":
                req.getRequestDispatcher("Figuras/triangulo.jsp").forward(req, resp);
                break;
            case "rectangulo":
                req.getRequestDispatcher("Figuras/rectangulo.jsp").forward(req, resp);
                break;
            case "hexagono":
                req.getRequestDispatcher("Figuras/hexagono.jsp").forward(req, resp);
            default:
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Entre al post");

        String control = req.getParameter("control");

        switch (control) {
            case "areacir":
                double diametroA = Double.parseDouble(req.getParameter("diametro"));

                Circulo cr = new Circulo(diametroA);

                req.setAttribute("area", cr.calcularArea());
                req.getRequestDispatcher("Figuras/resultado.jsp").forward(req, resp);
                break;

            case "areatri":
                double baseTA = Double.parseDouble(req.getParameter("baseTA"));
                double alturaTA = Double.parseDouble(req.getParameter("alturaTA"));

                Triangulo tr = new Triangulo(baseTA, alturaTA);

                req.setAttribute("area", tr.calcularArea());
                req.getRequestDispatcher("Figuras/resultado.jsp").forward(req, resp);
                break;

            case "arearec":
                double baseRA = Double.parseDouble(req.getParameter("base"));
                double alturaRA = Double.parseDouble(req.getParameter("altura"));

                Rectangulo re = new Rectangulo(baseRA, alturaRA);

                req.setAttribute("area", re.calcularArea());
                req.getRequestDispatcher("Figuras/resultado.jsp").forward(req, resp);
                break;

            case "areahex":
                double ladoA = Double.parseDouble(req.getParameter("lado"));
                Hexagono hx = new Hexagono(ladoA);

                req.setAttribute("area", hx.calcularArea());
                req.getRequestDispatcher("Figuras/resultado.jsp").forward(req, resp);
                break;
            case "perimetrocir":
                double diametroP = Double.parseDouble(req.getParameter("diametro"));

                Circulo crp = new Circulo(diametroP);

                req.setAttribute("perimetro", crp.calcularPerimetro());
                req.getRequestDispatcher("Figuras/resultadoPerimetro.jsp").forward(req, resp);
                break;

            case "perimetrotri":
                double baseTP = Double.parseDouble(req.getParameter("baseTA"));
                double alturaTP = Double.parseDouble(req.getParameter("alturaTA"));

                Triangulo trp = new Triangulo(baseTP, alturaTP);

                req.setAttribute("perimetro", trp.calcularPerimetro());
                req.getRequestDispatcher("Figuras/resultadoPerimetro.jsp").forward(req, resp);
                break;

            case "perimetrorec":
                double baseRP = Double.parseDouble(req.getParameter("base"));
                double alturaRP = Double.parseDouble(req.getParameter("altura"));

                Rectangulo rep = new Rectangulo(baseRP, alturaRP);

                req.setAttribute("perimetro", rep.calcularPerimetro());
                req.getRequestDispatcher("Figuras/resultadoPerimetro.jsp").forward(req, resp);
                break;

            case "perimetrohex":
                double ladoP = Double.parseDouble(req.getParameter("lado"));
                Hexagono hxp = new Hexagono(ladoP);

                req.setAttribute("perimetro", hxp.calcularPerimetro());
                req.getRequestDispatcher("Figuras/resultadoPerimetro.jsp").forward(req, resp);
                break;

            default:
                break;
        }

    }
}
