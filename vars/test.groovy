import com.tothenew.utility
def call(String name){
 object = new utility()
 pipeline{
  agent any 
  stages{
      stage('print_name'){
       steps{
         object.printy(name)
       }
     }
     stage('print_name1'){
       steps{
         object.printy(name)
       }
     }
 }
 
}
} 
 
