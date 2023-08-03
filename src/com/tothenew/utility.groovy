package com.tothenew

def printy(String name){
    pipeline{
    agent any 
   stages{
      stage('print_name'){
       steps{
         script{
            sh ''' echo $name'''
         }
       }
     }
     stage('print_name1'){
       steps{
         script{
            sh '''echo $name'''
         }
       }
     }
 }
}
