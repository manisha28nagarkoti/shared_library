import com.tothenew.utility
def call(String name){
 object = new utility()
 pipeline{
  agent any 
  stages{
      stage('print_name'){
       step{
         object.printy(name)
       }
     }
     stage('print_name1'){
       step{
         object.printy(name)
       }
     }
 }
 
}
} 
 
