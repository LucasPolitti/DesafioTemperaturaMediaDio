import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class NonoProjetoJava {

    
    public static void main(String[] args) {
        
        Map <String, Double> temperaturaMedia = new HashMap<>() {{


          put ( "Janeiro", 30.0);
          put ( "Fevereiro", 28.0);
          put ( "Março", 27.0);
          put ( "Abril", 24.0);
          put ( "Maio", 21.0);
          put ( "Junho", 19.0);

        }};

        System.out.println(temperaturaMedia);

       Iterator <Double> iterator = temperaturaMedia.values().iterator();
       Double soma = 0.0;
       while (iterator.hasNext()) {
        soma += iterator.next();
        
       }

               System.out.println(soma/temperaturaMedia.size());


               Iterator <Double> iterator1 = temperaturaMedia.values().iterator();
               while (iterator1.hasNext()) {
                if (iterator1.next() <= (24.83)) iterator1.remove();

               }

               System.out.println(temperaturaMedia);



    


    }




}


