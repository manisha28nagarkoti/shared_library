

def call(String name){

   

    pipeline{
        
        stage('print'){
        step{    
           script{
              
               sh """ echo hi  """
           }
        } 
      
     
    
      }
    }

}
