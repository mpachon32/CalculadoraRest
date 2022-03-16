package CalculadoraRest.demo;

//@author Nigth Crawler

public class OperacionesConversor {
    
    
    public String aMoneda (double cantidad, String moneda){
        
        return " "+Math.round(cantidad*100.0)/100.0;
    }
    public double convertirMoneda (double cantidad, String currencyIn, String currencyOut){
        double conversion = 0;
        switch (currencyIn){
            case "EUR":
                
                if(currencyOut.equals("USD")){
                    conversion=cantidad*1.10;
                }else if (currencyOut.equals("MXN")){
                    conversion = cantidad * 22.74;
                }else if (currencyOut.equals("COP")){
                    conversion = cantidad * 4216.44;                
                }else{
                    conversion=cantidad;
                }
                break;
            case "USD":
                if(currencyOut.equals("EUR")){
                    conversion=cantidad*0.91;
                }else if (currencyOut.equals("MXN")){
                    conversion = cantidad * 20.63;
                }else if (currencyOut.equals("COP")){
                    conversion = cantidad * 3823.63;   
                }else{//USD
                    conversion=cantidad;
                }
                break;
            case "COP":
                if(currencyOut.equals("EUR")){
                    conversion=cantidad*0.00024;
                }else if (currencyOut.equals("USD")){
                    conversion = cantidad * 0.00026;
                }else if (currencyOut.equals("MXN")){
                    conversion = cantidad * 0.0054;
                }else{
                    conversion=cantidad;
                }
                break; 
            case "MXN":
                if(currencyOut.equals("EUR")){
                    conversion=cantidad*0.044;
                }else if (currencyOut.equals("USD")){
                    conversion = cantidad * 0.048;
                }else if (currencyOut.equals("COP")){
                    conversion = cantidad * 185.78; 
                }else{
                    conversion=cantidad;
                }
                break;                    
        }
        
        //return aMoneda(conversion, a);
        return conversion;
    }
}
