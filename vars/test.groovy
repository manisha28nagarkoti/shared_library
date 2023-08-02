import com.tothenew.utility
def call(String name){
 object = new utility()
 pipeline{
  stage('print_name'){
   step{
    object.printy(name)
   }
  }
 }
 
}
