public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String correo;
    private static int numeroPersonas =0;

    // Constructor vacio
    public Persona() {
        this.id = ++Persona.numeroPersonas;
    }

    // Constructor con argumentos
    public Persona(String nombre, String tel, String correo) {
        this(); // Llama al constructor vacio para inicializar id
        this.nombre = nombre;
        this.tel = tel;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", tel=" + tel + ", correo=" + correo + "]";
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "123456789", "juan@gmail.com");
        System.out.println(persona1);
    }
}
