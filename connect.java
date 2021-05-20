int codE = Cod.getText();  //no se si es entero o string si es entero lo parseas
String nombreE = NombreEntrega.getText();
String descripcionE = Descripcion.getText();
int idAsignatura = AsignacionSeleccionada.getIdAsig();
int codEstudiante = EstudianteSeleccionao.getIdEstudiante();

JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        archivo.setFileFilter(fi);
        int Ventana = archivo.showOpenDialog(null);
        
        File archivo1 = archivo.getSelectedFile(); (Así se sube solo la ubicación);
       FileInputStream input = new FileInputStream(archivo1);



try{
         conex=DriverManager.getConnection("jdbc:mysql://localhost/thats_study","root","");

         // esto lo agregue yo 

        String sql = "INSERT INTO entrega (ID_Entrega, Nombre, Descripcion,Documento, ID_Asig, Cod_E) VALUES (?,?,?,?,?,?)";

         preparedStatement st=conex.prepareStatement(sql);
         st.setInt(1,codE);
         st.setEstring(2,nombreE);
         st.setEstring(3,descripcionE);
         st.setBinaryStream(4,input);
         st.setInt(5,idAsignatura);
         st.setInt(6,codEstudiante);
         st.executeUpdate();
            // hasta aqui 

            // esto es lo tuyo 

        //  Statement st=conex.createStatement();
        //  st.executeUpdate("INSERT INTO entrega (ID_Entrega, Nombre, Descripcion,Documento, ID_Asig, Cod_E) VALUES ('"+Cod.getText()+"','"+NomEntrega.getText()+"','"+Descripcion.getText()+"','"+archivo1+"','"+AsignacionSeleccionada.getIdAsig()+"','"+EstudianteSeleccionao.getIdEstudiante()+"')");
         JOptionPane.showMessageDialog(null, "Entrega subida");
         JOptionPane.showMessageDialog(null, archivo1);
        }catch(SQLException ex){
         Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE,null,ex); 
         JOptionPane.showMessageDialog(null, "No es posible la conexión");
        }









        int codE = Integer.parseInt(Cod.getText());
        String nombreE = NomEntrega.getText();
        String descripcionE = Descripcion.getText();
        Estudiante EstudianteSeleccionao = (Estudiante) Estudiante.getSelectedItem();
        Asignacion AsignacionSeleccionada = (Asignacion) Asignacion.getSelectedItem();
        
        try{
                //FileInputStream input;
                conex=DriverManager.getConnection("jdbc:mysql://localhost/thats_study","root","");
                Statement st=conex.createStatement();
                String sql="INSERT INTO entrega (ID_Entrega, Nombre, Descripcion, ID_Asig, Cod_E) VALUES ('"+codE+"','"+nombreE+"','"+descripcionE+"','"+AsignacionSeleccionada.getIdAsig()+"','"+EstudianteSeleccionao.getIdEstudiante()+"')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Entrega subida");
            }catch(SQLException ex){
                Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE,null,ex);
                JOptionPane.showMessageDialog(null, "No es posible la conexión");
            }



JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        archivo.setFileFilter(fi);
        int Ventana = archivo.showOpenDialog(null);
        
        File archivo1 = archivo.getSelectedFile(); (Así se sube solo la ubicación)


            try{
         conex=DriverManager.getConnection("jdbc:mysql://localhost/thats_study","root","");
         Statement st=conex.createStatement();
         st.executeUpdate("INSERT INTO entrega (ID_Entrega, Nombre, Descripcion,Documento, ID_Asig, Cod_E) VALUES ('"+Cod.getText()+"','"+NomEntrega.getText()+"','"+Descripcion.getText()+"','"+archivo1+"','"+AsignacionSeleccionada.getIdAsig()+"','"+EstudianteSeleccionao.getIdEstudiante()+"')");
         JOptionPane.showMessageDialog(null, "Entrega subida");
         JOptionPane.showMessageDialog(null, archivo1);
        }catch(SQLException ex){
         Logger.getLogger(Crea_grupos.class.getName()).log(Level.SEVERE,null,ex); 
         JOptionPane.showMessageDialog(null, "No es posible la conexión");
        }






        File archivo1 = archivo.getSelectedFile(); (Así se sube solo la ubicación);


        File pdf = new File ("C:\\Users\\user\\Documents,PDF.pdf");
        system.out.print("existe : " + pdf.exists()); // si arroja true es porq si a capturado la ruta
       FileInputStream input = new FileInputStream(pdf);



