public abstract class Publicacion {
        protected String codIsbn;
        protected String titulo;
        protected int año;
    
        public Publicacion(String codIsbn, String titulo, int año) {
            this.codIsbn = codIsbn;
            this.titulo = titulo;
            this.año = año;
        }
    
        public String getcodIsbn() {
            return codIsbn;
        }
    
        public String getTitulo() {
            return titulo;
        }
    
        public int getAño() {
            return año;
        }
    
        @Override
        public String toString() {
            return "ISBN: " + codIsbn + ", Titulo: " + titulo + ", Año: " + año;
        }
    }
    

