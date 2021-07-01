
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.util.List;


    public class Prueba {
    public static void main(String [] args) {
    Prueba evaluar = new Prueba();
    //evaluar.listarCategoria();
    //evaluar.editarCategorias();
    //evaluar.guardarCategorias();
    evaluar.eliminarCategoria();
}

    /*public void listarCategorias() {
       CategoriaDAO categoria = new CategoriaDAOImplementar();
       List<Categoria> listar = categoria.Listar();
       System.out.println("Listado de categorias");
       for(Categoria categoriaListar : listar){
       System.out.println("ID: " + categoriaListar.getId_categoria() +
                           "NOMBRE: " + categoriaListar.getNom_categoria() +
                           "ESTADO: " + categoriaListar.getEstado_categoria());
    }
 } */
    
    /*public void editarCategorias() {
       CategoriaDAO categoria = new CategoriaDAOImplementar();
       Categoria cat_edit = categoria.editarCat(1);
       System.out.println("Categoria a modificar");
       System.out.println("ID: " + cat_edit.getId_categoria() +
                           "NOMBRE: " + cat_edit.getNom_categoria() +
                           "ESTADO: " + cat_edit.getEstado_categoria());
    }*/
    
  /* public void guardarCategorias(){
   CategoriaDAO categoria = new CategoriaDAOImplementar();
       Categoria guarda_cat = new Categoria();
       guarda_cat.setNom_categoria("Bebidas");
       guarda_cat.setEstado_categoria(1);
       categoria.guardarCat(guarda_cat);
   }*/
    
    /*public void guardarCategorias(){
   CategoriaDAO categoria = new CategoriaDAOImplementar();
       Categoria guarda_cat = new Categoria();
       guarda_cat.setNom_categoria("Bebidas Naturales");
       guarda_cat.setId_categoria(5);
       guarda_cat.setEstado_categoria(1);
       categoria.guardarCat(guarda_cat);
 } */
 
    public void eliminarCategoria(){
   CategoriaDAO categoria = new CategoriaDAOImplementar();
       categoria.borrarCat(2);
    
    }
 }
  