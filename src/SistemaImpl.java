import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;
import ucn.ArchivoEntrada;
import ucn.ArchivoSalida;
import ucn.Registro;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Implementación de la interfaz SistemaInventario.
 * Representa un sistema de inventario de instrumentos.
 */

public class SistemaImpl implements SistemaInventario {
    private ListaInstrumento listaInstrumentos;

    /**
     * Constructor de la clase SistemaImpl.
     * Inicializa la lista de instrumentos con una capacidad inicial de 500 elementos.
     */
    public SistemaImpl() {
        this.listaInstrumentos = new ListaInstrumento(500);
    }



    /**
     * Genera un archivo de inventario en formato de texto a partir de los datos de los instrumentos almacenados en la lista.
     *
     * @throws IOException si se produce un error durante la escritura del archivo de inventario.
     */
    @Override
    public void inventario() throws IOException {
        ArchivoSalida archivoSalida = new ArchivoSalida("inventario.txt");

        for (int i = 0; i < listaInstrumentos.getCantActual(); i++) {
            if (String.valueOf(listaInstrumentos.instrumentoEnPosicion(i).getClass()).contains("Cuerda")) {
                Cuerda cuerda = (Cuerda) listaInstrumentos.instrumentoEnPosicion(i);
                Registro registro = new Registro(8);
                registro.agregarCampo(cuerda.getId());
                registro.agregarCampo(cuerda.getPrecio());
                registro.agregarCampo(cuerda.getCantidad());
                registro.agregarCampo(cuerda.getInstrumento());
                registro.agregarCampo(cuerda.getTipoCuerda());
                registro.agregarCampo(cuerda.getCantCuerdas());
                registro.agregarCampo(cuerda.getMaterial());
                registro.agregarCampo(cuerda.getTipo());
                archivoSalida.writeRegistro(registro);

            }
            if (String.valueOf(listaInstrumentos.instrumentoEnPosicion(i).getClass()).contains("Percusion")) {
                Percusion percusion = (Percusion) listaInstrumentos.instrumentoEnPosicion(i);
                Registro registro = new Registro(7);
                registro.agregarCampo(percusion.getId());
                registro.agregarCampo(percusion.getPrecio());
                registro.agregarCampo(percusion.getCantidad());
                registro.agregarCampo(percusion.getInstrumento());
                registro.agregarCampo(percusion.getTipoPercusion());
                registro.agregarCampo(percusion.getMaterial());
                registro.agregarCampo(percusion.getAltura());
                archivoSalida.writeRegistro(registro);
            }
            if (String.valueOf(listaInstrumentos.instrumentoEnPosicion(i).getClass()).contains("Viento")) {
                Viento viento = (Viento) listaInstrumentos.instrumentoEnPosicion(i);
                Registro registro = new Registro(5);
                registro.agregarCampo(viento.getId());
                registro.agregarCampo(viento.getPrecio());
                registro.agregarCampo(viento.getCantidad());
                registro.agregarCampo(viento.getInstrumento());
                registro.agregarCampo(viento.getMaterial());
                archivoSalida.writeRegistro(registro);
            }

        }
    }

    /**
     * Lee los datos de los instrumentos de un archivo CSV y los almacena en la lista de instrumentos.
     *
     * @throws IOException si se produce un error durante la lectura del archivo.
     */
    @Override
    public void leerArchivos() throws IOException {
        ArchivoEntrada archivoEntrada = new ArchivoEntrada("csv_prueba.csv");

        boolean hayInstrumentos = listaInstrumentos.getCantActual() > 0;
        boolean actualizarArchivo = hayInstrumentos;
        ArchivoSalida archivoSalida = null;

        if (actualizarArchivo) {
            archivoSalida = new ArchivoSalida("inventario.txt");
        }

        while (!archivoEntrada.isEndFile()) {
            Registro registro = archivoEntrada.getRegistro();
            String id = registro.getString();
            int precio = registro.getInt();
            int cantidad = registro.getInt();
            String instrumento = registro.getString();

            if (instrumento.equalsIgnoreCase("guitarra") || instrumento.equalsIgnoreCase("bajo")
                    || instrumento.equalsIgnoreCase("violin") || instrumento.equalsIgnoreCase("arpa")) {
                String param1 = registro.getString();
                int param2 = registro.getInt();
                String param3 = registro.getString();
                String param4 = registro.getString();

                Instrumento cuerda = new Cuerda(id, precio, cantidad, instrumento, param1, param2, param3, param4);
                listaInstrumentos.ingresarInstrumento(cuerda);
            }

            if (instrumento.equalsIgnoreCase("bongo") || instrumento.equalsIgnoreCase("cajon")
                    || instrumento.equalsIgnoreCase("campanas") || instrumento.equalsIgnoreCase("tubulares") ||
                    instrumento.equalsIgnoreCase("bombo")) {
                String param1 = registro.getString();
                String param2 = registro.getString();
                String param3 = registro.getString();
                Instrumento percusion = new Percusion(id, precio, cantidad, instrumento, param1, param2, param3);
                listaInstrumentos.ingresarInstrumento(percusion);
            }

            if (instrumento.equalsIgnoreCase("trompeta") || instrumento.equalsIgnoreCase("saxofon") || instrumento.equalsIgnoreCase("clarinete")
                    || instrumento.equalsIgnoreCase("flauta traversa")) {
                String param1 = registro.getString();
                Instrumento viento = new Viento(id, precio, cantidad, instrumento, param1);
                listaInstrumentos.ingresarInstrumento(viento);
            }

        }
        archivoEntrada.close();

        if (actualizarArchivo) {
            archivoSalida.close();
        }
    }

    /**
     * Muestra el menú principal del sistema y maneja las opciones seleccionadas por el usuario.
     */
    @Override
    public void menu() {
        String opcion = null;
        while (!Objects.equals(opcion, "4")) {
            StdOut.println("""
                    ----Sistema de Inventario Beat the Rhythm----
                                        
                    [1] Agregar Instrumento
                    [2] Vender Instrumento
                    [3] Consultar Inventario
                                        
                    [4] Cierre
                    """);
            StdOut.print("Escoja una opcion: ");
            opcion = StdIn.readLine();

            switch (opcion) {
                case "1" -> agregarInstrumento();
                case "2" -> venderInstrumento();
                case "3" -> consultarInvetario();
                case "4" -> cierre();
                default -> StdOut.println("Opcion no valida, intente nuevamente");
            }
        }
    }

    /**
     * Agrega un nuevo instrumento al inventario.
     */
    private void agregarInstrumento() {
        StdOut.println("Agregar Instrumento");
        StdOut.print("Ingrese el ID del instrumento: ");
        String id = StdIn.readLine();
        StdOut.print("Ingrese el precio del instrumento: ");
        int precio = Integer.parseInt(StdIn.readLine());
        StdOut.print("Ingrese la cantidad disponible: ");
        int cantidad = Integer.parseInt(StdIn.readLine());
        StdOut.print("Ingrese el nombre del instrumento: ");
        String instrumento = StdIn.readLine();

        // Prompt for instrument-specific details
        if (instrumento.equalsIgnoreCase("guitarra") || instrumento.equalsIgnoreCase("bajo")
                || instrumento.equalsIgnoreCase("violin") || instrumento.equalsIgnoreCase("arpa")) {
            StdOut.print("Ingrese el tipo de cuerda: ");
            String tipoCuerda = StdIn.readLine();
            StdOut.print("Ingrese la cantidad de cuerdas: ");
            int cantCuerdas = Integer.parseInt(StdIn.readLine());
            StdOut.print("Ingrese el material: ");
            String material = StdIn.readLine();
            StdOut.print("Ingrese el tipo: ");
            String tipo = StdIn.readLine();

            Instrumento cuerda = new Cuerda(id, precio, cantidad, instrumento, tipoCuerda, cantCuerdas, material, tipo);
            listaInstrumentos.ingresarInstrumento(cuerda);
        } else if (instrumento.equalsIgnoreCase("bongo") || instrumento.equalsIgnoreCase("cajon")
                || instrumento.equalsIgnoreCase("campanas") || instrumento.equalsIgnoreCase("tubulares")
                || instrumento.equalsIgnoreCase("bombo")) {
            StdOut.print("Ingrese el tipo de percusión: ");
            String tipoPercusion = StdIn.readLine();
            StdOut.print("Ingrese el material: ");
            String material = StdIn.readLine();
            StdOut.print("Ingrese la altura: ");
            String altura = StdIn.readLine();

            Instrumento percusion = new Percusion(id, precio, cantidad, instrumento, tipoPercusion, material, altura);
            listaInstrumentos.ingresarInstrumento(percusion);
        } else if (instrumento.equalsIgnoreCase("trompeta") || instrumento.equalsIgnoreCase("saxofon")
                || instrumento.equalsIgnoreCase("clarinete") || instrumento.equalsIgnoreCase("flauta traversa")) {
            StdOut.print("Ingrese el material: ");
            String material = StdIn.readLine();

            Instrumento viento = new Viento(id, precio, cantidad, instrumento, material);
            listaInstrumentos.ingresarInstrumento(viento);
        } else {
            StdOut.println("Instrumento no válido");
        }
    }

    /**
     * Vende un instrumento del inventario.
     */

    private void venderInstrumento() {
        if (listaInstrumentos.getCantActual() == 0) {
            StdOut.println("El inventario está vacío. No hay instrumentos disponibles para vender.");
            return;
        }
        StdOut.print("Ingrese el código del instrumento que desea vender: ");
        String id = StdIn.readLine();

        Instrumento instrumento = listaInstrumentos.buscarInstrumento(id);

        if (instrumento == null) {
            StdOut.println("El instrumento con el código " + id + " no está registrado en el inventario.");
            return;
        }

        if (instrumento.getCantidad() <= 0) {
            StdOut.println("El instrumento con el código " + id + " está agotado.");
            return;
        }

        realizarVenta(instrumento);

       
    }

    /**
     * Realiza la venta de un instrumento, reduciendo la cantidad disponible y generando una boleta de venta.
     *
     * @param instrumento el instrumento a vender.
     */

    private void realizarVenta(Instrumento instrumento) {
        // Reducir la cantidad de instrumentos disponibles
        instrumento.setCantidad(instrumento.getCantidad() - 1);

        // Generar boleta
        generarBoleta(instrumento);
    }

    /**
     * Genera una boleta de venta para un instrumento vendido.
     *
     * @param instrumento el instrumento vendido.
     */
    private void generarBoleta(Instrumento instrumento) {
        Date fechaActual = new Date();

        // DIA, FECHA, AÑO
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String fechaFormateada = dateFormat.format(fechaActual);

        StdOut.println("------ Boleta de Venta ------");
        StdOut.println("Fecha: " + fechaFormateada);
        StdOut.println("Instrumento: " + instrumento.getInstrumento());
        StdOut.println("Precio: " + instrumento.getPrecio());
        StdOut.println("-----------------------------");
    }

    /**
     * Consulta el inventario y muestra los instrumentos disponibles.
     */
    private void consultarInvetario() {
        if (listaInstrumentos.getCantActual() == 0) {
            StdOut.println("El inventario está vacío. No hay instrumentos disponibles.");
            return;
        }

        StdOut.println("----- Inventario -----");
        for (int i = 0; i < listaInstrumentos.getCantActual(); i++) {
            Instrumento instrumento = listaInstrumentos.instrumentoEnPosicion(i);
            StdOut.println("Código: " + instrumento.getId());
            StdOut.println("Instrumento: " + instrumento.getInstrumento());
            StdOut.println("Precio: " + instrumento.getPrecio());
            StdOut.println("Cantidad: " + instrumento.getCantidad());
            StdOut.println("-----------------------");
        }
    }

    /**
     * Realiza el cierre de sesión en el sistema de inventario.
     * Guarda el inventario en un archivo y muestra un mensaje de despedida.
     */
    private void cierre() {
        try {
            inventario();

            StdOut.println("¡Cierre de sesión en el sistema de inventario de Beat the Rhythm!");
            StdOut.println("Gracias por utilizar nuestro sistema, esperamos haber facilitado tus tareas.");
            StdOut.println("Recuerda que en Beat the Rhythm siempre estamos listos para ayudarte a encontrar el instrumento perfecto para tus clientes.");
            StdOut.println("¡Sigue brindando el mejor servicio y asesoramiento musical a cada persona que entre en la tienda!");
            StdOut.println("¡Hasta la próxima! (＾▽＾)");


        } catch (IOException e) {
            StdOut.println("Error al guardar el inventario. El cierre no se completó correctamente.");
        }
    }
}