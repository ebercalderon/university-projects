
package vista;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Shape;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import java.util.Random;


public class Paint extends JFrame implements ActionListener {

    JMenu archivo, dibujar, ayuda;
    JMenuItem acerca, salir, nuevo, guardar, abrir, color;
    JRadioButtonMenuItem linea, rectangulo, elipse;
    JCheckBoxMenuItem relleno;
    JColorChooser colorChooser = new JColorChooser();
    ButtonGroup btn;
    MiPanel miPanel;

    public Paint() {
        creamenu();
        addlisteners();
        miPanel = new MiPanel();
        this.add(miPanel);
        this.setSize(800, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Paint :'v");
    }

    private void addlisteners() {
        acerca.addActionListener(this);
        salir.addActionListener(this);
        nuevo.addActionListener(this);
        guardar.addActionListener(this);
        abrir.addActionListener(this);
        color.addActionListener(this);
        linea.addActionListener(this);
        rectangulo.addActionListener(this);
        elipse.addActionListener(this);
        relleno.addActionListener(this);
    }

    public void creamenu() {//creamos los botones que tendrá la pantalla
        JMenuBar menu = new JMenuBar();
        archivo = new JMenu("Archivazo");
        nuevo = new JMenuItem("Niu");
        abrir = new JMenuItem("Abrir ya existente");
        guardar = new JMenuItem("Guardar como...");
        salir = new JMenuItem("Salir");
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(salir);
        menu.add(archivo);
        dibujar = new JMenu("Dibujar chido");
        btn = new ButtonGroup();
        linea = new JRadioButtonMenuItem("Lineaza");
        rectangulo = new JRadioButtonMenuItem("Rectangulichi");
        elipse = new JRadioButtonMenuItem("Elipsuki");
        btn.add(elipse);
        btn.add(rectangulo);
        btn.add(linea);
        btn.setSelected(linea.getModel(), true);
        relleno = new JCheckBoxMenuItem("Rellenazo");
        color = new JMenuItem("Colorzuki");
        dibujar.add(linea);
        dibujar.add(rectangulo);
        dibujar.add(elipse);
        dibujar.add(relleno);
        dibujar.add(color);
        menu.add(dibujar);
        ayuda = new JMenu("mas");
        acerca = new JMenuItem("Powered by:");
        ayuda.add(acerca);
        menu.add(ayuda);
        this.setJMenuBar(menu);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nuevo) {
            miPanel.resetAll();
        }
        if (e.getSource() == abrir) {
            miPanel.abrir();
        }
        if (e.getSource() == guardar) {
            miPanel.guardar();
        }
        if (e.getSource() == salir) {
            System.exit(0);
        }
        if (e.getSource() == linea) {
            miPanel.linea = true;
            miPanel.rectangulo = false;
        }
        if (e.getSource() == rectangulo) {
            miPanel.linea = false;
            miPanel.rectangulo = true;
        }
        if (e.getSource() == elipse) {
            miPanel.linea = false;
            miPanel.rectangulo = false;
        }
        if (e.getSource() == relleno) {
            if (miPanel.relleno) {
                miPanel.relleno = false;
            } else {
                miPanel.relleno = true;
            }
        }
        if (e.getSource() == color) {
            Color color = JColorChooser.showDialog(this, "Elija un color así chido", this.miPanel.getColoractual());
            this.miPanel.setColoractual(color);
        }
        if (e.getSource() == acerca) {
            JOptionPane.showMessageDialog(null, "Yo lo programo todo(Casi :S)");
        }
    }
}

class MiPanel extends JPanel {

    Point p1, p2;
    Shape figura;
    Random R = new Random();
    public Color coloractual = Color.MAGENTA;
    BufferedImage myImage;
    Graphics2D g2D;
    boolean rectangulo = false;
    boolean linea = true;
    boolean relleno = false;

    public MiPanel() {
        OyenteDeRaton miOyente = new OyenteDeRaton();
        OyenteDeMovimiento miOyente2 = new OyenteDeMovimiento();
        addMouseListener(miOyente);
        addMouseListener(miOyente2);

    }

    public Color getColoractual() {
        return coloractual;
    }

    public void setColoractual(Color coloractual) {
        this.coloractual = coloractual;
    }

    public Graphics2D crearGraphics2D() {
        Graphics2D g2 = null;
        if (myImage == null || myImage.getWidth() != getSize().width || myImage.getHeight() != getSize().height) {
            myImage = (BufferedImage) createImage(getSize().width, getSize().height);
        }
        if (myImage != null) {
            g2 = myImage.createGraphics();
            g2.setColor(coloractual);
            g2.setBackground(getBackground());
        }
        g2.clearRect(0, 0, getSize().width, getSize().height);

        return g2;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (myImage == null) {
            g2D = crearGraphics2D();
        }
        if (figura != null) {
            if (relleno) {
                g2D.setColor(coloractual);
                g2D.draw(figura);
                g2D.fill(figura);
            } else {
                g2D.setColor(coloractual);
                g2D.draw(figura);
            }
            if (myImage != null && isShowing()) {
                g.drawImage(myImage, 0, 0, this);
            }
            figura = null;
        }
    }

    public void resetAll() {
        myImage = null;
        repaint();
    }

    class OyenteDeRaton extends MouseAdapter {

        public void mousePressed(MouseEvent evento) {
            MiPanel.this.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            p1 = evento.getPoint();
        }

        public void mouseReleased(MouseEvent evento) {
            MiPanel.this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            if (rectangulo) {
                p2 = evento.getPoint();
                figura = crearFigura(p1, p2);
                repaint();
            } else if (linea) {
                p2 = evento.getPoint();
                figura = crearLinea(p1, p2);
                repaint();
            } else {
                p2 = evento.getPoint();
                figura = crearElipse(p1, p2);
                repaint();
            }
            repaint();
        }
    }

    class OyenteDeMovimiento extends MouseAdapter {

        public void mouseDragged(MouseEvent evento) {
            Graphics2D g2D;
            if (rectangulo) {
                if (figura != null) {
                    g2D = (Graphics2D) MiPanel.this.getGraphics();
                    g2D.setXORMode(MiPanel.this.getBackground());
                    g2D.setColor(coloractual);
                    g2D.draw(figura);
                }
                p2 = evento.getPoint();
                figura = crearFigura(p1, p2);
                g2D = (Graphics2D) MiPanel.this.getGraphics();
                g2D.setXORMode(MiPanel.this.getBackground());
                g2D.setColor(coloractual);
                g2D.draw(figura);
            } else if (linea) {
                if (figura != null) {
                    g2D = (Graphics2D) MiPanel.this.getGraphics();
                    g2D.setXORMode(MiPanel.this.getBackground());
                    g2D.setColor(coloractual);
                    g2D.draw(figura);
                }
                p2 = evento.getPoint();
                figura = crearLinea(p1, p2);
                g2D = (Graphics2D) MiPanel.this.getGraphics();
                g2D.setXORMode(MiPanel.this.getBackground());
                g2D.setColor(coloractual);
                g2D.draw(figura);
            } else {
                if (figura != null) {
                    g2D = (Graphics2D) MiPanel.this.getGraphics();
                    g2D.setXORMode(MiPanel.this.getBackground());
                    g2D.setColor(coloractual);
                    g2D.draw(figura);
                }
                p2 = evento.getPoint();
                figura = crearElipse(p1, p2);
                g2D = (Graphics2D) MiPanel.this.getGraphics();
                g2D.setXORMode(MiPanel.this.getBackground());
                g2D.setColor(coloractual);
                g2D.draw(figura);
            }
        }
    }

    public Shape crearFigura(Point p1, Point p2) {
        double xInicio = Math.min(p1.getX(), p2.getX());
        double yInicio = Math.min(p1.getY(), p2.getY());

        double ancho = Math.abs(p2.getX() - p1.getX());
        double altura = Math.abs(p2.getY() - p1.getY());
        Shape nuevaFigura = new Rectangle2D.Double(xInicio, yInicio, ancho, altura);
        return nuevaFigura;
    }

    public Shape crearLinea(Point p1, Point p2) {
        Shape nuevaFigura = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        return nuevaFigura;
    }

    public Shape crearElipse(Point p1, Point p2) {
        double xInicio = Math.min(p1.getX(), p2.getX());
        double yInicio = Math.min(p1.getY(), p2.getY());

        double ancho = Math.abs(p2.getX() - p1.getX());
        double altura = Math.abs(p2.getY() - p1.getY());

        Shape nuevaFigura = new Ellipse2D.Double(xInicio, yInicio, ancho, altura);
        return nuevaFigura;
    }

    public void abrir() {
        try {
            JFileChooser jfc = createJFileChooser();
            jfc.showOpenDialog(this);

            File file = jfc.getSelectedFile();
            if (file == null) {
                return;
            }
            myImage = javax.imageio.ImageIO.read(file);
            int w = myImage.getWidth(null);
            int h = myImage.getHeight(null);
            if (myImage.getType() != BufferedImage.TYPE_INT_RGB) {
                BufferedImage bi2 = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
                Graphics big = bi2.getGraphics();
                big.drawImage(myImage, 0, 0, null);
            }
            g2D = (Graphics2D) myImage.getGraphics();
            repaint();
        } catch (IOException ex) {
            System.exit(1);
        }
    }

    public void guardar() {
        try {
            JFileChooser jfc = createJFileChooser();
            jfc.showOpenDialog(this);

            File file = jfc.getSelectedFile();
            if (file == null) {
                return;
            }
            javax.swing.filechooser.FileFilter ff = jfc.getFileFilter();
            String fileName = file.getName();
            String extension = "jpg";
            if (ff instanceof MyFileFilter) {
                extension = ((MyFileFilter) ff).getExtension();
            }
            fileName = fileName + "." + extension;
            file = new File(file.getParent(), fileName);
            javax.imageio.ImageIO.write(myImage, extension, file);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public JFileChooser createJFileChooser() {
        JFileChooser jfc = new JFileChooser();
        jfc.setAcceptAllFileFilterUsed(false);
        String[] fileTypes = getFormats();
        for (int i = 0; i < fileTypes.length; i++) {
            jfc.addChoosableFileFilter(new MyFileFilter(fileTypes[i], fileTypes[i] + "file"));
        }
        return jfc;
    }

    public String[] getFormats() {
        String[] formats = javax.imageio.ImageIO.getWriterFormatNames();
        java.util.TreeSet<String> formatSet = new java.util.TreeSet<String>();
        for (String s : formats) {
            formatSet.add(s.toLowerCase());
        }
        return formatSet.toArray(new String[0]);
    }
}

class MyFileFilter extends javax.swing.filechooser.FileFilter {

    private String extension;
    private String descripcion;

    public MyFileFilter(String extension, String descripcion) {
        this.descripcion = descripcion;
        this.extension = extension;
    }

    public boolean accept(File f) {
        return f.getName().toLowerCase().endsWith("." + extension) || f.isDirectory();
    }

    public String getExtension() {
        return extension;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
