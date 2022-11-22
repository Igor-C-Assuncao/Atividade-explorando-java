package dados;

import java.util.Base64;

import negocio.aluno.Aluno;
import negocio.aluno.Endereco;

public class Encrypt {

    // Creating byte array
    public static void main(String[] args) {

        Endereco end = new Endereco("Rua do Principe ", 526);

        Aluno aluno = new Aluno("0000123456", "igor ", end);

        
            
          
        
        String alunoEncoder = aluno.toString();

        
    
         
                // Getting MIME encoder  
                Base64.Encoder encoder = Base64.getMimeEncoder();  
                String message = alunoEncoder;  
                String eStr = encoder.encodeToString(message.getBytes());  
                
                System.out.println("--------------------------");
                System.out.println("\n Encoded MIME message: \n"+eStr);  
                System.out.println("\n --------------------------");
                
                
                // Getting MIME decoder  
                Base64.Decoder decoder = Base64.getMimeDecoder();  
                // Decoding MIME encoded message  
                String dStr = new String(decoder.decode(eStr));  
                
                System.out.println("--------------------------");
                System.out.println("Decoded message: "+dStr);   
                System.out.println("--------------------------");
            }  
}

