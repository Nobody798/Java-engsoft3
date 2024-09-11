package Atividade;

public class Line {
	
	    
	    private static Line instancia;

	    
	    private Line() {
	        
	    }

	    
	    public static Line getInstancia() {
	        if (instancia == null) {
	            
	            synchronized (Line.class) {
	                if (instancia == null) {
	                    instancia = new Line();
	                }
	            }
	        }
	        return instancia;
	    }

	    
	    public void adicionarDocumento(String documento) {
	        
	    }

	    public void processarDocumentos() {
	        
	    }
	}


