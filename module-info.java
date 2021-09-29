package  br.com.dio ;

import  br.com.dio.model.Gato ;

public  class  PrimeiroPrograma {

	public  static  void  main ( String [] args ) {
		Gato gato =  novo  Gato ();
		Livro livro =  novo  Livro ();

		Sistema . para fora . println (gato);
		Sistema . para fora . println (livro);

	}
}

classe  Livro {
	public  String nome;
	public  Integer numPaginas;
}