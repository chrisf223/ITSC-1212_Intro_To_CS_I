public class ITSC1212Lab9 {
    public static void main(String[] args){
        char symbol = '%';

        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 4; col++){
                if (symbol == '%'){
                    for (int percent = 0; percent < 4; percent++){
                    System.out.print(symbol);
                    }
                    symbol = '#';
                    
                }
                else {
                    for (int hashtag = 0; hashtag < 4; hashtag++){
                    System.out.print(symbol);
                    }
                    symbol = '%';
                    
                }         
                System.out.print(" ");
            }   
            if (symbol == '%'){
                symbol = '#';
            }
            else {
                symbol = '%';
            }
            System.out.println("");
        }
    }
}
        

    
