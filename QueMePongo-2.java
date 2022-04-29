

public class Prenda {
    TipoPrenda tipoPrenda;
    Categoria categoria;
    Material material;
    Color colorPrimario;
    Color colorSecundario;

    public Prenda(TipoPrenda tipoPrenda, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario) {
        if(tipo == null || categoria == null || material == null || colorPrimario == null) {
            throw new Exception(
              "Faltan datos de la prenda"
            );
            if (!categoria.equals(tipoPrenda.getCategoria())) {
                throw new Excepcion(
                    "No corresponde la categoria de la prenda con su tipo");
              };
       this.tipoPrenda = tipoPrenda;
       this.categoria = categoria;
       this.material = material;
       this.colorPrimario = colorPrimario;
       this.colorSecundario = colorSecundario;
    }
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

}

class Color{
    Int red;
    Int green;
    Int blue;
}

enum Categoria{
  PARTE_SUPERIOR,
  CALZADO,
  PARTE_INFERIOR,
  ACCESORIOS
}


// Iteracion 2


enum Trama{
  LISA,
  RAYADA,
  LUNARES,
  ESTAMPADO
}


class Borrador {
//La clase borrador puede usarse en vez de la clase Prenda para la generacion?
    TipoPrenda tipoPrenda;
    Categoria categoria;
    Material material;
    Color colorPrimario;
    Color colorSecundario;
    Trama trama;

    public PrendaBorrador(TipoPrenda tipoPrenda, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario, Trama trama){

      this.tipoPrenda = tipoPrenda;
      this.categoria = categoria;
      this.material = material;
      this.colorPrimario = colorPrimario;
      this.colorSecundario = colorSecundario;
      this.trama = trama.LISA;

    }

    public method setTipoPrenda(tipoPrenda){
      //validacion para que no sea null aca?
      this.tipoPrenda = tipoPrenda
    }
    //
    // se repite para los demas atributos
    //

    public method crearPrenda()
    // validaciones que antes habia en Prenda?
    return new PrendaBorrador(tipo, categoria, material, colorPrincipal, colorSecundario, trama)

}
