/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.utilitarios;
import java.util.Scanner;
/**
 *
 * @author @JONATAN
 */
public class Test {   
public static void main(String[] args) {		
		STRCrypto cryp=new STRCrypto();
                DBConexion db=new DBConexion();
                Scanner leer= new Scanner(System.in);
                String texto1="0",texto2,men="\t\t1.-Probar Conexion DB\n\t\t2.-Encriptar/Desencriptar Cadena\n\t\t0.-Salir",
                      menb="\t\t1.-Iniciar Conexion \n\t\t2.-Cerrar Conexion DB \n\t\t0.-Volver",
                      menE="\t\t1.-Encryptar Texto \n\t\t2.-Desencriptar Texto \n\t\t0.-Volver"  ;
                System.out.println(men);
                int op1,op2,op=leer.nextInt();
               
                do{
                    switch(op)
                    {
                        case 1:{System.out.println(menb);
                                            op1=leer.nextInt();
                                do{switch(op1){
                                    case 1:{db.getConexion();}break;
                                    case 2:{db.closeConexion();}break;
                                    default :op1=0;    
                                }
                                System.out.println(menb);
                                            op1=leer.nextInt();
                                }while(op1!=0);
                        }break;
                        case 2:{
                                System.out.println(menE);
                                op2=leer.nextInt();
                               do{ switch(op2){
                                    case 1:{System.out.println("Ingrese Texto:");
                                             texto1=leer.next();
                                       try{
                                        System.out.println(texto1+" : "+cryp.encrypt(texto1));
                                            }catch (Exception e) {
                                                    System.out.println(e.getMessage());
                                            }
                                    }break;
                                    case 2:{System.out.println("Ejemplo:wMneWIczTLc=\nIngrese Texto:");
                                             texto2=leer.next();
                                       try{
                                        System.out.println(texto2+" : "+cryp.decrypt(texto2));
                                            }catch (Exception e) {
                                                    System.out.println(e.getMessage());
                                            }
                                    }break;
                                    default :op2=0;    
                                }
                                System.out.println(menE);
                                op2=leer.nextInt();
                               }while(op2!=0);
                        }break;
                    }
                System.out.println(men);
                op=leer.nextInt();
                }while(op!=0);		
	}
}