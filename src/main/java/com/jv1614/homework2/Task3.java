
package com.jv1614.homework2;

public class Task3 {
    
         public static void main (String [] args) {
             
                printResult ();        
                
         }

             static void printResult() {
                 System.out.print ("Предложение 1: ");
             result ();
             System.out.print ("Предложение 2: ");
             result ();
             System.out.print ("Предложение 3: ");
             result ();
             System.out.print ("Предложение 4: ");
             result ();
             System.out.print ("Предложение 5: ");
             result ();
             System.out.print ("Предложение 6: ");
             result ();
             System.out.print ("Предложение 7: ");
             result ();
             System.out.print ("Предложение 8: ");
             result ();
             System.out.print ("Предложение 9: ");
             result ();
             System.out.print ("Предложение 10: ");
             result ();
             }
                
               static void result () {
                            int x = (int) (Math.random()*10);
                            int y = (int) (Math.random()*10);
                            int z = (int) (Math.random()*10);
                            int k = (int) (Math.random()*10);
                           
                            String [][] arrayStrok = new String [10][4];

                             arrayStrok [0][0] = "Дорогие друзья! ";
                             arrayStrok [0][1] = "реализация намеченных плановых заданий ";
                             arrayStrok [0][2] = "играет важную роль в формировании ";
                             arrayStrok [0][3] = "существующих финансовых и административных условий";

                             arrayStrok [1][0] = "С другой стороны ";
                             arrayStrok [1][1] = "рамки и место обучения кадров ";
                             arrayStrok [1][2] = "требуют от нас анализа ";
                             arrayStrok [1][3] = "дальнейших направлений развитая";

                             arrayStrok [2][0] = "Равным образом ";
                             arrayStrok [2][1] = "постоянный количественный рост и сфера нашей активности ";
                             arrayStrok [2][2] = "требуют определения и уточнения ";
                             arrayStrok [2][3] = "системы массового участия";

                             arrayStrok [3][0] = "Не следует, однако, забывать о том, что ";
                             arrayStrok [3][1] = "новая модель ";
                             arrayStrok [3][2] = "способствует подготовке и реализации ";
                             arrayStrok [3][3] = "позиций, занимаемых участниками в отношении поставленных задач";

                             arrayStrok [4][0] = "Таким образом, ";
                             arrayStrok [4][1] = "организационной деятельности ";
                             arrayStrok [4][2] = "обеспечивает широкому кругу специалистов участие в формировании ";
                             arrayStrok [4][3] = "новых предложений";

                             arrayStrok [5][0] = "Повседневная практика показывает, что ";
                             arrayStrok [5][1] = "дальнейшее развитие различных форм деятельности ";
                             arrayStrok [5][2] = "позволяет выполнить ";
                             arrayStrok [5][3] = "направлений прогрессивного развития";

                             arrayStrok [6][0] = "Значимость этих проблем настолько очевидна, что ";
                             arrayStrok [6][1] = "постоянное информационно-пропагандистское обеспечение нашей деятельности ";
                             arrayStrok [6][2] = "важнейшие задания по разработке ";
                             arrayStrok [6][3] = "системы обучения кадров \n" +
                     "соответствующей насущным потребностям";

                             arrayStrok [7][0] = "Разнообразный и богатый опыт ";
                             arrayStrok [7][1] = "укрепления и развития структуры ";
                             arrayStrok [7][2] = "в значительной степени обуславливает создание ";
                             arrayStrok [7][3] = "соответствующих условий активизации";

                             arrayStrok [8][0] = "Задача организации, в особенности же ";
                             arrayStrok [8][1] = "консультация с широким активом ";
                             arrayStrok [8][2] = "позволяет оценить значение ";
                             arrayStrok [8][3] = "модели развития";

                             arrayStrok [9][0] = "Соображения высшего порядка, а также ";
                             arrayStrok [9][1] = "начало повседневной работы по формированию позиции ";
                             arrayStrok [9][2] = "представляет собой интересный эксперимент проверки ";
                             arrayStrok [9][3] = "форм воздействия";

                             System.out.print (arrayStrok [x][0]);
                             System.out.print (arrayStrok [y][1]);
                             System.out.print (arrayStrok [z][2]);
                             System.out.println (arrayStrok [k][3]+";");

                  }
}
    

