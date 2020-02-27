package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1,"Pessoa Fisica"),
	PESSOAJURIDICA(2,"Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	
	//CONTRUTOR DE TIPO ENUMERADO E PRIVATE SEMPRE!
	
	private TipoCliente(int cod,String descricao) {
		
	this.cod = cod;
	this.descricao = descricao;
				
	} 
	
	public int getCod() {
		
	return this.cod;	
		
	}
	
	
	public String getDescricao() {
		
	return this.descricao;	
		
	}
	
	
    public static TipoCliente toEnum(Integer cod) {
    	
    	if(cod == null) {
    		
    		return null;
    		
    	}
    	
    	for(TipoCliente x: TipoCliente.values()) {
    		
    		if(cod.equals(x.getCod())) {
    			
    			return x;
    			
    		}    		
    		
    	}
    	    	    	
    	throw new IllegalArgumentException("Id invalido " + cod);
    	    	
    }
	
	
	
	
}
