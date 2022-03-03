
package com.mycompany.lista3;


public class AppPrincipal {
     
    Double Slminimo(Double rendaUsuario){
        
        Double calculoSl = rendaUsuario/1100;
        
        return calculoSl;
       
   
    }
    
   String ClasseSocial(Double rendaUsuario){
       
   String classeUsuario = "";
   
       if (rendaUsuario <= 2090) {
           
            classeUsuario = "E";
           
       }
       else if (rendaUsuario <= 4.180) {
           
           classeUsuario = "D";
           
       }
       
         else if (rendaUsuario <= 10.450) {
           
         classeUsuario = "B";
           
       }
       
         else if (rendaUsuario >= 20900) {
           
       classeUsuario = "A";
           
       }
       
       return classeUsuario;
   
   
   }
   
   void classificacao (Integer idadeUser){
       
       
       if (idadeUser <= 2 ) {
           
           System.out.println("bebe");
           
       }
       else if (idadeUser <= 11) {
           
           System.out.println("criança");
           
       }
        else if (idadeUser <= 19    ) {
           
           System.out.println("adolescente");
           
       }
         else if (idadeUser <= 30) {
           
           System.out.println("jovem");
           
       }
         else if (idadeUser <= 60) {
           
           System.out.println("adulto");
           
       }
       
         else{
         
             System.out.println("idoso");
         
         }
       
   
   
   }
  
   
   
   Double DescontoProgressivo(Double valorUnitario, Integer qtdProduto){
   
        Double descontoTotal = 0.00;
       Integer cont = 0;
       while (cont < qtdProduto) {
           
           descontoTotal += 0.10;
           cont++;
           
       }
       
   
       Double valorBruto = valorUnitario * qtdProduto;
       Double descontado = valorBruto * descontoTotal;
       Double valorFinal = valorBruto - descontado;
       
       return valorFinal;
   
   
   }
   
   
   void notaFiscal(Double ValorUnitario,Integer qtdProduto, Double valorFinal ){;
   
       System.out.println(String.format("Valor do Produto: R$ %.2f \n"
              + "quantidade: %d \n"
              + "--------------------------------------\n"
           + "Valor com desconto: R$ %.2f",ValorUnitario,qtdProduto,valorFinal));
       
   
  }
   
   
   
void verificacaoPrimo(Integer nDigitado){
    
    Integer qtdDivisiveis = 0;
    
    
    for (int i = 0; i <= nDigitado; i++) {
        
        if (nDigitado % i == 0) {
            
            qtdDivisiveis++;
            
        }
        
    }
    
   
    
    if (qtdDivisiveis == 2) {
        
        System.out.println(String.format("O numero %d  é primo", nDigitado));
        
    }else{
    
         System.out.println(String.format("O numero %d não é primo", nDigitado));
            
    }


}
   
   
}

