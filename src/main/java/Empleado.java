public abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String departamento;
    protected float salario;

    public Empleado(int id, String nombre, String departamento, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void mostrarDetalles(){
        System.out.println("############################");
        System.out.println("ID USUARIO: "+getId());
        System.out.println("NOMBRE: "+getNombre());
        System.out.println("DEPARTAMENTO: "+getDepartamento());
        System.out.println("SALARIO: S/."+getSalario());
    }

    public abstract void calcularBono();


}
