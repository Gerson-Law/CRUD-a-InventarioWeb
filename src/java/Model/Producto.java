package Model;

public class Producto {
    private int id_producto;
    private String nom_producto;
    private float stock;
    private float precio;
    private String unidad_medida;
    private int estado_producto;
    private int categoria_id;
    
    private Categoria categoria;

    public Producto() {
        this.id_producto = 0;
        this.categoria = new Categoria();
        
    }

    public Producto(int id_producto, String nom_producto, float stock, float precio, String unidad_medida, int estado_producto, int categoria_id, Categoria categoria) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.stock = stock;
        this.precio = precio;
        this.unidad_medida = unidad_medida;
        this.estado_producto = estado_producto;
        this.categoria_id = categoria_id;
        this.categoria = categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(int estado_producto) {
        this.estado_producto = estado_producto;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        // genera dos constructores
    }
    
    
    
    
}
