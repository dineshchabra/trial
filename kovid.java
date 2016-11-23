public class kovid extends Thread {

private String Mystring;

public kovid(Mystring) {

Mystring = string;

                        }

public void run() {

for(int i = 1; i<=10; i++ ) {

System.out.println(Mystring + "(" + i + ")" );

                            }

                   }

public static void main(String[] args ) {

kovid k1 = new kovid("Thread 1");

kovid k2 = new kovid("Thread 2");

kovid k3 = new kovid("Thread 3");

k1.start();

k2.start();

k3.start();

                                         }

                                   }

