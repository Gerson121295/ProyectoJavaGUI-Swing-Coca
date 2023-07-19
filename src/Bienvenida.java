import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Interfaz grafica para la Bienvenida: User escribira su nombre
public class Bienvenida extends JFrame implements ActionListener {

    //Componentes a usar en nuestra interfaz
    private JTextField textField1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;


    //Constructor para darle diseño a nuestros componentes
    public Bienvenida(){
        setLayout(null); //Para las coordenadas
        setTitle("Bienvenido"); //Titulo de la interfaz
        getContentPane().setBackground(new Color(255,0,0)); //Agrega el color rojo a la pantalla
        //setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());  //Agregar imagen como icono en el titulo de la interfaz
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());  //Agregar imagen como icono en el titulo de la interfaz

        //Colocar imagen dentro del Label

        ImageIcon imagen = new ImageIcon("src/images/logo-coca.png"); //Guardar la imagen dentro de un objeto ImagenIcon llamado imagen
        label1 = new JLabel(imagen); ////Colocar imagen dentro del Label1
        label1.setBounds(25,15,300,150);//Ubicacion y tamaño del label
        add(label1); //Todo el diseño anterior se agrega a label1

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18)); //Formato de letra del label2, Formato de texto: Texto normal = 0, negrita = 1, Cursiva 2, negrita y cursiva = 3.
        label2.setForeground(new Color(255,255,255)); //Color del texto: blanco. Formato RGB: Red Green Bleu
        add(label2); //agregar el diseño anterior al label2

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12)); //Formato de letra del label2, Formato de texto: Texto normal = 0, negrita = 1, Cursiva 2, negrita y cursiva = 3.
        label3.setForeground(new Color(255,255,255)); //Color del texto: blanco. Formato RGB: Red Green Bleu
        add(label3); //agregar el diseño anterior al label3

        label4 = new JLabel("©2023 The Coca-Cola Company"); //© simbolo de CopyRight = alt 184
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12)); //Formato de letra del label2, Formato de texto: Texto normal = 0, negrita = 1, Cursiva 2, negrita y cursiva = 3.
        label4.setForeground(new Color(255,255,255)); //Color del texto: blanco. Formato RGB: Red Green Bleu
        add(label4); //agregar el diseño anterior al label4

        textField1 = new JTextField();
        textField1.setBounds(45,240,255,25);
        textField1.setBackground(new Color(224,224,224,224)); //color del textField1
        textField1.setFont(new Font("Andale Mono",1,14)); //Tipo de texto, estilo, tamaño
        textField1.setForeground(new Color(255,0,0)); //color del texto
        add(textField1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(255,255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);//Habilitar para agregar evento a este boton
        add(boton1);

    }

    //Funcionalidad del evento
    @Override
    public void actionPerformed(ActionEvent e) {//El evento se guardara en la variable e de tipo ActionEvent
        if (e.getSource() == boton1){ //getSource recupere el evento de la variable e y lo compare con el boton1

            System.exit(0);
        }
    }


    //Diseño de la interfaz en el metodo main
    public static void main(String[] args) {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0,0,350,450); //Ubicacion y tamaño de la interfaz
        ventanaBienvenida.setVisible(true); //Para que la interfaz sea visible.
        ventanaBienvenida.setResizable(false); //User no puede modificar el tamaño de la interfaz
        ventanaBienvenida.setLocationRelativeTo(null); //La interfaz aparecerá en el centro de la pantalla

    }

}
