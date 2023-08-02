import com.tothenew.utility

def call(String name){

    object = new  utility()

    pipeline{
      stages{
        stage('print'){
        steps{    
           script{
               object.print(name)
           }
        } 
      }
     
    
      }
    }

}