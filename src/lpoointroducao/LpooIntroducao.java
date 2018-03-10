package lpoointroducao;



/**
 *
 * @author Harrison
 */
public class LpooIntroducao {

    public static void main(String[] args) {

       
       GerenteCurioso g = new GerenteCurioso(); 
       
       
        Pessoa p = new Pessoa();
        p.setNome("ana");
        p.setDate("14/05/1998");
        p.setSexo('F');
        p.setCpf("425.127.814-37");

        Conta c1 = new Conta();
        
        c1.setNome(p);
        c1.setAgencia(0014);
        c1.setNumero(1234);
        c1.setSenha(0051);
        c1.setSaldo(300.56);
        
        
        
        // ----------------------------------------------------//
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Joao");
        p3.setDate("20/01/1996");
        p3.setSexo('M');
        p3.setCpf("151.076.458-52");

       
        Conta c2 = new Conta();

        c2.setNome(p3);
        c2.setAgencia(0015);
        c2.setNumero(1010);
        c2.setSenha(0052);
        c2.setSaldo(400.56);

        
    
       System.out.println(g.clienteMaiorValor(c1, c2).getNome());
       System.out.println();
       System.out.println(c1.clienteMaiorValor1(c2));
       
               
        
    }

}
