
package com.jv1614.homework2;

public class Task2 {
    
    public static void main (String [] args) {
        
        int x = 76;
              
            if (x<=19 && x>0) { switch1 (x);
            }
            else {
                
                if (x>19 && x<100) {            
                int y = x%10;
                x = x/10;
             
                 switch2(x);
                 switch1(y);
                }
                else {System.out.println("Попробуй еще разок :)");
                }
            }   
    }
    
        static void switch1 (int x) {
            switch(x){
            case 1: System.out.println("один");
            break;
            case 2: System.out.println("два");
            break;
            case 3: System.out.println ("три");
            break;
            case 4: System.out.println ("четыре");
            break;
            case 5: System.out.println ("пять");
            break;
            case 6: System.out.println ("шесть");
            break;
            case 7: System.out.println ("семь");
            break;
            case 8: System.out.println ("восемь");
            break;
            case 9: System.out.println ("девять");
            break;
            case 10: System.out.println ("десять");
            break;
            case 11: System.out.println ("одинадцать");
            break;
            case 12: System.out.println ("двенадцать");
            break;
            case 13: System.out.println ("тринадцать");
            break;
            case 14: System.out.println ("четырнадцать");
            break;
            case 15: System.out.println ("пятнадцать");
            break;
            case 16: System.out.println ("шестнадцать");
            break;
            case 17: System.out.println ("семнадцать");
            break;
            case 18: System.out.println ("восемнадцать");
            break;
            case 19: System.out.println ("девятнадцать");
            break;
            }
        }  
        
        static void switch2 (int x) {
                switch(x) {
                    
                    case 2: { System.out.print("двадцать ");                    
                    }break;
                    
                    case 3: { System.out.print("тридцать ");                                       
                    }break;
                    
                    case 4: { System.out.print("сорок ");                                        
                    }break;
                    
                    case 5: { System.out.print("пятьдесят ");                                        
                    }break;
                    
                    case 6: { System.out.print("шестьдесят ");                                        
                    }break;
                    
                    case 7: { System.out.print("семьдесят ");                                        
                    }break;
                    
                    case 8: { System.out.print("восемьдесят ");                                        
                    }break;
                    
                    case 9: { System.out.print("девятьдесят ");                                        
                    }break;

                 }
        }

}
