class father {

String Myownstring;

public void information() {

Myownstring = "father";

System.out.println("Myownstring");

                          }

             }

public class son extends father { 

String Myownstring;

public void information() {

super.information();

Myownstring = "son";

System.out.println(Myownstring);

                           }

public static void main(String[] args ) {

son object = new son();

object.information();

                                        }


                                  }

