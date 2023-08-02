import com.tothenew.utility

def call(String name){

    object = new  utility()

    pipeline{
        agent any
        stage('print'){
        step{    
           script{
               sh """ echo hiii """
               object.print(name)
           }
        } 
      
     
    
      }
    }

}
