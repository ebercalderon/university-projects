package Principal;

import ConexionSQL.ConexionMySQL;
import Entidades.*;
import Frames.MainLogin;
import Sistema.Sistema;
import Estructuras.*;
import Ventanas.Ingreso.Bienvenida;

public class PROYECTO {

    public static void main(String[] args) {

        Bienvenida inicio = new Bienvenida();
        inicio.setVisible(true);
        ConexionMySQL cn = new ConexionMySQL();
        cn.conexion();

        Empleado e01 = new Empleado("Usuario01", "123", "Dulce", "Huamani", "75183220", 0, "Administradora");
        ArbolGeneral arbol = new ArbolGeneral(e01);

        Empleado e02 = new Empleado("Usuario02", "234", "Flor", "Molina", "63259862", 1, "Cocinero");
        Empleado e03 = new Empleado("Usuario03", "345", "Laura", "Gozme", "05635974", 2, "Cocinero");
        Empleado e04 = new Empleado("Usuario04", "456", "Diego", "Olivera", "74113267", 3, "Cocinero");
        Empleado e05 = new Empleado("Usuario05", "567", "Ana", "Chamorro", "56984825", 4, "Cocinero");
        Empleado e06 = new Empleado("Usuario06", "678", "Alexander", "Torres", "63569210", 5, "Cocinero");
        Empleado e07 = new Empleado("Usuario07", "789", "Andy", "Sanchez", "25263120", 6, "Cocinero");
        Empleado e08 = new Empleado("Usuario08", "890", "Manuel", "Hernandez", "36935689", 7, "Cocinero");
        Empleado e09 = new Empleado("Usuario09", "901", "Alexia", "Espinoza", "04015286", 8, "Cocinero");
        Empleado e10 = new Empleado("Usuario10", "012", "Diana", "Centeno", "56239048", 9, "Cocinero");

        Sistema.empleado.agregar(e01);
        Sistema.empleado.agregar(e02);
        Sistema.empleado.agregar(e03);
        Sistema.empleado.agregar(e04);
        Sistema.empleado.agregar(e05);
        Sistema.empleado.agregar(e06);
        Sistema.empleado.agregar(e07);
        Sistema.empleado.agregar(e08);
        Sistema.empleado.agregar(e09);
        Sistema.empleado.agregar(e10);

        arbol.insertar(e02);
        arbol.insertar(e03);
        arbol.insertar(e04);
        arbol.insertar(e05);
        arbol.insertar(e06);
        arbol.insertar(e07);
        arbol.insertar(e08);
        arbol.insertar(e09);

        Producto bebida01 = new Producto("0000", "Coca Cola ", "1.5 L", 10);
        Producto bebida02 = new Producto("0000", "Chicha Galonera ", "1.9L", 26);
        Sistema.bebidas.insertar(bebida01);
        Sistema.bebidas.insertar(bebida02);

        //SerializadoraGen.serializarBebidas("bebidas.txt", Sistema.bebidas);
        Producto brasa01 = new Producto("0000", "Un cuarto de pollo Mediterraneo",
                "¼ pollo a la brasa + papas fritas o ensalada clásica o campestre personal. Salsas: ají Mediterráneo y mayonesa", 18);
        Producto brasa02 = new Producto("0000", "Medio pollo Mediterraneo",
                "½ pollo a la brasa + papas fritas medianas o ensalada clásica o campestre mediana. Salsas: ají Mediterráneo, mayonesa y vinagreta de la casa.", 40);
        Sistema.brasas.insertar(brasa01);
        Sistema.brasas.insertar(brasa02);

        Producto carta01 = new Producto("0000", "Anticuchos de corazón",
                "3 palitos de anticucho, 2 unidades en cada uno, papas doradas y choclito criollo. Salsas: ají Mediterráneo y mayonesa", 25);
        Producto carta02 = new Producto("0000", "Lomo Saltado",
                "Tradicional lomo flambeado y jugoso acompañado de arroz con choclo y papas fritas. Salsa de ají Mediterráneo", 21);
        Sistema.cartas.insertar(carta01);
        Sistema.cartas.insertar(carta02);

        Producto ensalada01 = new Producto("0000", "Ensalada campestre mediana",
                "Ensalada de suaves verduras como vainita, zanahoria y beterraga. Salsa: vinagreta de la casa", 15);
        Producto ensalada02 = new Producto("0000", "Ensalada clásica mediana",
                "Ensalada de lechuga, tomate, cebolla y palta. Salsa: aliño de vinagre", 18);
        Sistema.ensaladas.insertar(ensalada01);
        Sistema.ensaladas.insertar(ensalada02);

        Producto entrada01 = new Producto("0000", "Yuquitas artesanales x12 uds",
                "Yuquitas crocantes, sancochadas y fritas en bastones. Salsa de ají Mediterráneo", 21);
        Producto entrada02 = new Producto("0000", "Tequeños de ají de gallina x6 uds",
                "Tequeños bien rellenos de ají de gallina. Salsa de ají Mediterráneo", 18);
        Sistema.entradas.insertar(entrada01);
        Sistema.entradas.insertar(entrada02);

        Producto guarnicion01 = new Producto("0000", "Papas fritas familiar",
                "1 caja familiar de papas fritas ondeadas. Salsas: ají Mediterráneo y mayonesa", 15);
        Producto guarnicion02 = new Producto("0000", "Porcion de arroz",
                "Arroz con choclo", 12);
        Sistema.guarniciones.insertar(guarnicion01);
        Sistema.guarniciones.insertar(guarnicion02);

    }
}
